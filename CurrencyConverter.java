package package1;

import java.util.Scanner;



public class CurrencyConverter {
	public static void main(String[] args) {
		 double amt;
			String fromCurr;
			String toCurr;
			double exchangeRate,convAmt;
			
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter amount you want to convert: ");
		amt=sc.nextDouble();
		
		System.out.println("Enter the currency u want to convert from(USD or RUPPES): ");
		fromCurr=sc.next();
		System.out.println("To(USD or RUPEES): ");
		toCurr=sc.next();
	
		System.out.print("Exchange rate is: ");
	if(fromCurr.equalsIgnoreCase("usd") && toCurr.equalsIgnoreCase("rupees")) {
		exchangeRate=83.61;
		convAmt=amt*exchangeRate;
		System.out.println(exchangeRate+" rs");
		System.out.println("\nConverted amount is: "+convAmt+" rs");
		
	}else if(fromCurr.equalsIgnoreCase("rupees") && toCurr.equalsIgnoreCase("usd")) {
		exchangeRate=0.012;
		convAmt=amt*exchangeRate;
		System.out.println(exchangeRate+" USD");
		System.out.println("\nConverted amount is: "+convAmt+" USD");
	}else {
		System.out.println("ERROR!!");
	}
	
	
	}

}
