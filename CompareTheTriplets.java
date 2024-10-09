import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CompareTheTriplets {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        int aSum = 0;
        int bSum = 0;
        for (int i=0; i<3; i++){
            if(a.get(i) < b.get(i)){
                bSum++;
            }
            else if(a.get(i) > b.get(i)){
                aSum++;
            }
        }
        List<Integer> result = new ArrayList<>();
        result.add(aSum);
        result.add(bSum);
        return result;
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        List<Integer> Alice = new ArrayList<>();
        for (int i = 1; i <= 3; i++){
            System.out.printf("Enter value A[%d]::",i);
            int value = scanner.nextInt();
            Alice.add(value);

            if(value < 1 || value > 100){
                System.out.printf("Invalid value.");
                return;
            }
        }
        System.out.println(Alice);

        List<Integer> Bob = new ArrayList<>();
        for (int i = 1; i <= 3; i++){
            System.out.printf("Enter value B[%d]::",i);
            int value = scanner.nextInt();
            Bob.add(value);

            if(value < 1 || value > 100){
                System.out.printf("Invalid value.");
                return;
            }
        }
        System.out.println(Bob);

        List<Integer> result = compareTriplets(Alice, Bob);
        System.out.println("Result: " + result);
    }
}
