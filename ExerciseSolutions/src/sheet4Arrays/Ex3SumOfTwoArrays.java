package sheet4Arrays;

public class Ex3SumOfTwoArrays {

	public static void main(String[] args) {
		
		int [] array1 = {2, 4, 6, 8, 10, 12, 14, 16};
		int [] array2 = {1, 2, 3, 4, 5, 6, 7, 8};
		
		Ex3SumOfTwoArrays ex3 = new Ex3SumOfTwoArrays();
		/* When you pass an array into a method, you pass the 
		 * array by its name, e.g. array1 or array2, */
		ex3.printMyArray(array1);
		ex3.printMyArray(array2);
		ex3.sumOfTwoArrays(array1, array2);
	}
	/**
	 * printf()
	 * % 	is called the conversion specifier, it means special
	 *   	conversion characters follow
	 * -	is to left align the argument
	 * 12	specifies a column width
	 * s	the argument is a String
	 * d	the argument is an int
	 */
	public void sumOfTwoArrays(int [] array1, int [] array2) {
		//System.out.println("Array 1\t\tArray 2\t\tSum");
		System.out.printf("%-12s%-12s%s\n", 
				          "Array 1", "Array 2", "Sum");
		for (int i = 0; i < array1.length; i++) {
			
			System.out.printf("%-12d%-12d%d\n", 
					array1[i], array2[i], array1[i] + array2[i]);
			
			//System.out.println(array1[i] + "\t\t" + array2[i] + 
			//		"\t\t" + (array1[i] + array2[i]));
		}
	}
	
	/*
	 * This method will print the contents of any array passed
	 * to it. When a method received an array, it must declare
	 * the parameter type fully, e.g. for an integer array, it
	 * will be     int [] myArray
	 */
	public void printMyArray(int [] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println(); // prints a newline after the loop
	}
	
	/**
	 * Two methods with the same name and a different parameter
	 * list is called method overloading. 
	 */
	public void printMyArray(double [] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		System.out.println(); // prints a newline after the loop
	}
}
/** OUTPUT
2 4 6 8 10 12 14 16 
1 2 3 4 5 6 7 8 
Array 1     Array 2     Sum
2           1           3
4           2           6
6           3           9
8           4           12
10          5           15
12          6           18
14          7           21
16          8           24
*/
