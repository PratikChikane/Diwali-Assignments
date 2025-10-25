import java.util.Scanner;

public class AlphanumericCheck {
     public static boolean isAlphanumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return false; 
            }
        }
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (isAlphanumeric(str)) {
            System.out.println("The string contains only alphanumeric characters.");
        } else {
            System.out.println("The string contains special characters.");
        }
    }

   
}
