import java.util.Scanner;

public class SumOfOdd {
    public static int sumOfOddNumbers(int n) {
        int sum = 0;
        int odd = 1;
        for (int i = 1; i <= n; i++) {
            sum += odd;
            odd += 2; 
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many odd numbers you want to sum: ");
        int n = sc.nextInt();
        int sum = sumOfOddNumbers(n);
        System.out.println("The sum of the first " + n + " odd numbers is: " + sum);
        sc.close();
    }

}
