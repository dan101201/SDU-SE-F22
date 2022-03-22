package main.java;

import main.java.DocumentSorter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        HTMLParser p;
        DocumentSorter d = new DocumentSorter();
        HTMLParser g = null;

        try {
            g = new HTMLParser("HTML/Test.html");
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        try {
            p = new HTMLParser("HTML/Test.html");
            System.out.println(p.getParsedHTML());
            System.out.println(d.getHead(p.getParsedHTML()));
            System.out.println(d.getBody(p.getParsedHTML()));

            System.out.println(d.selectById(p.getParsedHTML(), "test1", true));
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        System.out.println(d.getHeadToString(g.getParsedHTML()));
    }
}