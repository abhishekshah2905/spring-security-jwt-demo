package com.security.jwt.demo.security.model;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import lombok.Getter;

@Getter
public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken {

	private final String token;
	
	public JwtAuthenticationToken(String token) {
		super(null, null);
		this.token = token;
	}
	
	@Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return null;
    }
}
