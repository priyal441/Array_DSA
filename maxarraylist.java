import java.util.*;
public class maxarraylist {
  public static void main(String[] args) {
    ArrayList <Integer> l=new ArrayList<>();
    l.add(3);
    l.add(4);
    l.add(7);
    l.add(9);
    int M=Integer.MIN_VALUE;
    for(int i=0;i<l.size();i++){
      if(M<l.get(i)){
M=l.get(i);
      }
     }
     System.out.println(M);
  }
}
