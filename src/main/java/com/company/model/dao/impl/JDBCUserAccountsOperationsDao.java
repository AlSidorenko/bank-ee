package com.company.model.dao.impl;

import com.company.model.dao.mapper.CurrentAccountMapper;
import com.company.model.dao.mapper.DepositAccountMapper;
import com.company.model.entity.AccountOperation;
import com.company.model.entity.CurrentAccount;
import com.company.model.entity.DepositAccount;
import com.company.model.service.AccountOperationMessages;
import com.company.model.service.AccountStatus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Created on 30.06.2020 22:36.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class JDBCUserAccountsOperationsDao {

    private Connection connection;
    private ResourceBundle resource = ResourceBundle.getBundle("database");

    public JDBCUserAccountsOperationsDao(Connection connection) {
        this.connection = connection;
    }

    // TODO Current Account

    public void createCurrentAccount(CurrentAccount entity, int idAccount) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.currentAccount.create"))
        ) {
            ps.setString(1, String.valueOf(entity.getCurrency()));
            ps.setString(2, entity.createdCurrentAccount());
            ps.setDouble(3, entity.getAmountCurrentAccount());
            ps.setInt(4, idAccount);
            ps.setInt(5, entity.createdStatusCurrentAccount());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addNewCurrentAccount(CurrentAccount currentAccount, int idAccount, String currency) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.currentAccount.create"))
        ) {
            ps.setString(1, currency);
            ps.setString(2, currentAccount.createdCurrentAccount());
            ps.setDouble(3, currentAccount.getAmountCurrentAccount());
            ps.setInt(4, idAccount);
            ps.setInt(5, currentAccount.createdStatusCurrentAccount());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void openCurrentAccountOperation(AccountOperation accountOperation, int idAccount) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.currentAccount.open.current.account.operation"))
        ) {
            ps.setString(1, accountOperation.getDateOperation());
            ps.setString(2, AccountOperationMessages.OPEN_CURRENT_ACCOUNT);
            ps.setInt(3, idAccount);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void addTimeCloseCurrentAccountOperation(AccountOperation accountOperation, int idAccount) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.currentAccount.add.time.closeCurrentAccountOperation"))
        ) {
            ps.setString(1, accountOperation.getDateOperation());
            ps.setString(2, AccountOperationMessages.CURRENT_ACCOUNT_CLOSED);
            ps.setInt(3, idAccount);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    // public void create(CurrentAccount entity) { }

    public CurrentAccount findByIdCurrentUser(int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.currentAccount.findById"))
        ) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            CurrentAccountMapper currentAccountMapper = new CurrentAccountMapper();
            if (rs.next()) {
                return currentAccountMapper.extractFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    // public CurrentAccount findByLogin(String login) { return null; }

    public List<CurrentAccount> findAll() {
        List<CurrentAccount> currentAccounts = new ArrayList<>();
        try (Statement st = connection.createStatement()) {
            ResultSet rs = st.executeQuery(resource.getString("db.currentAccount.list.currentAccounts"));
            CurrentAccountMapper currentAccountMapper = new CurrentAccountMapper();
            while (rs.next()) {
                CurrentAccount currentAccount = currentAccountMapper.extractFromResultSet(rs);
                currentAccounts.add(currentAccount);
            }
            return currentAccounts;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<CurrentAccount> findByLoginStatusUser(String login, int status) {
        List<CurrentAccount> currentAccounts = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.currentAccount.find.by.login.statusUser"))
        ) {
            ps.setString(1, login);
            ps.setInt(2, status);
            ResultSet rs = ps.executeQuery();
            CurrentAccountMapper currentAccountMapper = new CurrentAccountMapper();
            while (rs.next()) {
                CurrentAccount currentAccount = currentAccountMapper.extractFromResultSet(rs);
                currentAccounts.add(currentAccount);
            }
            return currentAccounts;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<CurrentAccount> findByLoginUser(String login) {
        List<CurrentAccount> currentAccounts = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.currentAccount.find.by.loginUser"))
        ) {
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            CurrentAccountMapper currentAccountMapper = new CurrentAccountMapper();
            while (rs.next()) {
                CurrentAccount currentAccount = currentAccountMapper.extractFromResultSet(rs);
                currentAccounts.add(currentAccount);
            }
            return currentAccounts;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<CurrentAccount> findByIdAccount(int idAccount) {
        List<CurrentAccount> currentAccounts = new ArrayList<>();
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.currentAccount.list.by.id_account"))
        ) {
            ps.setInt(1, idAccount);
            ResultSet rs = ps.executeQuery();
            CurrentAccountMapper currentAccountMapper = new CurrentAccountMapper();
            while (rs.next()) {
                CurrentAccount currentAccount = currentAccountMapper.extractFromResultSet(rs);
                currentAccounts.add(currentAccount);
            }
            return currentAccounts;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    // public void update(CurrentAccount entity, int id) { }

    // public void delete(int id) { }

    public void closeAccount(CurrentAccount entity, int id) {
        try (PreparedStatement ps = connection.prepareStatement(
                resource.getString("db.currentAccount.closeAccount"))
        ) {
            ps.setInt(1, AccountStatus.CLOSED_ACCOUNT);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // TODO Deposit Account

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

    public DepositAccount findByIdDepositUsers(int id) {
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

    // public void create(DepositAccount entity) { }

    // public List<DepositAccount> findAll() { return null; }

    // public void update(DepositAccount entity, int id) { }

    // public void delete(int id) { }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
