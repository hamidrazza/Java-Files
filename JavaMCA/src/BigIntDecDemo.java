import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;

class BigIntDecDemo{
	public static void main(String[] args){
	
		Scanner scan = new Scanner(System.in);
		// BigInteger Demo
		System.out.println("-------- Big Integer Example --------");
		
		System.out.print("Enter the first element : ");
		BigInteger b1 = scan.nextBigInteger();
		
		System.out.print("Enter the second element : ");
		BigInteger b2 = scan.nextBigInteger();
		
		BigInteger b3 = b1.add(b2);
		System.out.println("The addition of BigInteger : " + b3 + "\n");
		
		// BigDecimal Demo
		System.out.println("-------- Big Decimal Example --------");
		
		System.out.print("Enter the first element : ");
		BigDecimal d1 = scan.nextBigDecimal();
		
		System.out.print("Enter the second element : ");
		BigDecimal d2 = scan.nextBigDecimal();
		BigDecimal d3 = d1.subtract(d2);
		System.out.println("The subtraction of BigDecimal : " + d3);
	}
}