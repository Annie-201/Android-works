package Genpact_Day_2;

class CalculatorD{
	void addition(int a, int b) {
		System.out.println("The sum of operands : "+(a+b));
	}
	
	void addition(String s1, String s2) {
		System.out.println("The string after concatenation "+(s1+s2));
	}
	
	void substraction(int p, int q) {
		System.out.println("The subtration of numbers is : "+(p-q));
	}
	
	void substration(double d, double e) {
		System.out.println("Decimal point substraction "+(d-e));
	}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.addition(5, 4);
		c1.addition("Amit", "Khungwal");
		c1.substraction(10, 5);
		c1.substration(11.55, 5.50);

	}

}