import java.util.Scanner;

public class gcdhcd {
  public static int gabrielgcd(int a,int b){
    while(a!=0&&b!=0){
if(a>b){
  a=a%b;
}else{
  b=b%a;
}
    }
    if(a!=0){
      return a;
    }
    else{
      return b;
    }
  }
  //Euclid approach
//   public static int ellucid(int a,int b){
// while(a!=b){
//   if(a>b){
//     a=a-b;
//   }
//   else{
//     b=b-a;
//   }
// }
// return a;
//   }
  //brute force
  // public static int brutegcd(int a,int b){

  //   int min=0;
  //   if(a>b){
  //     min=b;
  //   }else{
  //     min=a;
  //   }
  //   for(int i=min;i>=0;i--){
  //     if(a%i==0 &&b%i==0){
  //     return i;
  //   }
  // }
  //   return 1;
  // }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
   // System.out.println(brutegcd(a, b));
    System.out.println(gabrielgcd(a, b));
    
  }
}
