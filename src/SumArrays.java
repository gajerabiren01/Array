public class SumArrays {

    public static void main(String[] args) {


        int[] numbers =  {1,2,3,4,5};
        int sum = 0;

        for (int i = 0; i<numbers.length;i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Sum of all the elements in an array is " + sum);

    }

}
