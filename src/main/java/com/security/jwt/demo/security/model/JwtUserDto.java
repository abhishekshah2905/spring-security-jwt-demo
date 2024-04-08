package com.security.jwt.demo.security.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public class JwtUserDto {
	private String id;

    private String username;

    private String role;

}
