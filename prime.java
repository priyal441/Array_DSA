
import java.util.Scanner;

//tc O(n)
public class prime{
  static boolean checkprime(int n){
    if(n==1){
      return false;
    }
    if(n==2||n==3){
      return false;
    }
    if(n%2==0||n%3==0){
      return false;
    }
    for(int i=5;i<Math.sqrt(i);i++){
      if(n%i==0||n%(i+2)==0){
        return false;
      }
    }
    return true;
  }
//   static boolean isprime(int n){
//     for(int i=2;i<=Math.sqrt(n);i++){ //n/2
//  // n/2 we use as a place of Math.sqrt this funct tc is O(root n)
//       if(n%i==0){ //n/2-1
//         return false;//1
//       }
      
//     }
//     return true;//1  total 2(n/2)
//   }
  public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    System.out.println(checkprime(n));
  }
}


