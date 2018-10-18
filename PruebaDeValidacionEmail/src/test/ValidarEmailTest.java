package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import email.ValidacionEmail;

public class ValidarEmailTest {

	private String email;
	private String email2;
	private ValidacionEmail validacionEmail;
	
	@Before
	public void setUp(){
		email = "chasqui1210.d@hotmail.com";
		email2 = "asda@gmail.com00";
		validacionEmail = new ValidacionEmail();
		
	}
	
	
	@Test
	public void test() {
		assertTrue(validacionEmail.validateEmail(email));
	}
	
	@Test
	public void test2(){
		assertFalse(validacionEmail.validateEmail(email2));
	}

}
