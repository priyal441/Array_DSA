import java.util.Scanner;

public class lcm {
  // brute
  public static int findlcm(int a, int b) {
    int res = Math.max(a, b);
    while (true) {
      if (res % a == 0 && res % b == 0) {
        break;
      }
      res++;
    }
    return res;
  }

  // euclid approcah
public static int euclidlcm(int a,int b) {
return (a*b)/gcdhcd.gabrielgcd(a, b);
}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(findlcm(a, b));
System.out.println(euclidlcm(a, b));

  }
}
