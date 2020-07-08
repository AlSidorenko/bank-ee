package com.company.model.dao.mapper;

import com.company.model.entity.Account;
import com.company.model.entity.CurrentAccount;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created on 10.05.2020 21:10.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class CurrentAccountMapper implements ObjectMapper<CurrentAccount> {

    @Override
    public CurrentAccount extractFromResultSet(ResultSet rs) throws SQLException {
        Account account = new Account();
        CurrentAccount currentAccount = new CurrentAccount();
        currentAccount.setIdCurrentAccount(rs.getInt("idcurrent"));
        String current_currency = rs.getString("current_currency");
        currentAccount.setCurrency(current_currency == null ? "UAH" : current_currency);
        currentAccount.setNumberCurrentAccount(rs.getString("currency_number"));
        currentAccount.setAmountCurrentAccount(rs.getDouble("current_amount"));
        account.setIdAccount(rs.getInt("account_idaccount"));
        currentAccount.setStatusCurrentAccount(rs.getInt("current_account_status"));

        return currentAccount;
    }

    @Override
    public CurrentAccount makeUnique(Map<Integer, CurrentAccount> cache, CurrentAccount currentAccount) {
        cache.putIfAbsent(currentAccount.getIdCurrentAccount(), currentAccount);
        return cache.get(currentAccount.getIdCurrentAccount());
    }
}
