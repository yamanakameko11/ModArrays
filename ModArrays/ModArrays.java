
/**
 * Write a description of class ModArrays here.
 *
 * @author Kameko Yamanaka
 * @version 1.18.18
 */
public class ModArrays
{
    int[] array = {1, 2, 3, 4, 5, 6};
    public ModArrays(){
        //blank consturctor to access array
    }

    public void changeNum(int num, int index){
        array[index] = num;
    }

    public void remove(int index){
        for(int i = index; i < array.length-1; i++){
                array[i] = array[i+1];
        }
        array[array.length-1] = 0;
    }

    public void addNum(int num, int index){
        for(int i = array.length-1; i < index; i--){
            array[i] = array[i-1];
        }
        array[index] = num;
    }
    
    public int[] getModArrays(){
        return array;
    }
}
