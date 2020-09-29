package bridgelabz.junit.uservalidator;

import java.util.Scanner;
import java.util.regex.*;

/**Refactored the code to include methods
 * 
 */

/**
 * @author Rachit
 *
 */
public class UserValidator {

	public boolean validateFirstName(String firstName) {
		String namePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
		return (firstName.matches(namePattern));
	}

	public boolean validateLastName(String lastName) {
		String namePattern = "^[A-Z]{1}[a-zA-Z]{2,}";
		return (lastName.matches(namePattern));
	}

	public boolean validateEmail(String email) {
		String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";
		return (email.matches(emailPattern));
	}

	public boolean validateMobile(String mobile) {
		String mobilePattern = "[0-9-]{1,}[ ][1-9]{1}[0-9]{9}";
		return (mobile.matches(mobilePattern));
	}

	public boolean validatePassword(String password) {
		String passwordPattern = "(?=.*[A-Z]+)(?=.*[0-9]+)(?=.*\\W).{8,}$";
		return password.matches(passwordPattern);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserValidator vObj = new UserValidator();
		
		System.out.println("Welcome to user registration");

		System.out.println("Please enter your first name:");
		String firstName = sc.nextLine();
		System.out.println("Please enter your last name:");
		String lastName = sc.nextLine();
		System.out.println("Enter Email ID");
		String email = sc.nextLine();
		System.out.println("Enter Mobile number");
		String mobile = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		// Inputs
		System.out.println("Valid first name: "+vObj.validateFirstName(firstName));
		System.out.println("Valid last name: "+vObj.validateLastName(lastName));
		System.out.println("Valid Email: "+vObj.validateEmail(email));
		System.out.println("Valid Mobile number: "+vObj.validateMobile(mobile));
		System.out.println("Valid password: "+vObj.validatePassword(password));
		// Patterns

	}

}
