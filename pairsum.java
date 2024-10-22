import java.util.*;

public class pairsum {
  public static boolean pair(ArrayList<Integer> Height, int target){
    int lp=0;
    int rp=Height.size()-1;
while(lp<rp){
  if(Height.get(lp)+Height.get(rp)==target){
    return true;
  }
  if(Height.get(lp)+Height.get(rp)<target){
    lp++;
}
else{
rp--;
}

  }
  return false;
  }

  public static void main(String[] args) {
    ArrayList<Integer> Height = new ArrayList<>();
    Height.add(1);
    Height.add(2);
    Height.add(3);
    Height.add(4);
    Height.add(5);
    Height.add(6);
    Height.add(7);
    
    int target = 5;
    // int lp=0;
    // int rp=rp.size()-1;
    // while(lp<rp){
    // if(Height.get(lp)+Height.get(rp)==target){
    // return true;
    // }
    // if(Height.get(lp)+Height.get(rp)<target){
    // lp++;
    // }
    // if(Height.get(lp)+Height.get(rp)>target){
    // rp--;
    // }

    // }
    // return false;
    System.out.println(pair(Height, target));
  }
}