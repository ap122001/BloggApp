package com.HR.Blog.Payloads;

import lombok.Data;

@Data
public class JwtAuthResponse {
	private String token;
	private UserDto user;
}
