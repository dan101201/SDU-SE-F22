package main.java;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Database db = Database.getDatabase();
            Management management = new Management();
            System.out.println(management.GetPageDocument(1));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}