package com.codemash.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


public class MyUserDetailsService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		if (username.equals("user")) {
			return User.builder()
					.username("user")
					.password("password")
					.roles("USER", "ADMIN")
					.disabled(false)
					.build();
		} else {
			throw new UsernameNotFoundException(username);
		}
	}

}
