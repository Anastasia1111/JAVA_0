package phonebook;

import java.util.*;
import java.io.*;

public class test {
  public static void main(String[] args) {
    String s1 = "John";
    String s2 = "888";
    //abonent a = new abonent();
    abonent a = new abonent(s1, s2);
    System.out.println(a.getName());
    System.out.println(a.getNum());
    System.out.println(a.getID());
    abonent b = new abonent();
    b.setName("Elf");
    b.setNum("6975");
    System.out.println(b.getName());
    System.out.println(b.getNum());
    System.out.println(b.getID());

    phonebook phbook = new phonebook();
    phbook.addAbonent("Eric", "334");
    abonent temp = phbook.getAbonent(0);
    System.out.println(temp.getName());
  }
}
