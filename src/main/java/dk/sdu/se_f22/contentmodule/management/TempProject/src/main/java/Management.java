package main.java;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Management{

    public void Create(String html) {
        try {
            var dat = Database.getDatabase();
            dat.Execute("INSERT INTO pages (timestamp, id) VALUES (NOW(), " + html + ");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String GetPageString(int id) {
        var result = GetResultSetFromId(id);
        try {
            result.next();
            return result.getString(3);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Document GetPageDocument(int id) {
        var result = GetResultSetFromId(id);
        try {
            result.next();
            return Jsoup.parse(result.getString(3));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    private ResultSet GetResultSetFromId(int id) {
        try {
            var dat = Database.getDatabase();
            return dat.Execute(
                    "SELECT * FROM pages WHERE id = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; //wtf do we do if we cant connect to database?
    }

    public void Update(int id, String html) {
        try {
            var dat = Database.getDatabase();
            dat.Execute("UPDATE pages SET html = '" + html + "', timestamp = NOW() WHERE id = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void Delete(int id) {
        try {
            var dat = Database.getDatabase();
            dat.Execute("DELETE FROM pages WHERE id = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
