import java.util.Scanner;

public class jobwork {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int t = sc.nextInt();  // Test cases input
    while (t-- > 0) 
    //Yeh while loop hai jo tab tak chalega jab tak t (test case ka count) zero se zyada hai. t-- ka matlab hai ki har baar loop ke chalne par t ka value 1 se kam hota rahega.{  // t ke value ko decrement karte hue check karo
      
      int n = sc.nextInt();  // string length input
      char ch[] = sc.next().toCharArray();  // input ko char array me convert karo
      
      int q = 0;  // 'Q' ke count ko track karega
      
      // Loop chalayenge har character ke liye
      for (int i = 0; i < n; i++) {
        if (ch[i] == 'Q') {
          q++;  // 'Q' ka count badhaye
        } else {
          q = Math.max(0, q - 1);  // agar 'A' mila to 'Q' ka count ghatao lekin 0 se neeche nahi jaane do
        }
      }
      
      // Agar q zero ho gaya, matlab saare 'Q' cancel ho gaye, to yes print karo
      if (q == 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");  // Agar kuch 'Q' cancel nahi ho paaye to no print karo
      }
    }
    sc.close();
  }
}


   
  
