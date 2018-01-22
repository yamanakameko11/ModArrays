
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

    public int numWordsOfLength(int len){
        int n = 0;
        for(String i:myList){
            if (i.length() == len){
                n += 1;
            }
        }
        return n;
    }
    
    
    public void removeWordsOfLength(int len){

        for(String i:myList){
            if(i.length() == len){
                myList.add(i);
            }
        }
    }
    
}
