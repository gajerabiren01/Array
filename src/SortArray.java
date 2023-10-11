import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {


        String[] countries = {"Bharat","Australia","Japan","Israel","Nepal","England"};
        int[] year = {1992,2021,1965,1947,1998,2023};


        System.out.println("Original numeric array " + Arrays.toString(year));
        Arrays.sort(year);
        System.out.println("Sorted numeric array " + Arrays.toString(year));
        System.out.println("Original string array : "+Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println("Sorted string array : "+Arrays.toString(countries));



    }

}
