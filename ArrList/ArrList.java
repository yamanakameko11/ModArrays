
/**
 * Write a description of class ArrList here.
 *
 * @author Kameko Yamanaka
 * @version 1.18.18
 */
import java.util.ArrayList;
import java.util.List; //interface (not a class)
import java.util.Scanner;
import java.lang.Integer;
public class ArrList
{
    ArrayList list;
    public ArrList(){
        list = new ArrayList();
        list.add("Hot Pockets");
        list.add("Cookies");
        list.add("Egg");
        list.add(new Scanner(System.in));
        list.add(new Integer(2));
        System.out.println(list.size());
    }
    
    public void printList(){
        System.out.println("Your shopping list contains...");
        System.out.println();
        for(Object i: list){ //enhanced for EACH loop
            System.out.println(i);
        }
    }
}
