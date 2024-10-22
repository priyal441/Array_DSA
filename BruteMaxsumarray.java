//time complexity O(n^3)
import java.util.*;
//this code is only used to find the maxsumarrray and print the arraty as well as 
public class BruteMaxsumarray {
  public static void printmaxsubarray(int num[]) {
    int currsum = 0;
    int Maxsum = Integer.MIN_VALUE;

    for (int i = 0; i < num.length; i++) {
      int start = i;
      for (int j = i; j < num.length; j++) {
        int end = j;
        currsum = 0;
        for (int k = start; k <= end; k++) {
          currsum = currsum + num[k];

        }
        System.out.println(currsum);
        if(Maxsum<currsum){
          Maxsum=currsum;
        }
      }
    }
    System.out.println("Max sum="+Maxsum);
  }

  public static void main(String[] args) {
    int num[] = { 2, 4, 6, 8, 10 };
    printmaxsubarray(num);
  }
}
