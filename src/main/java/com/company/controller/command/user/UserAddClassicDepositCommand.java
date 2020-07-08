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
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 17.06.2020 16:25.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class UserAddClassicDepositCommand implements Command {

    private DaoFactory factory = DaoFactory.getInstance();
    private JDBCAccountDao accountDao = factory.createJDBCAccountDao();
    private JDBCUserAccountsOperationsDao depositAccountDao = factory.createJDBCUserAccountsOperationsDao();
    //private JDBCDepositAccountDao depositAccountDao = factory.createJDBCDepositAccountDao();

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {

        //Map<String, ProcessingMethod> methodMap = new HashMap<String, ProcessingMethod>();

        String login = (String) request.getSession().getServletContext().getAttribute("login");
        int idAccount = accountDao.getAccountByLogin(login).getIdAccount();
        //String command = request.getParameter("command");
        //String command = (String) request.getSession().getServletContext().getAttribute("command");
        String currency = request.getParameter("currencyClassicDeposit");
        String term = request.getParameter("termClassicDeposit");
        System.out.println("LOGIN: " + login);
        System.out.println("idAccount: " + idAccount);
        //System.out.println("COMMAND: " + command);
        System.out.println("CURRENCY: " + currency);
        System.out.println("TERM: " + term);

        AccountOperation accountOperation = new AccountOperation();
        DepositAccount depositAccount = new DepositAccount();
        String numberDeposit = depositAccount.createdDepositAccount();
        depositAccount.setCurrencyDepositAccount(currency);
        depositAccount.setTypeDepositAccount(TYPE_DEPOSIT.CLASSIC.getType());
        depositAccount.setTermDepositAccount(term);
        depositAccount.setNumberDepositAccount(numberDeposit);
        depositAccount.setAmountDepositAccount(0.0);
        if (term != null) {
            if (term.equals("1")) {
                depositAccount.setPercentDepositAccount(Percents.CLASSIC_ONE_MONTH);
            } else if (term.equals("3")) {
                depositAccount.setPercentDepositAccount(Percents.CLASSIC_TREE_MONTHS);
            } else if (term.equals("6")) {
                depositAccount.setPercentDepositAccount(Percents.CLASSIC_SIX_MONTH);
            } else if (term.equals("9")) {
                depositAccount.setPercentDepositAccount(Percents.CLASSIC_NINE_MONTH);
            } else {
                depositAccount.setPercentDepositAccount(Percents.CLASSIC_TWELVE_MONTHS);
            }
        }
        depositAccount.createdStatusDepositAccount();

        if (currency != null) {
            depositAccountDao.addNewDepositAccount(depositAccount, idAccount);
            depositAccountDao.addTimeOpenDepositAccountOperation(accountOperation, idAccount);
            return "redirect:/user/info";
        }

        return "/WEB-INF/user/addClassicDeposit.jsp";
    }
}
