import java.util.Arrays;
import java.util.List;

public class SumofArray {
    // You can use either the array or the List in the main method
    static int ar[] = {12, 3, 4, 15};

    // Method for sum of elements in a List
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Convert the array to a List using Arrays.asList
        List<Integer> arrayAsList = Arrays.asList(12, 3, 4, 15);

        System.out.println("Sum of the given array is ::" + simpleArraySum(arrayAsList));
    }
}
