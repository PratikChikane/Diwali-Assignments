import java.util.Scanner;
public class Factorial {
    public static long factorial(int n){
        long result =1;

        for(int i=1;i<=n;i++){
            result = result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to find fcatorial:");
        int n= sc.nextInt();
        
        System.out.println("Factorial of "+ n + " is : " + factorial(n));
    }
}
