package com.carmade.dio.springbootjwt.data;

import java.io.Serializable;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor
public class UserData implements Serializable {
	
	private String username;
	private String password;
	
}
