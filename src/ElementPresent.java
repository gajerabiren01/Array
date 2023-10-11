import java.util.Scanner;

public class ElementPresent {

    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int toFind = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < num.length; i++) {
//
            if (toFind == num[i]) {

                found = true;
            }


        }

        if (found) {
            System.out.println("Given Value " + toFind + " is in the num array");
        } else {
            System.out.println("Given value " + toFind + " is NOT in the num array");
        }


    }
}
