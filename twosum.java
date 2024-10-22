import java.util.*;
public class twosum {
  public static void main(String[] args) {
    int arr[]={2,7,11,5};
    int target=9;
   
    for(int i=0;i<=arr.length;i++){
      if(arr[i]+arr[i+1]==target){
        System.out.println(arr[i]+" "+arr[i+1]);
        System.out.println(i+""  +(i+1));
      }
    }
  }
  }

