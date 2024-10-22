import java.util.*;
public class str {
  public static void main(String[] args) {
    String s="priyal";
   int left=0;
   int right=s.length()-1;
   
   while(left<right){
    char temp=s[left];
    s[left]=s[right];
   s [right]=temp;
   }
   System.out.println();
  }
  
}
