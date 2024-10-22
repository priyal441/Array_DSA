import java.util.*;

public class linearsearch {
  public static int Linearsearch(String menu[], String key) {
    for (int i = 0; i < menu.length; i++) {
      if (menu[i] == key) {
        return i;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    String menu[] = { "dosa", "momos", "panipuri" };
    // int num[]={2,4,6,7,10,55,4,3};
    String key = "dosa";
    int index = Linearsearch(menu, key);
    if (index == -1) {
      System.out.println("Not found");

    } else {
      System.out.println("menu is found");
    }
  }
}