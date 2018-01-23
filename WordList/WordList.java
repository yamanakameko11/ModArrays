
/**
 * Write a description of class WordList here.
 *
 * @author Kameko Yamanaka
 * @version 1.22.18
 */
import java.util.ArrayList;
import java.util.List;
public class WordList
{
    private ArrayList<String> myList;
    public WordList(){
        myList = new ArrayList<String>();
        myList.add("cat");
        myList.add("mouse");
        myList.add("frog");
        myList.add("dog");
        myList.add("dog");
    }

    public int numWordsOfLength(int len){ // returns number of words exactly len characters long
        int n = 0;
        for(String i:myList){
            if (i.length() == len){
                n++;
            }
        }
        return n;
    }

    public void removeWordsOfLength(int len){ // remove all str of length len from arraylist (DESTROYS PERSISTENT DATA)
        ArrayList<String> tempList = new ArrayList<String>();
        for(String i:myList){
            if(i.length() == len){
                tempList.add(i);
            }
        }
        myList.removeAll(tempList);
    }
    
    public void removeWOL(int len){ // print list of str in myList of len length (DOESN'T DESTROY PERSISTENT DATA)
        ArrayList<String> tempList = new ArrayList<String>();
        for(String i:myList){
            if(i.length() != len){
                tempList.add(i);
            }
        }
        System.out.println(tempList.toString());
    }

}
