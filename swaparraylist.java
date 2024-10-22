import java.util.ArrayList;

public class swaparraylist {
  public  static void  swaptwono(ArrayList<Integer> swap ,int idx1,int idx2){
int temp=swap.get(idx1);
swap.set(idx1,swap.get(idx2));
swap.set(idx2,temp);
  }
  public static void main(String[] args) {
    ArrayList<Integer> swap=new ArrayList<>();
    swap.add(1);
    swap.add(2);
    swap.add(3);
    swap.add(4);
    swap.add(5);

int idx1=1;
int idx2=3;
swaptwono(swap,idx1,idx2);

System.out.println(swap);
    }
  }

