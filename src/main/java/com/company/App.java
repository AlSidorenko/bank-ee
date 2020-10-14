package com.company;

import com.company.model.dao.impl.JDBCAccountDao;
import com.company.model.dao.impl.JDBCUserDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created on 21.04.2020 16:26.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class App {

    public static void main(String[] args) throws SQLException {

        //System.out.println("david".toUpperCase());
        //Account account = new Account();
        //System.out.println(account.getCodeAccount());


        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ways?serverTimezone=UTC",
                "admin" ,
                "admin"
        );

        JDBCUserDao userDao = new JDBCUserDao(connection);
        JDBCAccountDao accountDao = new JDBCAccountDao(connection);
        System.out.println("Connection DataBase!");

        int idUser = userDao.getUserByLogin("david").getUserId();
        System.out.printf("id user: %s\n", idUser);

        int idAccount = accountDao.getAccountByEmail("david@gmail.com").getIdAccount();
        System.out.printf("id account: %s\n", idAccount);

        connection.close();
        System.out.println("Disconnect!");


        Date dt = new Date(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:SS");
        String currentDate = sdf.format(dt);
        System.out.printf("Current date: %s\n", currentDate);
    }
}
