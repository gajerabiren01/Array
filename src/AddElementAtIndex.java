
import java.util.Arrays;
public class AddElementAtIndex {


    public static void main(String[] args) {
        int[] numbers = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // Insert an element in 3rd position of the array (index->2, value->5)

        int indexPosition = 2;
        int newValue    = 5;

        System.out.println("Original Array : "+Arrays.toString(numbers));

        for(int i=numbers.length-1; i > indexPosition; i--){
            numbers[i] = numbers[i-1];
        }
        numbers[indexPosition] = newValue;
        System.out.println("New Array: "+Arrays.toString(numbers));
    }

}



