import java.util.*;

public class BruteTrappingrainwater {
  public static int Trappingrainwater(int num[]) {
    int res = 0;
    for (int i = 1; i <= num.length - 2; i++) {
   
      int lb = num[i];
      for (int j = 0; j < i; j++) {
        if (num[j] > lb) {
          lb = num[j];
        }
      }
        int rb=num[i];
        for( int j=i+1;j<num.length;j++){
          if(num[j]>rb){
            rb=num[j];
          }
        }
         int mb;
         if(rb>lb){
          mb=lb;
         }else{
          mb=rb;
         }
         int tl=mb-num[i];
         res=res+tl;
      }
      
    
    return res;
    }
  

  public static void main(String[] args) {
    int num[] = { 4, 2, 0, 3, 2, 5 };
   System.out.println(Trappingrainwater(num));
  }
}
