//package main;

import java.util.*;
import java.io.*;
import java.sql.*;

public class program {
  public static void main(String[] args) {
    program a = new program();
    a.open();
    //a.insert();
    a.print();
    a.close();

  }
    Connection co;
    void open() {
      try {
        Class.forName("org.sqlite.JDBC");
        co = DriverManager.getConnection (
          "jdbc:sqlite:tbl.db"
        );
        System.out.println("Connected");
        String s = "INSERT INTO table1 (name) VALUES('name2');";
      }
      catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    void close() {
      try {
        co.close();
      }
      catch(Exception e) {
        System.out.println(e.getMessage());
      }
    }

    void insert() {
      try {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = scanner.nextLine();

        String s = "INSERT INTO table1 (name) VALUES('"+name+"');";
        Statement stat = co.createStatement();
        stat.executeUpdate(s);
        System.out.println("ADDED!");
        stat.close();
      }
      catch(Exception e) {
        System.out.println(e.getMessage());
      }

    }
          void print() {
            try {
              Statement statement = co.createStatement();
              String s = "SELECT name FROM table1;";
              ResultSet rs = statement.executeQuery(s);
              while(rs.next()) {
                String str = rs.getString("name");
                System.out.println(str);
              }
              rs.close();
              statement.close();
            }
            catch(Exception e) {
              System.out.println(e.getMessage());
            }
          }

}
