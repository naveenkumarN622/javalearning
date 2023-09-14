package javalearning;

public class FactorialObj {
	
	//Inside class, we will have 2 things one is method and variable
	
	//method is created for storing the logic of the program
	int employeeAge=100;
	
	
	public void factorialCalculation()
	{
		int number = 5;
		int factorial = 1;
		for (int i=1; i<=number; i++) {
			factorial = factorial * i;
			
		}
		System.out.println("Factorial is: "+factorial);
	}
	
	public void factorialCalculationWithNos(int num)
	{
		int factorial = 1;
		for (int i=1; i<=num; i++) {
			factorial = factorial * i;
			
		}
		System.out.println("Factorial is: "+factorial);
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			//classname obj = new classname
			FactorialObj fact= new FactorialObj();
			fact.factorialCalculation();
			fact.factorialCalculationWithNos(6);
			System.out.println("The value of employee age is "+fact.employeeAge);
			
			
			// we can create n no of objects to a class
			FactorialObj fact1= new FactorialObj();
			fact1.factorialCalculation();
			fact1.factorialCalculationWithNos(10);
			
			FactorialObj fact2= new FactorialObj();
			fact2.factorialCalculation();
			fact2.factorialCalculationWithNos(12);

	}

}

