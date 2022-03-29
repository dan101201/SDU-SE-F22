package main.java;

import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class ManagementTest {


    Management management = new Management();
    @Test
    void create() {
       /* Database dat = null;
        try {
            dat = Database.getDatabase();
            assertEquals(management.Create("html"),
                    dat.Execute("INSERT INTO pages (timestamp, id) VALUES (NOW(), html);"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
*/
    }

    @Test
    void getPageString() {

    }

    @Test
    void getPageDocument() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}