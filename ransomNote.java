import java.util.*;
public class ransomNote {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String n=sc.next();
    String m=sc.next();
    for(int i=0;i<=n.length();i++){
      for(int j=0;j<=m.length();j++){
        if(i==j){
        System.out.println("true");
        }else{
          System.out.println("false");
        }
      }
    }
  
  }
}
