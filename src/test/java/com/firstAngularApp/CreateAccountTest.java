package com.firstAngularApp;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class CreateAccountTest {

	@Test
	public void testCreateAccount() {
		CreateAccount c = new CreateAccount();
		Assert.assertEquals("Impeded", c.createAccount("test2", "pass2"));
	}

}
