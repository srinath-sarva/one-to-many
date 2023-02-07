package com.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class MyWebSecurity    // extends  WebSecurityConfigurerAdapter
{ 
	
	
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests((requests) -> {
//			try {
//				requests.
//						antMatchers("/loan","/statement","/balance").authenticated().
//						antMatchers("/home","/contact").permitAll().and().formLogin().and().httpBasic();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//				);
//		
//	}
	}
	
	

	

	
