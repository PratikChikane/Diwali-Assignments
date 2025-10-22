import java.util.Scanner;

public class MissingNum {
    public static int findMissingNumber(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2; 
        int arraySum = 0;

        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " numbers (from 0 to " + n + ", one missing):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int missing = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missing);

        sc.close();
    }
}
