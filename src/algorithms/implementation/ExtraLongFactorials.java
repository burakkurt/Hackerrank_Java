package algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {

	public static void main(String[] args) {
		
		//Getting the number factorial of it will be calculated
		Scanner in = new Scanner(System.in);
		BigInteger number = in.nextBigInteger();
		
		//calling and printing result of factorial method
		System.out.println(calcFactorial(number));
	}
	
	/**
	 * Returns factorial of parameter named number by using recursion
	 * @param number is the number that factorial of it will be calculated
	 * @return BigInteger  factorial number of parameter
	 */
	public static BigInteger calcFactorial(BigInteger number){
		if(number.equals(BigInteger.ONE))
			return BigInteger.ONE;
		else
			return calcFactorial(number.subtract(BigInteger.ONE)).multiply(number);
	}

}
