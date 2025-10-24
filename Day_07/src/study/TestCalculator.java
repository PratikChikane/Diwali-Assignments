package study;

import java.util.Scanner;

public class TestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter first Number:");
			int num1 = sc.nextInt();
			
			System.out.println("Enter second number:");
			int num2 = sc.nextInt();
			
			System.out.println("Enter operator (+,-,*,/,%):");
			String operator = sc.next();
			
			int result = Calculator.calculate(num1, num2, operator);
			System.out.println("Result:"+ result);
		}
		catch(WrongOperatorException e) {
			System.out.println("Error:"+e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("Math Error:"+ e.getMessage());
		}
		finally {
			sc.close();
		}

	}

}
