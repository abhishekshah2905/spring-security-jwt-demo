/**
 * 
 */
package com.security.jwt.demo.security.exception;

import org.springframework.security.core.AuthenticationException;

public class JwtTokenExpiredException extends AuthenticationException {

	/**
	 * @param msg
	 */
	public JwtTokenExpiredException(String msg) {
		super(msg);
	}

}
