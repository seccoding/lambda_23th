package fp_java.ch01.lambda.custominf;

public class CustomInfMain {

	public static void main(String[] args) {
		
		// Airline
			// public int getFee(int personCount);
		Airline airline = (personCount) -> personCount * Airline.ADULT_FEE;
		int fee = airline.getFee(10);
		System.out.println(fee);
		
		
		// Calculatable
			// public void printAddResult(int number1, int number2);
		Calculatable calc = (number1, number2) -> System.out.println(number1 + number2);
		calc.printAddResult(100, 10);
	}
	
}
