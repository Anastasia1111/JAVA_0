package calc;

import java.util.*;
import java.io.*;

public class calc {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer a = sc.nextInt();
    String c = sc.next();
    Integer b = sc.nextInt();
    switch(c) {
      case "+": {
        System.out.println(a + b);
        break;
      }
      case "-": {
        System.out.println(a - b);
        break;
      }
      case "*": {
        System.out.println(a * b);
        break;
      }
      case "/": {
        System.out.println(a / b);
        break;
      }

    }
  }
}

