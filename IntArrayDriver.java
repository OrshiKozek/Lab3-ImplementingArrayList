import java.util.*;

public class IntArrayDriver {

 public static void main(String[] args)
 {
    MyIntArrayList array = new MyIntArrayList();
    for(int i=1; i<=5; i++){
      array.addInteger(i*2);
    }
    System.out.println(array);

    array.setInteger(1,100);
    System.out.println(array);
    array.addInteger(500);
    System.out.println(array);
    array.addInteger(0,900);
    System.out.println(array);
    array.removeInteger(3);
    System.out.println(array);
   } 
}