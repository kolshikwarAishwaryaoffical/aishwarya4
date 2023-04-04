package com.example.loginmanager;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginmanager.filters.JwtRequestFilter;
import com.example.loginmanager.model.AuthenticationRequest;
import com.example.loginmanager.model.AuthenticationResponse;
import com.example.loginmanager.service.MyManagerDetailsService;
import com.example.loginmanager.util.JwtUtil;



@SpringBootApplication
public class LoginManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginManagerApplication.class, args);
	}

	@RestController
	@CrossOrigin("http://localhost:3000")
	public class HelloWorldController {
		
		@Autowired
		private AuthenticationManager authenticationManager;
		
		@Autowired
		private JwtUtil jwtTokenUtil;
		
		@Autowired
		private MyManagerDetailsService myManagerDetailsService;
		
		
		@RequestMapping(value = "/hi" , method = RequestMethod.GET)
		public String firstPage() {
			return "Hello World";
		}
		
		@GetMapping("/loginmanager/{token}")
		public String getLoginUser(@PathVariable("token") String token) {
			return jwtTokenUtil.extractUsername(token);
			
		}
		@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
		public ResponseEntity<?> createAuthenticationToken(@Valid @RequestBody AuthenticationRequest authenticationRequest) throws Exception {

			try {
				authenticationManager.authenticate(
						new UsernamePasswordAuthenticationToken(authenticationRequest.getEmailId(), authenticationRequest.getPassword())
				);
			}
			catch (BadCredentialsException e) {
				throw new Exception("Incorrect EmailId or Password", e);
			}


			final UserDetails userDetails = myManagerDetailsService
					.loadUserByUsername(authenticationRequest.getEmailId());

			final String jwt = jwtTokenUtil.generateToken(userDetails);

			return ResponseEntity.ok(new AuthenticationResponse(jwt));
		}
	}
	@EnableWebSecurity
	public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
		
//		@Autowired
//		private UserDetailsService myUserDetailsService;
		
		@Autowired
		private UserDetailsService myUserDetailsService;
		
		@Autowired
		private  JwtRequestFilter  jwtRequestFilter;
		
		public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
			auth.userDetailsService(myUserDetailsService);
		}
		
		@Bean
		public PasswordEncoder passwordEncoder() {
			return NoOpPasswordEncoder.getInstance();
		}
		
		@Override
		@Bean
		public AuthenticationManager authenticationManagerBean() throws Exception {
			return super.authenticationManagerBean();
		}
		@Override
		protected void configure(HttpSecurity httpSecurity) throws Exception {
			httpSecurity.csrf()
			        .disable()
					.authorizeRequests()
					.antMatchers("/authenticate","/loginmanager/{token}")
					.permitAll()
					.anyRequest()
					.authenticated()
					.and()
	                .exceptionHandling()
	                .and()
	                .sessionManagement()
					.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
			httpSecurity.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);

		}
	}
	
}
