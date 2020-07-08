package com.company.model.dao.interfaces;

import com.company.model.entity.AccountOperation;
import com.company.model.entity.CurrentAccount;

import java.util.List;

/**
 * Created on 19.04.2020 21:41.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public interface CurrentAccountDao extends GenericDao<CurrentAccount> {

    void createCurrentAccount(CurrentAccount entity, int userId);
    void openCurrentAccountOperation(AccountOperation accountOperation, int idAccount);
    void addNewCurrentAccount(CurrentAccount currentAccount, int idAccount, String currency);
    CurrentAccount findByLogin(String login);
    List<CurrentAccount> findByIdAccount(int idAccount);
    List<CurrentAccount> findByLoginUser(String login);
    List<CurrentAccount> findByLoginStatusUser(String login, int status);
}
