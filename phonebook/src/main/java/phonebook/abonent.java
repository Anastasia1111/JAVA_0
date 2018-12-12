package phonebook;

import java.util.*;
import java.io.*;

public class abonent {
  public static Integer cnt = 0;
  public Integer id;
  public String name, phone;

  abonent() {
    id = cnt++;
  }
  abonent(String s1, String s2) {
    name = s1;
    phone = s2;
    id = cnt++;
  }

  public String getName() {
    return name;
  }

  public String getNum() {
    return phone;
  }

  public Integer getID() {
    return id;
  }

  public void setName(String s) {
    name = s;
  }

  public void setNum(String s) {
    phone = s;
  }
}
