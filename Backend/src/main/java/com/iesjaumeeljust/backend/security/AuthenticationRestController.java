package com.iesjaumeeljust.backend.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthenticationRestController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	UserDetailsService userDetailsService;
	
	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	JwtToken jwtToken;
	
	@PostMapping("/login")
	public JwtToken login(@RequestBody UsuarioCredencials usuarioCredencials) {
		
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(
						usuarioCredencials.getUsername(), usuarioCredencials.getPassword()
				)
		);
		
		UserDetails userDetails = userDetailsService.loadUserByUsername(usuarioCredencials.getUsername());
		String token= jwtTokenUtil.generateToken(userDetails);		
		
		return new JwtToken(token, usuarioCredencials.getUsername());
	}
	
}
