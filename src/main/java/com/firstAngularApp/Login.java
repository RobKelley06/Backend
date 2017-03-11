package com.firstAngularApp;

import java.io.FileInputStream;
import java.util.Properties;

public class Login {

	public String login(String username, String password) {
		Properties defaultProps = new Properties();
		try {
			FileInputStream in = new FileInputStream("src/main/resources/users/"+username+".properties");
			defaultProps.load(in);
			in.close();
			
			System.out.println("Username Found");
			
			if (password.equals(defaultProps.getProperty("password"))){
				return "Successful";
			}
			else {
				return "Failed";
			}
		}
		catch(Exception e){
			System.out.println(e);
			return "Error";
		}
		
	}
}