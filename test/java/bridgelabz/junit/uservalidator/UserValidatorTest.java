package bridgelabz.junit.uservalidator;

import static org.junit.Assert.*;

import org.junit.Test;

import bridgelabz.junit.uservalidator.UserValidator;

public class UserValidatorTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Rachit");
		assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Ra");
		assertEquals(false, result);
	}

	@Test
	public void givenFirstName_WhenNotCaps_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("rachit");
		assertEquals(false, result);
	}

	@Test
	public void givenFirstName_WhenSpecialChar_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Rachit$");
		assertEquals(false, result);
	}
	//Tests for first name

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Shukla");
		assertEquals(true, result);
	}
	
	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Sh");
		assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenNotCaps_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("shukla");
		assertEquals(false, result);
	}
	
	@Test
	public void givenLastName_WhenSpecialChar_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Shukla$");
		assertEquals(false, result);
	}
	//Tests for last name
	@Test
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateMobile("91 9876543210");
		assertEquals(true, result);
	}
	
	@Test
	public void givenMobileNumber_WhenCodeMoreThanTwoDigits_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateMobile("124 9876543210");
		assertEquals(true, result);
	}
	
	@Test 
	public void givenMobileNumber_WhenHasAnyNonNumeric_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateMobile("91 9876a43210");
		assertEquals(false,result);
	}
	
	@Test 
	public void givenMobileNumber_WhenNotTenDigits_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateMobile("91 987654321");
		assertEquals(false,result);
	}
	

}
