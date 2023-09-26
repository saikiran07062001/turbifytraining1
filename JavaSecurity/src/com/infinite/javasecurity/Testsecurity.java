package com.infinite.javasecurity;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;;

public class Testsecurity {
	private static final Logger logger = Logger.getLogger(JavaSecurity.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");

		final String secretKey = "bcd312";

		String originalString = "MYSQL123@";

		String encryptedString = JavaSecurity.encrypt(originalString, secretKey);

		String decryptedString = JavaSecurity.decrypt(encryptedString, secretKey);

		logger.info(originalString);
		logger.info(encryptedString);
		logger.info(decryptedString);
	}
}
