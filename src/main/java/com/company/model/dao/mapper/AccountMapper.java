package com.company.model.dao.mapper;

import com.company.model.entity.Account;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created on 21.04.2020 13:41.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class AccountMapper implements ObjectMapper<Account> {

    @Override
    public Account extractFromResultSet(ResultSet rs) throws SQLException {
        Account account = new Account();
        account.setIdAccount(rs.getInt("idaccount"));
        account.setCodeAccount(rs.getString("code_account"));
        account.setEmailAccount(rs.getString("email_account"));
        account.setLoginAccount(rs.getString("login_account"));
        return account;
    }

    @Override
    public Account makeUnique(Map<Integer, Account> cache, Account account) {
        cache.putIfAbsent(account.getIdAccount(), account);
        return cache.get(account.getIdAccount());
    }
}
