package main.java;

import java.sql.*;

class Database {
    private Connection connection = null;

    static protected Database database = null;

    private Database() throws SQLException {
        DriverManager.registerDriver(new org.postgresql.Driver());
        connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","Olsen2001");
    }

    protected ResultSet Execute(String str) throws SQLException {
        PreparedStatement insertStatement = connection.prepareStatement(str);
        return insertStatement.executeQuery();
    }

    static protected Database getDatabase() throws SQLException {
        if (database == null)
            database = new Database();
        return database;
    }
}
