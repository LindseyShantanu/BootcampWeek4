import java.util.*;

public class Week3_4CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = {3,9,23,64,2,8,28,93};
			//a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println(ages[ages.length-1] - ages[0]);
		
			//b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] ages2 = {3,9,23,64,2,8,28,93,0};
		
			//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for(int i=0; i<ages.length; i++) {
			sum += ages[i];
		}
		int avg = sum/ages.length;
		System.out.println(avg);
		
		//2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		System.out.println(build(names));
		//a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int count = 0;
		for(String name:names) {
			count += name.length();
		}
		int average = count/names.length;
		System.out.println(average);
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String allNames ="";
		for(String name:names) {
			allNames += name+ " ";
		}
		System.out.println(allNames);
		
		//3. How do you access the last element of any array?
		System.out.println(names[names.length-1]); 
		
		//4. How do you access the first element of any array?
		System.out.println(names[0]);
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[6];
		for(int i=0; i<nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		System.out.println(Arrays.toString(nameLengths)); 
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int nameSum =0;
		for(int n:nameLengths)
			nameSum += n;
		System.out.println(nameSum);
	}
	
	//7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	public static String multiplyString(String word, int n) {
		String str = "";
		for(int i=0; i<n; i++) {
			str += word;
		}
		return str;
	}
	
	//8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String getFullName(String fn, String ln) {
		return fn + " " + ln;
	}
	
	//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean bigNum(int[] nums) {
		int sum=0;
		for(int num:nums)
			sum += num;
		if(sum>100)
			return true;
		return false;
	}
	
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double average(double[] nums) {
		double sum = 0.0;
		for(double num:nums)
			sum += num;
		return sum/nums.length;
	}
	
	//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	public static boolean firstGreater(double[] arr1, double[] arr2) {
		//find average of arr1
		double avg1 = 0.0;
		for(double num:arr1)
			avg1 += num;
		avg1 /= arr1.length;
		//find average of arr2
		double avg2 = 0.0;
		for(double num:arr2)
			avg2 += num;
		avg2 /= arr2.length;
		if(avg1 > avg2)
			return true;
		return false;
	}
	
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket>10.5)
			return true;
		return false;
	}
	
	//13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	/*
	 * This method takes an array of strings and puts them all together in a String Builder.
	 */
	public static StringBuilder build(String[] arr) {
		StringBuilder str = new StringBuilder();
		for(int i=0; i<arr.length; i++) {
			str.append(arr[i]);
			if(!(arr[i].endsWith(" ")))
				str.append(" ");
		}	
		return str;
	}
		

}
