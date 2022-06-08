package com.iesjaumeeljust.backend.security;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtToken implements Serializable {
    private static final long serialVersionUID = 5615608530797516602L;
	
	private String token;

    private String username;
}
