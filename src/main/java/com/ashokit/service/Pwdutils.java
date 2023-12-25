package com.ashokit.service;

import java.util.Base64;
import java.util.Base64.Encoder;

public class Pwdutils {

	public String encodePwd(String pwd) {
System.out.println("Hellow Rajesh");
		Encoder encoder = Base64.getEncoder();
		byte[] encode = encoder.encode(pwd.getBytes());
		String encodePwd = new String(encode);
		return encodePwd;
	}
}
