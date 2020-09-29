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
	// Tests for first name

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
	// Tests for last name

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
		assertEquals(false, result);
	}

	@Test
	public void givenMobileNumber_WhenNotTenDigits_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateMobile("91 987654321");
		assertEquals(false, result);
	}
	// Tests for mobile number

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("abc@yahoo.com");
		assertEquals(true, result);
	}

	@Test
	public void givenEmail_ProperSecondLevelDomain_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("abc.100@abc.com.au");
		assertEquals(true, result);
	}

	@Test
	public void givenEmail_InvalidTLD_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("abc@123.c");
		assertEquals(false, result);
	}

	@Test
	public void givenEmail_HavingMultipleTLD_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("abc@gmail.com.aa.au");
		assertEquals(false, result);
	}
	// Tests for Email ID

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassword("aBcd123@m");
		assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenProperCase2_ShouldReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassword("@ABC12345");
		assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassword("ball@1234");
		assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenNoSpecialChar_ShouldReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatePassword("Apple98765");
		assertEquals(false, result);
	}
	// Tests for password

}
