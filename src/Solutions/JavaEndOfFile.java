package Solutions;

import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. 
		 * Your class should be named Solution.
		 */
		Scanner scan = new Scanner(System.in);
		int n = 1;

		while (scan.hasNext()) {
			String line = scan.nextLine();
			System.out.println(n + " " + line);
			n++;
		}
		scan.close();
	}
}
