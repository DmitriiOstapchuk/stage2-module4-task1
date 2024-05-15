package com.mjc.stage2.impl;

import com.mjc.stage2.ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class H2ConnectionFactory implements ConnectionFactory {

    @Override
    public Connection createConnection() {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("h2database");
            Class.forName(bundle.getString("jdbc_driver"));
            String url = bundle.getString("db_url");
            String user = bundle.getString("user");
            String password = bundle.getString("password");
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}

