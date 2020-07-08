package com.company.controller.command.user;

import com.company.controller.command.Command;
import com.company.model.dao.DaoFactory;
import com.company.model.dao.impl.JDBCAccountDao;
import com.company.model.dao.impl.JDBCCurrentAccountDao;
import com.company.model.dao.impl.JDBCDepositAccountDao;
import com.company.model.dao.impl.JDBCUserAccountsOperationsDao;
import com.company.model.entity.AccountOperation;
import com.company.model.entity.CurrentAccount;
import com.company.model.entity.DepositAccount;
import com.company.model.service.AccountStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created on 16.04.2020 14:39.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class UserInfoCommand implements Command {

    private DaoFactory factory = DaoFactory.getInstance();
    private JDBCAccountDao accountDao = factory.createJDBCAccountDao();
    private JDBCUserAccountsOperationsDao userAccountsOperationsDao = factory.createJDBCUserAccountsOperationsDao();
    //private JDBCCurrentAccountDao currentAccountDao = factory.createJDBCCurrentAccountDao();
    //private JDBCDepositAccountDao depositAccountDao = factory.createJDBCDepositAccountDao();

    private CurrentAccount currentAccount = new CurrentAccount();
    private DepositAccount depositAccount = new DepositAccount();
    private AccountOperation accountOperation = new AccountOperation();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String login = (String) request.getSession().getServletContext().getAttribute("login");
        int status = AccountStatus.OPEN_ACCOUNT;

        List<CurrentAccount> currentAccounts = userAccountsOperationsDao.findByLoginStatusUser(login, status);
        request.setAttribute("CURRENT_ACCOUNT_LIST", currentAccounts);

        List<DepositAccount> depositAccounts = userAccountsOperationsDao.findDepositByLoginStatusUser(login, status);
        request.setAttribute("DEPOSIT_ACCOUNT_LIST", depositAccounts);

        int idAccount = accountDao.getAccountByLogin(login).getIdAccount();

        String currentAccountId = request.getParameter("currentAccountId");
        System.out.println("ID Current Account: " + currentAccountId);
        // Current List
        if (currentAccountId != null) {
            double amount = userAccountsOperationsDao.findByIdCurrentUser(Integer.parseInt(currentAccountId)).getAmountCurrentAccount();
            if (amount == 0.0) {
                userAccountsOperationsDao.closeAccount(currentAccount, Integer.parseInt(currentAccountId));
                userAccountsOperationsDao.addTimeCloseCurrentAccountOperation(accountOperation, idAccount);
                return "redirect:/user/info";
            }
            System.out.println("Amount: " + amount);
        }

        String depositAccountId = request.getParameter("depositAccountId");
        System.out.println("ID Deposit Account: " + depositAccountId);
        // Deposit List
        if (depositAccountId != null) {
            double amountDeposit =
                    userAccountsOperationsDao.findByIdDepositUsers(Integer.parseInt(depositAccountId)).getAmountDepositAccount();
            if (amountDeposit == 0.0) {
                userAccountsOperationsDao.closeAccount(depositAccount, Integer.parseInt(depositAccountId));
                userAccountsOperationsDao.addTimeCloseDepositAccountOperation(accountOperation, idAccount);
                return "redirect:/user/info";
            }
            System.out.println("Deposit Amount: " + amountDeposit);
        }

        return "/WEB-INF/user/userInfo.jsp";
    }
}
