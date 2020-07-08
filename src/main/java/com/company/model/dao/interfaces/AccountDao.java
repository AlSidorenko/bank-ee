package com.company.model.dao.interfaces;

import com.company.model.entity.Account;
import com.company.model.entity.AccountOperation;
import com.company.model.entity.CurrentAccount;

/**
 * Created on 19.04.2020 21:40.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public interface AccountDao extends GenericDao<Account> {

    void createCurrentAccount(CurrentAccount currentAccount, int idAccount);
    void addAccountToUser(int accountId, int userId);
    void addTimeCreateNewAccount(AccountOperation accountOperation, int idAccount);
    void addTimeOpenCurrentAccountOperation(AccountOperation accountOperation, int idAccount);
    Account getAccountByLogin(String login);
    void startTransaction();
    void endTransaction();
    void rollbackTransaction();
    Account getAccountByEmail(String email);

}
