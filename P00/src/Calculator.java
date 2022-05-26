
/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 21012537, 26 May 2022 11:31:13 am
 */

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	public int subtract(int a, int b) {
		return a - b;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public int divide(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("Division by zero is not supported");
		}
		return a / b;
	}
	public double power(int a, int b) {
		return Math.pow(a,b);
	}
}
