package com.company.model.dao.interfaces;

import com.company.model.entity.DepositAccount;

import java.util.List;

/**
 * Created on 09.05.2020 22:17.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public interface DepositAccountDao extends GenericDao<DepositAccount> {

    void addNewDepositAccount(DepositAccount depositAccount, int idAccount);
    List<DepositAccount> findDepositByLoginStatusUser(String login, int status);

}
