import java.util.Scanner;
import java.math.BigInteger;

public class extraLongFactorials {

    public static void getExtraLongFactorials(int n) {
        // Write your code here
        BigInteger factorial;
        factorial = BigInteger.valueOf(1);
        for (int i = 1; i < n + 1; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.print(factorial);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value:::");
        int number = scanner.nextInt();

        getExtraLongFactorials(number);;
    }
}
