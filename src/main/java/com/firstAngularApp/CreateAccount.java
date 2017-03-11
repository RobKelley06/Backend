package com.firstAngularApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

public class CreateAccount {

	public String createAccount(String username, String password, String cpassword, String email, String cemail) {
		if (!cpassword.equals(password)) {
			return "Passwords do not match";
		}
		if (!cemail.equals(email)) {
			return "Emails do not match";
		}
		String path = "src/main/resources/users/" + username + ".properties";
		File varTmpDir = new File(path);
		if (!varTmpDir.exists()) {
			try {
				PrintWriter writer = new PrintWriter(path, "UTF-8");
				writer.write("password=" + password);
				writer.write("\nemail=" + email);
				writer.close();

				Properties userProperties = new Properties();
				FileInputStream in = new FileInputStream(path);
				userProperties.load(in);
				in.close();

				//userProperties.setProperty("password", "aserg");

				FileOutputStream out = new FileOutputStream(path);
				userProperties.store(out, "");
				out.close();

				return "Successful";
			} catch (IOException e) {
				System.out.println(e);
				return "Failed";
			}
		} else {
			return "Username Unavailable";
		}

	}

}