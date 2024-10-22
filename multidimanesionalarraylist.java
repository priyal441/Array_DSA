import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

public class multidimanesionalarraylist {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
    ArrayList<Integer> List1=new ArrayList<>();
    ArrayList<Integer> List2=new ArrayList<>();
    ArrayList<Integer> List3=new ArrayList<>();
    for(int i=1;i<=5;i++){
      List1.add(i*1);//1 2 3 4 5
      List2.add(i*2);//2 4  6 8 10
      List3.add(i*3);//3 6 9 12 15


    } 
    mainList.add(List1);
    mainList.add(List2);
    mainList.add(List3);
    //nestedloop
    for(int i=0;i<mainList.size();i++){
      ArrayList<Integer> cuArrayList=mainList.get(i);
      for(int j=0;j<cuArrayList.size();j++){
        System.out.print(cuArrayList.get(j)+" ");
      }
      System.out.println();
    }

    // ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
    // ArrayList<Integer>List=new ArrayList<>();
    // List.add(3);List.add(9);
    // mainlist.add(List);

    // ArrayList<Integer> List2=new ArrayList<>();
    // List2.add(8);List2.add(7);
    // mainlist.add(List2);
    // for(int i=0;i<mainlist.size();i++){
    //   ArrayList<Integer> cuArrayList=mainlist.get(i);
    //   for(int j=0;j<cuArrayList.size();j++){
    //     System.out.print(cuArrayList.get(j)+" ");
    //   }
    //   System.out.println(mainlist);
    //   System.out.println();
    // }

  }
}
