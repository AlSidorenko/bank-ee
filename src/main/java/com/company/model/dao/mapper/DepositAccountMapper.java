package com.company.model.dao.mapper;

import com.company.model.entity.Account;
import com.company.model.entity.DepositAccount;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created on 17.06.2020 14:53.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class DepositAccountMapper implements ObjectMapper<DepositAccount> {

    @Override
    public DepositAccount extractFromResultSet(ResultSet rs) throws SQLException {
        Account account = new Account();
        DepositAccount depositAccount = new DepositAccount();
        depositAccount.setIdDepositAccount(rs.getInt("iddeposit"));
        depositAccount.setCurrencyDepositAccount(rs.getString("deposit_currency"));
        depositAccount.setTypeDepositAccount(rs.getString("deposit_type"));
        depositAccount.setTermDepositAccount(rs.getString("deposit_term"));
        depositAccount.setNumberDepositAccount(rs.getString("deposit_number"));
        depositAccount.setAmountDepositAccount(rs.getDouble("deposit_amount"));
        depositAccount.setPercentDepositAccount(rs.getInt("deposit_percent"));
        account.setIdAccount(rs.getInt("account_idaccount"));
        depositAccount.setStatusDepositAccount(rs.getInt("deposit_account_status"));

        return depositAccount;
    }

    @Override
    public DepositAccount makeUnique(Map<Integer, DepositAccount> cache, DepositAccount depositAccount) {
        cache.putIfAbsent(depositAccount.getIdDepositAccount(), depositAccount);
        return cache.get(depositAccount.getIdDepositAccount());
    }
}
