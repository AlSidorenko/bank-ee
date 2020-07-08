package com.company.controller.command.user;

import com.company.controller.command.Command;
import com.company.model.dao.DaoFactory;
import com.company.model.dao.impl.JDBCAccountDao;
import com.company.model.dao.impl.JDBCDepositAccountDao;
import com.company.model.dao.impl.JDBCUserAccountsOperationsDao;
import com.company.model.entity.AccountOperation;
import com.company.model.entity.DepositAccount;
import com.company.model.entity.enums.TYPE_DEPOSIT;
import com.company.model.service.Percents;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created on 22.06.2020 20:13.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class UserAddSavingDepositCommand implements Command {

    private DaoFactory factory = DaoFactory.getInstance();
    private JDBCAccountDao accountDao = factory.createJDBCAccountDao();
    //private JDBCDepositAccountDao depositAccountDao = factory.createJDBCDepositAccountDao();
    private JDBCUserAccountsOperationsDao userAccountsOperationsDao = factory.createJDBCUserAccountsOperationsDao();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        String login = (String) request.getSession().getServletContext().getAttribute("login");
        int idAccount = accountDao.getAccountByLogin(login).getIdAccount();
        String currency = request.getParameter("currencySavingDeposit");
        String term = request.getParameter("termSavingDeposit");
        System.out.println("LOGIN: " + login);
        System.out.println("idAccount: " + idAccount);
        System.out.println("CURRENCY: " + currency);
        System.out.println("TERM: " + term);

        AccountOperation accountOperation = new AccountOperation();
        DepositAccount depositAccount = new DepositAccount();
        String numberDeposit = depositAccount.createdDepositAccount();
        depositAccount.setCurrencyDepositAccount(currency);
        depositAccount.setTypeDepositAccount(TYPE_DEPOSIT.SAVINGS.getType());
        depositAccount.setTermDepositAccount(term);
        depositAccount.setNumberDepositAccount(numberDeposit);
        depositAccount.setAmountDepositAccount(0.0);
        if (term != null) {
            if (term.equals("3")) {
                depositAccount.setPercentDepositAccount(Percents.SAVINGS_TREE_MONTHS);
            } else if (term.equals("6")) {
                depositAccount.setPercentDepositAccount(Percents.SAVINGS_SIX_MONTH);
            } else {
                depositAccount.setPercentDepositAccount(Percents.SAVINGS_TWELVE_MONTHS);
            }
        }
        depositAccount.createdStatusDepositAccount();

        if (currency != null) {
            userAccountsOperationsDao.addNewDepositAccount(depositAccount, idAccount);
            userAccountsOperationsDao.addTimeOpenDepositAccountOperation(accountOperation, idAccount);
            //depositAccountDao.addNewDepositAccount(depositAccount, idAccount);
            //depositAccountDao.addTimeOpenDepositAccountOperation(accountOperation, idAccount);
            return "redirect:/user/info";
        }

        return "/WEB-INF/user/addSavingDeposit.jsp";
    }
}
