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

}
