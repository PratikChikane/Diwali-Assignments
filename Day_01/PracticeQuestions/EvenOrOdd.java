import java.util.Scanner;

public class EvenOrOdd {
    public static void chechEvenOdd(int n){
        if(n%2==0){
            System.out.println(n + "is Even Number");
        }else{
            System.out.println(n + "is Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter s Number:");
        int n = sc.nextInt();

        chechEvenOdd(n);

        sc.close();
    }
}
