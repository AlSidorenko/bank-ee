package com.company.controller.command;

import com.company.model.dao.DaoFactory;
import com.company.model.dao.impl.JDBCAccountDao;
import com.company.model.dao.impl.JDBCUserDao;
import com.company.model.entity.Account;
import com.company.model.entity.AccountOperation;
import com.company.model.entity.CurrentAccount;
import com.company.model.entity.User;
import com.company.model.entity.enums.CURRENCY;
import com.company.model.entity.enums.ROLE;
import com.company.model.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 08.04.2020 22:49.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class RegistrationCommand implements Command {

    private DaoFactory factory = DaoFactory.getInstance();
    private JDBCUserDao userDao = factory.createJDBCUserDao();
    private JDBCAccountDao accountDao = factory.createJDBCAccountDao();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        if (firstName == null || firstName.equals("") || lastName == null || lastName.equals("") || login == null
                || login.equals("") || password == null || password.equals("")) {
            return "/registration.jsp";
        }
        System.out.println(firstName + " " + lastName + " " + login + " " + password);

        User user = new User();
        user.setUserRole(ROLE.USER);
        user.setUserFirstName(firstName);
        user.setUserLastName(lastName);
        user.setUserEmail(email);
        user.setUserPhone(phone);
        user.setUserLogin(login);
        user.setUserPassword(password);

        Account account = new Account();
        account.setEmailAccount(email);
        account.setLoginAccount(login);

        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setCurrency(String.valueOf(CURRENCY.UAH));

        AccountOperation accountOperation = new AccountOperation();

        if (UserService.validateUserInfoWithRegEx(user) && !(CommandUtility.checkUserIsLogged(request, login))) {
            userDao.create(user);
            accountDao.create(account);
            int idUser = userDao.getUserByLogin(login).getUserId();
            int idAccount = accountDao.getAccountByEmail(email).getIdAccount();
            accountDao.addAccountToUser(idUser, idAccount);
            accountDao.addTimeCreateNewAccount(accountOperation, idAccount);
            accountDao.createCurrentAccount(currentAccount, idAccount);
            accountDao.addTimeOpenCurrentAccountOperation(accountOperation, idAccount);

            CommandUtility.setUserRole(request, ROLE.USER, user.getUserLogin());
            CommandUtility.addUserToLoggedUsersByLogin(request, user.getUserLogin());
            return "redirect:/user";
        } else {
            return "/registration.jsp";
        }
    }
}
