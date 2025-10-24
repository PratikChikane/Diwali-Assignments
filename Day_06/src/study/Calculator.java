package study;

public class Calculator {
public static int calculate(int number1, int number2, String operator) throws WrongOperatorException {
	
	switch(operator) {
	case "+":
		return number1 + number2;
	case "-":
		return number1 + number2;
	case "*":
		return number1 * number2;
	case "/":
		if(number2==0) throw new ArithmeticException("division by zero not allowed");
		return number1/number2;
	case "%":
		if(number2==0) throw new ArithmeticException("Modulo by zero not allowed");
	
		default:
			throw new WrongOperatorException("Invalid operator:"+ operator);
	}
	
}
}
