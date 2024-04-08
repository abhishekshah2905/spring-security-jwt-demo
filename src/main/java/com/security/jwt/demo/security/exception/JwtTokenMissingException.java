/**
 * 
 */
package com.security.jwt.demo.security.exception;

import org.springframework.security.core.AuthenticationException;

public class JwtTokenMissingException extends AuthenticationException {

	/**
	 * @param msg
	 */
	public JwtTokenMissingException(String msg) {
		super(msg);
	}

}
