import calculator.Calculator;

public class Main{
	public static void main(String args[]){
		Calculator calc_num= new Calculator();

		int sum= calc_num.add(40,50);
		int difference= calc_num.subtract(100,40);
		int product= calc_num.multiply(15,15);
		int quotient= calc_num.double_divide(625,25);
		
		System.out.println("Sum is: " + sum);
		System.out.println("Difference is: " + difference);
		System.out.println("Product is: " + product);
		System.out.println("Quotient is: " + quotient);
}
}
