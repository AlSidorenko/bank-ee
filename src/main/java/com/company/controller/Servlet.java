package com.company.controller;

import com.company.controller.command.*;
import com.company.controller.command.admin.AdminBasisCommand;
import com.company.controller.command.user.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Created on 08.04.2020 19:23.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
//@WebServlet(urlPatterns = "/app/*")
public class Servlet extends HttpServlet {

    private Map<String, Command> commands = new HashMap<>();

    @Override
    public void init(ServletConfig servletConfig) {
        //TODO: Work it out.
        servletConfig.getServletContext().setAttribute("loggedUsers", new HashSet<String>());

        commands.put("main", new MainCommand());
        commands.put("login", new LoginCommand());
        commands.put("registration", new RegistrationCommand());
        commands.put("logout", new LogoutCommand());
        commands.put("exception", new ExceptionCommand());
        commands.put("deposits", new DepositsCommand());
        commands.put("credits", new CreditsCommand ());

        commands.put("user", new UserBasisCommand());
        commands.put("user/bills", new UserBillsCommand());
        commands.put("user/transfers", new UserTransfersCommand());
        commands.put("user/credits", new UserCreditsCommand());
        commands.put("user/deposits", new UserDepositsCommand());
        commands.put("user/info", new UserInfoCommand());
        commands.put("user/addCurrentAccount", new UserAddCurrentAccountCommand());
        // add Deposits
        commands.put("user/addClassicDeposit", new UserAddClassicDepositCommand());
        // TODO ...
        //commands.put("user/addSavingDeposit", new UserAddSavingDepositCommand());

        commands.put("admin", new AdminBasisCommand());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //TODO: Work it out.
        String path = request.getRequestURI();
        System.out.println(path);
        path = path.replaceAll(".*/app/","");
        System.out.println(path);
        Command command = commands.getOrDefault(path, (req, resp) -> "/index.jsp");
        String page = command.execute(request, response);

        if (page.contains("redirect")) {
            response.sendRedirect(page.replace("redirect:", "/app"));
        } else {
            request.getRequestDispatcher(page).forward(request, response);
        }
    }
}
