
import java.util.Arrays;

public class CommonElementString {


        public static void main(String[] args)//Main method
        {
            String[] array1 = {"hello","World","Dog","Cat"};
            String[] array2 = {"hello","World","Lion","Tiger"};

            System.out.println("Array1 : "+Arrays.toString(array1));
            System.out.println("Array2 : "+Arrays.toString(array2));


            for (int i = 0; i < array1.length; i++)//For loop for comparing elements of two array
            {
                for (int j = 0; j < array2.length; j++)
                {
                    if(array1[i] == (array2[j]))
                    {

                        System.out.println("Common element is : "+(array1[i]));
                    }
                }
            }

        }
    }




