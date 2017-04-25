/*******  STILL to finish ******/

public class Ex8SalaryWithReturns {

	public static void main(String [] arg) { 
		/* This line creates an instance of Ex8SalaryWithReturns 
		and calls it ex8.  I can then call all methods in this class 
		using ex8. */
		Ex8SalaryWithReturns ex8 = new Ex8SalaryWithReturns();
		
		double salary = 30_000;
		ex5.printMonthlySalary(salary);
		ex5.salaryAfterPayRise(salary, 4);
		ex5.salaryAfterPayRise(salary, 6);
	}
	
	/*
		salary is the yearly salary.
		payRise is the percentage pay rise, e.g. 4%.
	*/					//                30000			4
	public void salaryAfterPayRise(double salary, double payRise) {
		double result = salary + (salary * (payRise / 100));
		System.out.printf("Salary after pay rise %.2f\n", result);	
	}
			//								30000					
	public void printMonthlySalary(double yearlySalary) {
		double salary = yearlySalary / 12;   // 2500
		
		System.out.printf("Monthly salary is : %.2f\n", salary);
	}
}