/**
 * 
 */
package com.security.jwt.demo.security.exception;

import org.springframework.security.core.AuthenticationException;

public class JwtUserNotFoundException extends AuthenticationException {

	/**
	 * @param msg
	 */
	public JwtUserNotFoundException(String msg) {
		super(msg);
	}

}
