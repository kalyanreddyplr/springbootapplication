/*
 * package com.sap.security;
 * 
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.web.SecurityFilterChain;
 * 
 * @Configuration //@EnableWebSecurity public class SecurityConfig {
 * 
 * // @Bean public SecurityFilterChain securityFilterChain(HttpSecurity http)
 * throws Exception { http .csrf(csrf -> csrf
 * .ignoringRequestMatchers("/csrf-token", "/detailsSTO") // Disable CSRF for
 * these endpoints ) .authorizeHttpRequests(auth -> auth
 * .requestMatchers("/csrf-token", "/public/**").permitAll() // Allow access to
 * these .anyRequest().authenticated() // Secure all other endpoints )
 * .httpBasic(); // Enable Basic Authentication
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * return http.build(); } }
 */