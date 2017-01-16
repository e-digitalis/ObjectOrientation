package sendingDataAround;

import java.util.Scanner;

public class DeansOne {

	public static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(actualQuestionTimesThree());
		String capturedNumberString = captureUserNumber();
		int capturedNumberInt = stringToInt(capturedNumberString);
		int multiplyThreeResult = threeMultiplier(capturedNumberInt); 
		System.out.println(multiplyThreeResult);
	}

	public static String actualQuestionTimesThree(){
		String questionThree = "Which number do you want to multiply by three? Please enter the desired number: ";
		return questionThree;
	}

	public static String captureUserNumber(){
		String userInputString = myScanner.nextLine();
		return userInputString;	
	}

	public static int stringToInt(String userInput){
		int userInputInt = Integer.parseInt(userInput);
		return userInputInt;	
	}

	public static int threeMultiplier(int anyNumber){
		int multipliedResult = anyNumber * 3;
		return multipliedResult;
	}

}

//Okay, create a method that multiplies an int by 3, and returns the result. Assign the result to an int called multipliedValue. 
//
//Use the a method called, multiplyMe, and pass in the int to be multiplied.
//
//For example.
//
//public static int multiplyMe(int n){
//return n*3;
//}