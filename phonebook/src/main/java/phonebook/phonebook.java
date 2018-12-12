package phonebook;

import java.util.*;
import java.io.*;

public class phonebook {
  public Vector <abonent> book;
  phonebook () {
    book = new Vector <abonent>();
  }

  void addAbonent(String s1, String s2) {
    book.add(new abonent(s1, s2));
  }

  abonent getAbonent(int ID) {
    return book.get(ID);
  }
}
