package com.tinhcao.spring.security;

import org.junit.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import junit.framework.TestCase;

public class PasswordEncoderTest extends TestCase {
	@Test
	public void testMd5Encode() {
//		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodePassword = encoder.encode("tinhcao");
		System.out.println(encodePassword);
		assertNotNull(encodePassword);
	}
}
