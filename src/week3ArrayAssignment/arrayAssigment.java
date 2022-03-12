package week3ArrayAssignment;

public class arrayAssigment {
	// problem 7 method 
	public static String wordMultiplier(String word, int n) {
		
		String wordTimes = " "; 

		for (int i = 0; i < n ; i++ ) { 

			wordTimes += word; 

		}  

	return wordTimes; 
	} 
	
	// problem 8
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	
	
	// problem 9 method 
	public static boolean greaterThan(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		if (sum > 100) {
			return true;
		} else {
			return false;
		}
	}
	
	// problem 10 method 
	public static double averageArray(double[] listOfNum) {
		double added = 0;
		double averageOfArray = 0;
		
		for (int i = 0; i < listOfNum.length; i++) {
			added += listOfNum[i];
		}
		
		averageOfArray = added / listOfNum.length;
		
		return averageOfArray;
	
	}
	
	// problem 11 method
	public static boolean compareArrays(double[] array1, double[] array2) {
		double sum1 = 0;
		double avg1 = 0;
		double sum2 = 0;
		double avg2 = 0;
		
		for(int i = 0; i < array1.length; i++) {
			sum1 += array1[i];
		}
		
		for (int i = 0; i < array2.length; i++) {
			sum2 += array2[i];
		}
		
		avg1 = sum1 / array1.length;
		avg2 = sum2 / array2.length;
		
		if (avg1 > avg2) {
			return true;
		} else {
			return false;
		}
		
	}
	
	// problem 12 method 
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside == true && moneyInPocket > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	// problem 13 method: takes an two int arrays, creates a new array composed of the two arrays and returns the new array.
	public static void combine(int[] arr1, int[] arr2) {
		int[] combinedArray = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			combinedArray[i] = arr1[i];

			
		}
		for (int i = 0; i < arr2.length; i++) {
			combinedArray[arr1.length + i] = arr2[i];
		}
		
		
		for (int nums: combinedArray) {
			System.out.print(nums + " ");
		}
	}
	

	public static void main(String[] args) {
		// problem 1, section a
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 56};
		int result = ages[ages.length - 1] - ages[0];
		
		System.out.println("The result is: " + result);
		
		
		// problem 1, section b
		System.out.println("The result now is: " + result);
		
		
		//problem 1, section c
		int averageAge = 0;
		int sum = 0;
		
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		averageAge = sum / ages.length;
		
		System.out.println("Average age is: " + averageAge); 
		
		
		// problem 2, section a 
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int numOfLetters = 0;
		int averageLetters = 0;
		
		for (int i = 0; i < names.length; i++) {
			numOfLetters += names[i].length(); 
		}
		
		averageLetters = numOfLetters / names.length;
		
		System.out.println("The average number of letters per name is: " + averageLetters);
		
		
		// problem 2, section b a
		String namesAdded = " ";
		for (int i = 0; i < names.length; i++) {
			namesAdded += (names[i] + " ");
		}
		
		System.out.println("The names added are: " + namesAdded);
		
		
		// problem 5 
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			
		}
 		
		
		//problem 6
		int nameSum = 0;
		
		for (int i = 0; i < nameLengths.length; i++) {
			nameSum += nameLengths[i];
		}
		
		System.out.println("Sum of all elements in the array is: " + nameSum);
		
		
		// problem 7
		System.out.println("The word multiplied is: " + wordMultiplier("Hello", 3));
		
		//problem 8 
		System.out.println("Full name is: " + fullName("Micheal", "Jordan"));
		
		// problem 9
		System.out.println("Is the sum greater than 100? " + greaterThan(ages));
		
		// problem 10
		double[] someNums = {10.0, 20.0, 50.0, 42.0};
		System.out.println("The average of the array of type double is: " + averageArray(someNums));
		
		// problem 11
		double[] array1 = {12.4, 15.6, 104.2, 23.5};
		double[] array2 = {53.4, 23.1, 43.5, 26.4, 34.0};
		
		System.out.println("The average in the first array is greater than the average in the second: " + compareArrays(array1, array2));
		
		// problem 12
		System.out.println("Will buy a drink? " +  willBuyDrink(true, 20.40));
		
		// problem 13
		int[] num1Array = {14, 26, 30, 54, 654};
		int[] num2Array = {48, 22, 95, 30, 40};
		System.out.print("The combine array is: ");
		combine(num1Array, num2Array);
		
	}

}
