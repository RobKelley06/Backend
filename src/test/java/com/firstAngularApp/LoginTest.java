package com.firstAngularApp;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LoginTest {

	@Test
	public void testLogin() {
		Login l = new Login();
		Assert.assertEquals("Successful", l.login("test2", "aserg"));
		Assert.assertEquals("Failed", l.login("testing", "pass2"));
	}

}
