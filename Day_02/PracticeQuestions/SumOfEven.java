
import java.util.Scanner;

public class SumOfEven{
     public static int sumOfEvenNumbers(int n) {
        int sum = 0;
        int even = 2;
        for (int i = 1; i <= n; i++) {
            sum += even;
            even += 2;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many even numbers you want to sum: ");
        int n = sc.nextInt();
        int sum = sumOfEvenNumbers(n);
        System.out.println("The sum of the first " + n + " even numbers is: " + sum);

        sc.close();
    }

}
