package com.company.model.dao.impl;

import com.company.model.dao.DaoFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * Created on 09.04.2020 8:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class JDBCDaoFactory extends DaoFactory {

    private DataSource dataSource = ConnectionPoolHolder.getDataSource();

    private Connection getConnection(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public JDBCCurrentAccountDao createJDBCCurrentAccountDao() {
        return new JDBCCurrentAccountDao(getConnection());
    }

    @Override
    public JDBCUserDao createJDBCUserDao() {
        return new JDBCUserDao(getConnection());
    }

    @Override
    public JDBCAccountDao createJDBCAccountDao() {
        return new JDBCAccountDao(getConnection());
    }

    @Override
    public JDBCCreditAccountDao createJDBCCreditAccountDao() {
        //return new JDBCCreditAccountDao(getConnection());
        return null;
    }

    @Override
    public JDBCUserAccountsOperationsDao createJDBCUserAccountsOperationsDao() {
        return new JDBCUserAccountsOperationsDao(getConnection());
    }

    @Override
    public JDBCDepositAccountDao createJDBCDepositAccountDao() {
        //return new JDBCDepositAccountDao(getConnection());
        return null;
    }
}
