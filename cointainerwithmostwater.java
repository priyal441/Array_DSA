
import java.util.*;

public class cointainerwithmostwater {
  public static void main(String[] args) {
    ArrayList<Integer> Height=new ArrayList<>();
    int maxwater=0;
Height.add(1);
Height.add(8);
Height.add(6);
Height.add(2);
Height.add(5);
Height.add(4);
Height.add(8);
Height.add(3);
Height.add(7);

//Brute force
//O(n^2)
for(int i=0;i<Height.size();i++){
  for(int j=0;j<Height.size();j++){
 int Ht=Math.min(Height.get(i),Height.get(j));
 int wt=j-i;
 int cuuwater=Ht*wt;
 maxwater=Math.max(maxwater,cuuwater);
  }
 
}
System.out.println(maxwater);
  }
}
