import java.util.*;
public class shortestpath {
  static float printshortestpath(String direction){
int x=0,y=0;
for(int i=0;i<direction.length();i++){
  char path=direction.charAt(i);
  //west
  if(path=='W'){
    x--;
  }
  //east
  else if(path=='E'){
    x++;
  }else if(path=='N'){
    y++;
  }else if(path=='S'){
    y--;
  }
  
}
int x2=x*x;
int y2=y*y;
return (float)Math.sqrt(x2+y2);
  } 
  public static void main(String[] args) {
    String direction="WNEENESENNN";
    System.out.println(printshortestpath(direction));

  }
}
