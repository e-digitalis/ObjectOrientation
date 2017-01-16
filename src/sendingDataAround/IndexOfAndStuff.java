package sendingDataAround;

public class IndexOfAndStuff {

	// methods can be put here above main

	public static void main(String[] args) {
		// methods can NOT be put inside of main - won't work

		// the program will ONLY run things that are inside the main
		// if methods are separate - they MUST be called in the main

		String myGottenName = getMyName();
		String myGottenFirstName = getFirstName(getMyName());
		String myGottenLastName = getLastName(getMyName());

		// this function is static so you can call it w/o instantiating it
		// it's also in italics (at least in Eclipse)
		displayMyName(myGottenName);
		displayMyName(myGottenFirstName);
		displayMyName(myGottenLastName);


	} // end of main
		// methods can also be put here below main

	public static String getMyName() {
		String myName = "Lissie Li";
		// return "Lissie Li"; //alternative coding
		return myName;
	}

	public static void displayMyName(String myName) {
		// System.out.println("My name is Lissie Li.");
		System.out.println(myName);
	}

	public static String getFirstName(String fullName) {
		int spaceIndex = fullName.indexOf(' ');
		String firstName = fullName.substring(0, spaceIndex);
		return firstName;
	}
	
	public static String getLastName(String fullName) {
		int spaceIndex = fullName.indexOf(' ');
		String firstName = fullName.substring((spaceIndex + 1), fullName.length());
		return firstName;
	}

}

// anything outside the curly brackets is outside of the program
// methods can NOT be put here - they can't be run
