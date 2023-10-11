import java.util.Scanner;

public class IndexOfElement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Sample array
        int[] numbers = {10, 20, 30, 40, 50};

        // Element to find
        int targetElement = scanner.nextInt();

        int index = -1; // Initialize with -1, indicating not found

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == targetElement) {
                index = i; // Element found, store its index
                break; // No need to continue searching once found
            }
        }

        if (index != -1) {
            System.out.println("The element " + targetElement + " is at index " + index);
        } else {
            System.out.println("The element " + targetElement + " was not found in the array.");
        }


        }




    }



