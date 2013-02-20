/*
 * File: Factorial.java
 * ================================================================
 * A program that shows off computing factorials
 */
import acm.program.*;

public class Factorial extends ConsoleProgram {
	public void run() {
		setFont("DejaVuSerif-BOLD-24");
		
		println("10! = " + factorial(10));
		println("5! = " + factorial(5));
	}
	
	private int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
