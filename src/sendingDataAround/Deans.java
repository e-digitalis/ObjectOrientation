package sendingDataAround;

import java.util.Scanner;

public class Deans {
	
	static DesiredOperation userChoice;

	public static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		String start = choice();
		System.out.println(start);
		String rawSelection = selection();
		String trimmedSelection = trimmer(rawSelection);
		String lowTrimmedSelection = lower(trimmedSelection);
		boolean checkedSelection = checker(lowTrimmedSelection);
		doEnumConversion(checkedSelection, lowTrimmedSelection);
		switchChoice(lowTrimmedSelection);
	}

	public static String choice() {
		String question = "Do you want to multiply by three or choose yourself? Please write either \"Three\" or \"Choice\".";
		return question;
	}

	public static String selection() {
		String desiredMultiplication = myScanner.nextLine();
		return desiredMultiplication;
	}

	public static String trimmer(String userSelection) {
		String trimmedSelection = userSelection.trim();
		return trimmedSelection;
	}

	public static String lower(String userSelection) {
		String lowerCaseSelection = userSelection.toLowerCase();
		return lowerCaseSelection;
	}

	public static boolean checker(String userSelection) {
		if (userSelection == "three" || userSelection == "choice") {
			return true;
		} else {
			return false;
		}
	}

	public static void doEnumConversion(boolean checker, String trimmedLoweredSelection) {
		if (checker) {
			switchChoice(trimmedLoweredSelection);
		} else {
			String three = "Three";
			String choice = "Choice";
			System.out.println(
					"You must enter the correct input. Please write either \"" + three + "\" or \"" + choice + "\".");
		}
	}

	public static boolean switchChoice(String userSelection){
		
		switch (userSelection){
		case "three":
			userChoice = DesiredOperation.THREE;
			boolean thirdBoolean = true;
			multiplyByThree(thirdBoolean);
			return thirdBoolean;	
		case "choice":
			userChoice = DesiredOperation.CHOICE;
			boolean anyBoolean = true;
			multiplyByAnything(anyBoolean);
			return anyBoolean;	
		default:
			boolean wrongBoolean = false;
			System.out.println("Something went horribly wrong.");
			return wrongBoolean;
		}
	}

	public static void multiplyByThree(boolean three) {
		if (three == true && userChoice == DesiredOperation.THREE) {
			String theQuestion = (actualQuestionTimesThree());
			System.out.println(theQuestion);
			String capturedNumberString = captureUserNumber();
			int capturedNumberInt = stringToInt(capturedNumberString);
			int multiplyThreeResult = threeMultiplier(capturedNumberInt);
			System.out.println(multiplyThreeResult);
		} else {
			System.out.println("There was some error - we should never reach this point.");
		}
	}

	public static void multiplyByAnything(boolean anything) {
		if (anything == true && userChoice == DesiredOperation.CHOICE) {
			String theQuestion = (actualQuestionTimesAnything());
			System.out.println(theQuestion);
			String capturedNumberString = captureUserNumber();
			int capturedNumberInt = stringToInt(capturedNumberString);
			String newQuestion = (multiplyWith());
			System.out.println(newQuestion);
			String capturedNewString = captureUserNumber();
			int capturedNewInt = stringToInt(capturedNewString);
			int multiplyAnyResult = anyMultiplier(capturedNumberInt, capturedNewInt);
			System.out.println(multiplyAnyResult);
		} else {
			System.out.println("There was some error - we should never reach this point.");
		}
	}

	public static String actualQuestionTimesAnything() {
		String questionChoice = "Which number do you want to multiply? Please enter the desired number: ";
		return questionChoice;
	}
	
	public static String multiplyWith() {
		String questionMultiply = "Which number do you want to multiply it with? Please enter the desired number: ";
		return questionMultiply;
	}

	public static String captureUserNumber() {
		String userInputString = myScanner.nextLine();
		return userInputString;
	}

	public static int stringToInt(String userInput) {
		int userInputInt = Integer.parseInt(userInput);
		return userInputInt;
	}

	public static int anyMultiplier(int anyNumber, int anyMultiplier) {
		int multipliedResult = anyNumber * anyMultiplier;
		return multipliedResult;
	}

	public static String actualQuestionTimesThree() {
		String questionThree = "Which number do you want to multiply by three? Please enter the desired number: ";
		return questionThree;
	}

	public static int threeMultiplier(int anyNumber) {
		int multipliedResult = anyNumber * 3;
		return multipliedResult;
	}

}

// Okay, create a method that multiplies an int by 3, and returns the result.
// Assign the result to an int called multipliedValue.
//
// Use the a method called, multiplyMe, and pass in the int to be multiplied.
//
// For example.
//
// public static int multiplyMe(int n){
// return n*3;
// }