package Solutions;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// Write your code here.

		NumberFormat usFor = NumberFormat.getCurrencyInstance(Locale.US);
		NumberFormat inFor = NumberFormat.getCurrencyInstance(new Locale("en","In"));
		NumberFormat chFor = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat frFor = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		
		String us = usFor.format(payment);
		String india = inFor.format(payment);
		String china = chFor.format(payment);
		String france = frFor.format(payment);
		

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
