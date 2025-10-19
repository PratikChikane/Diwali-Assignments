import java.util.Scanner;

public class GeneratePrime {

    public static boolean isPrime(int n){

        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Range to print Prime numbers");
        int num = sc.nextInt();
       for(int i=2;i<=num;i++){
        if(isPrime(i)){
           System.out.println(i+" "); 
        }}

       sc.close();
    }
    
}
