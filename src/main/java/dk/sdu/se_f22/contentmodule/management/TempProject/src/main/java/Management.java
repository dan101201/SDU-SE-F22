package main.java;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Management{
    static Database dat;

    static {
        try {
            dat = Database.getDatabase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void Create(String html) throws SQLException{
        dat.executeVoidReturn("INSERT INTO pages (timestamp, html) VALUES (NOW(), '" + html + "');");
    }

    public static String getPageString(int id) throws SQLException {
        var result = GetResultSetFromId(id);
        try {
            result.next();
            return result.getString(2);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Document GetPageDocument(int id) throws SQLException {
        var result = GetResultSetFromId(id);
        try {
            result.next();
            return Jsoup.parse(result.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static ResultSet GetResultSetFromId(int id) throws SQLException{
        return dat.Execute("SELECT * FROM pages WHERE id = " + id);
    }

    public static void Update(int id, String html) {
        try {
            var dat = Database.getDatabase();
            dat.executeVoidReturn("UPDATE pages SET html = '" + html + "', timestamp = NOW() WHERE id = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void Delete(int id) {
        try {
            dat.executeVoidReturn("DELETE FROM pages WHERE id = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
