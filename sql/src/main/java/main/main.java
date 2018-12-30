package main;

import java.util.*;
import java.io.*;

public class main {
  public static void main(String[] args) {
    SUM ob = new SUM("NAME");
    System.out.println(ob.name);
    System.out.println(ob.operation(1, 2));
    MUL ob2 = new MUL("NAME2");

    System.out.println(ob2.name);
    System.out.println(ob2.operation(1, 2));
  }
}
