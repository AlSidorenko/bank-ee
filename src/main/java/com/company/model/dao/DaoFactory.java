package com.company.model.dao;

import com.company.model.dao.impl.*;

/**
 * Created on 09.04.2020 17:26.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public abstract class DaoFactory {

    private static DaoFactory daoFactory;
    public abstract JDBCUserDao createJDBCUserDao();
    public abstract JDBCAccountDao createJDBCAccountDao();
    public abstract JDBCCurrentAccountDao createJDBCCurrentAccountDao();
    public abstract JDBCUserAccountsOperationsDao createJDBCUserAccountsOperationsDao();
    public abstract JDBCCreditAccountDao createJDBCCreditAccountDao();
    public abstract JDBCDepositAccountDao createJDBCDepositAccountDao();

    public static DaoFactory getInstance() {
        if (daoFactory == null) {
            synchronized (DaoFactory.class) {
                if (daoFactory == null) {
                    DaoFactory temp = new JDBCDaoFactory();
                    daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }
}
