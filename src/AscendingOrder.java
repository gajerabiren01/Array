import java.util.Arrays;


public class AscendingOrder {

    public static void main(String[] args) {

        int[] year = {1992,2021,1965,1947,1998,2023};//Array declared
        System.out.println("Original numeric array " + Arrays.toString(year));//original array
        Arrays.sort(year);
        System.out.println("Sorted numeric array " + Arrays.toString(year));//sorted array
    }

}
