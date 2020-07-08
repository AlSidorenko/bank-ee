package com.company.model.dao.impl;

import com.company.model.dao.interfaces.DepositAccountDao;
import com.company.model.dao.mapper.DepositAccountMapper;
import com.company.model.entity.AccountOperation;
import com.company.model.entity.DepositAccount;
import com.company.model.service.AccountOperationMessages;
import com.company.model.service.AccountStatus;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created on 09.05.2020 22:14.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class JDBCDepositAccountDao /*implements DepositAccountDao*/ {

    /*private Connection connection;
    private ResourceBundle resource = ResourceBundle.getBundle("database");

    public JDBCDepositAccountDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void addNewDepositAccount(DepositAccount depositAccount, int idAccount) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.depositAccount.add.new.deposit.account"))
        ) {
            ps.setString(1, depositAccount.getCurrencyDepositAccount());
            ps.setString(2, depositAccount.getTypeDepositAccount());
            ps.setString(3, depositAccount.getTermDepositAccount());
            ps.setString(4, depositAccount.createdDepositAccount());
            ps.setDouble(5, depositAccount.getAmountDepositAccount());
            ps.setDouble(6, depositAccount.getPercentDepositAccount());
            ps.setInt(7, idAccount);
            ps.setInt(8, depositAccount.createdStatusDepositAccount());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<DepositAccount> findDepositByLoginStatusUser(String login, int status) {
        List<DepositAccount> depositAccounts = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.depositAccount.find.deposit.by.login.status.user"))
        ) {
            ps.setString(1, login);
            ps.setInt(2, status);
            ResultSet rs = ps.executeQuery();
            DepositAccountMapper depositAccountMapper = new DepositAccountMapper();
            while (rs.next()) {
                DepositAccount depositAccount = depositAccountMapper.extractFromResultSet(rs);
                depositAccounts.add(depositAccount);
            }
            return depositAccounts;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public DepositAccount findById(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.depositAccount.find.by.id"))
        ) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            DepositAccountMapper depositAccountMapper = new DepositAccountMapper();
            if (rs.next()) {
                return depositAccountMapper.extractFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }

    @Override
    public void closeAccount(DepositAccount entity, int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.depositAccount.close.deposit.account"))
        ) {
            ps.setInt(1, AccountStatus.CLOSED_ACCOUNT);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addTimeOpenDepositAccountOperation(AccountOperation accountOperation, int idAccount) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.depositAccount.add.time.open.deposit.account.operation"))
        ) {
            ps.setString(1, accountOperation.getDateOperation());
            ps.setString(2, AccountOperationMessages.DEPOSIT_ACCOUNT_OPEN);
            ps.setInt(3, idAccount);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addTimeCloseDepositAccountOperation(AccountOperation accountOperation, int idAccount) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.depositAccount.add.time.close.deposit.account.operation"))
        ) {
            ps.setString(1, accountOperation.getDateOperation());
            ps.setString(2, AccountOperationMessages.DEPOSIT_ACCOUNT_CLOSED);
            ps.setInt(3, idAccount);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(DepositAccount entity) {

    }

    @Override
    public List<DepositAccount> findAll() {
        return null;
    }

    @Override
    public void update(DepositAccount entity, int id) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }*/
}
