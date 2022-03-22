package Test.java;

import main.java.DocumentSorter;
import main.java.HTMLParser;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class DocumentSorterTest {
    HTMLParser htmlParser = new HTMLParser("HTML/Test.html");
    DocumentSorter documentSorter = new DocumentSorter();

    DocumentSorterTest() throws IOException {
    }

    @Test
    void getHead() {
        documentSorter.getHead(htmlParser.getParsedHTML());
        assertEquals("Test", documentSorter.getHead(htmlParser.getParsedHTML()));
    }

    @Test
    void getHeadToString() {
    }

    @Test
    void getBody() {
    }

    @Test
    void getBodyToString() {
    }

    @Test
    void selectById() {
    }
}