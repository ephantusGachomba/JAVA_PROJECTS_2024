import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VeryBigSum {

    //method to calculate sum of a list of long values
    public static long bigSum(List<Long> ar){
        long sum = 0;
        for (long num : ar){
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the size of array::");
        int sizeArray = myObj.nextInt();

        //Constraint: 1 <= n <= 10
        if (sizeArray < 1 || sizeArray > 10){
            System.out.println("Array size must be between 1 and 10.");
            return;
        }

        List<Long> arr = new ArrayList<>();


        //input values of array
        for(int i = 0; i < sizeArray; i++){
            System.out.printf("Value of arr[%d] (0 <= arr[i] <= 10^10): ", i);
            long value = myObj.nextLong();

            // Check if the value is within the allowed range
            if (value < 0 || value > 10000000000L){
                System.out.println("Array values must be between 0 and 10^10.");
                return;
            }

            arr.add(value); //add the valid values to the list
        }

        //calculate sum using bigSum method
        long sum = bigSum(arr);
        System.out.printf("The sum of the array is :: %d\n", sum);
        }
}
