package com.company.model.dao.impl;

import com.company.model.dao.interfaces.AccountDao;
import com.company.model.dao.mapper.AccountMapper;
import com.company.model.entity.Account;
import com.company.model.entity.AccountOperation;
import com.company.model.entity.CurrentAccount;
import com.company.model.service.AccountOperationMessages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created on 21.04.2020 13:09.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class JDBCAccountDao implements AccountDao {

    private Connection connection;
    private ResourceBundle resource = ResourceBundle.getBundle("database");

    public JDBCAccountDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Account account) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.account.create.account"))
        ) {
            ps.setString(1, account.getCodeAccount());
            ps.setString(2, account.getEmailAccount());
            ps.setString(3, account.getLoginAccount());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Account findById(int id) {
        return null;
    }

    @Override
    public Account getAccountByLogin(String login) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.account.getAccountByLogin"))
        ) {
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            AccountMapper accountMapper = new AccountMapper();
            if (rs.next()) {
                return accountMapper.extractFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public void createCurrentAccount(CurrentAccount currentAccount, int idAccount) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.account.create.currentAccount"))
        ) {
            ps.setString(1, String.valueOf(currentAccount.getCurrency()));
            ps.setString(2, currentAccount.createdCurrentAccount());
            ps.setDouble(3, currentAccount.getAmountCurrentAccount());
            ps.setInt(4, idAccount);
            ps.setInt(5, currentAccount.createdStatusCurrentAccount());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addTimeOpenCurrentAccountOperation(AccountOperation accountOperation, int idAccount) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.account.addTime.open.current.account.operation"))
        ) {
            ps.setString(1, accountOperation.getDateOperation());
            ps.setString(2, AccountOperationMessages.OPEN_CURRENT_ACCOUNT);
            ps.setInt(3, idAccount);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Account> findAll() {
        return null;
    }



    @Override
    public void update(Account entity, int id) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void closeAccount(Account entity, int id) {

    }

    @Override
    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addAccountToUser(int userId, int accountId) {
        try (PreparedStatement statement = connection.prepareStatement(
                resource.getString("db.account.add.user.to.account")
        )) {
            statement.setInt(1, userId);
            statement.setInt(2, accountId);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addTimeCreateNewAccount(AccountOperation accountOperation, int idAccount) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.account.add.time.operation"))
        ) {
            ps.setString(1, accountOperation.getDateOperation());
            ps.setString(2, AccountOperationMessages.REGISTRATION_NEW_ACCOUNT);
            ps.setInt(3, idAccount);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void startTransaction() {

    }

    @Override
    public void endTransaction() {

    }

    @Override
    public void rollbackTransaction() {

    }

    @Override
    public Account getAccountByEmail(String email) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.account.getAccountByEmail"))
        ) {
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            AccountMapper accountMapper = new AccountMapper();
            if (rs.next()) {
                return accountMapper.extractFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
