package com.company.controller.command.user;

import com.company.controller.command.Command;
import com.company.model.dao.DaoFactory;
import com.company.model.dao.impl.JDBCAccountDao;
import com.company.model.dao.impl.JDBCCurrentAccountDao;
import com.company.model.entity.AccountOperation;
import com.company.model.entity.CurrentAccount;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 17.04.2020 21:24.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class UserAddCurrentAccountCommand implements Command {

    private DaoFactory factory = DaoFactory.getInstance();
    private JDBCAccountDao accountDao = factory.createJDBCAccountDao();
    private JDBCCurrentAccountDao currentAccountDao = factory.createJDBCCurrentAccountDao();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String login = (String) request.getSession().getServletContext().getAttribute("login");
        int idAccount = accountDao.getAccountByLogin(login).getIdAccount();
        String currency = request.getParameter("currency");

        CurrentAccount currentAccount = new CurrentAccount();
        AccountOperation accountOperation = new AccountOperation();

        if (currency != null) {
            currentAccountDao.addNewCurrentAccount(currentAccount, idAccount, currency);
            currentAccountDao.openCurrentAccountOperation(accountOperation, idAccount);
            return "redirect:/user/info";
        }
        return "/WEB-INF/user/addCurrentAccount.jsp";
    }
}
