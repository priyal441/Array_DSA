//time complexity is O(n^2)
import java.util.*;

public class Pairsinarray {
  public static void printpair(int num[]) {
     for(int i =0;i<num.length;i++){
      int curr=num[i]; //2,4,6,8,10
      for(int j=i+1;j<num.length;j++){ //4 6 8 10
        
        System.out.print("("+ curr+","+num[j]+")");
      }
      System.err.println();
     }
  }

  public static void main(String[] args) {
    int num[] = { 2, 4, 6, 8, 10 };
    printpair(num);
  }
}
