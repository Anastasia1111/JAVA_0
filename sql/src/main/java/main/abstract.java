package main;

import java.util.*;
import java.io.*;

abstract class Abstract {
  public Abstract(String str) {
    name = str;
  }
  //public ~Abstract(){}
  public String name;
  public abstract int operation(int a, int b);
}
