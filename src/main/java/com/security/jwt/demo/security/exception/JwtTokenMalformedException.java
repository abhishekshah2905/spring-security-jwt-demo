/**
 * 
 */
package com.security.jwt.demo.security.exception;

import org.springframework.security.core.AuthenticationException;

public class JwtTokenMalformedException extends AuthenticationException {

	/**
	 * @param msg
	 */
	public JwtTokenMalformedException(String msg) {
		super(msg);
	}

}
