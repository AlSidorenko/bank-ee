package com.company.model.dao.impl;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;
import java.util.ResourceBundle;

/**
 * Created on 09.04.2020 8:44.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class ConnectionPoolHolder {

    private static volatile DataSource dataSource;

    public static DataSource getDataSource() {
        if (dataSource == null) {
            synchronized (ConnectionPoolHolder.class) {
                ResourceBundle resource = ResourceBundle.getBundle("database");
                if (dataSource == null) {
                    BasicDataSource ds = new BasicDataSource();
                    ds.setDriverClassName(resource.getString("db.driver"));
                    ds.setUrl(resource.getString("db.url"));
                    ds.setUsername(resource.getString("db.user"));
                    ds.setPassword(resource.getString("db.password"));
                    ds.setTestWhileIdle(false);
                    ds.setTestOnBorrow(true);
                    ds.setValidationQuery(resource.getString("db.validationQuery"));
                    ds.setTestOnReturn(false);
                    ds.setTimeBetweenEvictionRunsMillis(
                            Integer.parseInt(resource.getString("db.timeBetweenEvictionRunsMillis"))
                    );
                    ds.setInitialSize(Integer.parseInt(resource.getString("db.initialSize")));
                    ds.setMaxWait(Integer.parseInt(resource.getString("db.maxWait")));
                    ds.setMaxIdle(Integer.parseInt(resource.getString("db.maxIdle")));
                    ds.setMaxOpenPreparedStatements(
                            Integer.parseInt(resource.getString("db.maxOpenPreparedStatements")));
                    ds.setMinEvictableIdleTimeMillis(
                            Integer.parseInt(resource.getString("db.minEvictableIdleTimeMillis")));
                    ds.setMinIdle(Integer.parseInt(resource.getString("db.minIdle")));
                    ds.setLogAbandoned(true);
                    ds.setRemoveAbandoned(true);
                    ds.setRemoveAbandonedTimeout(
                            Integer.parseInt(resource.getString("db.removeAbandonedTimeout")));
                    dataSource = ds;
                }
            }
        }

        return dataSource;
    }
}
