import java.util.Scanner;
public class printprime {
  public static void sieveprintp(int n){
    boolean[] prime=new boolean[n+1];
    for(int i=2;i*i<=n;i++){
      if(prime[i]==false){
        for(int j=i*i;j<=n;j+=i){
          prime[j]=true;
        }
      }
    }
    for(int i=2;i<=n;i++){
      if(prime[i]==false){
        System.out.println(i);
      }
    }// tc is O(rootnlog(log(n)))
  }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
sieveprintp(n);

 } 
}
