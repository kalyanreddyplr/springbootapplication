/*
 * package com.sap.controller;
 * 
 * import org.springframework.security.web.csrf.CsrfToken; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import jakarta.servlet.http.HttpServletRequest;
 * 
 * @RestController // Use RestController instead of Controller
 * //@RequestMapping("/api") // Optional: Helps organize API paths public class
 * CsrfTokenController {
 * 
 * @GetMapping("/csrf-token") public CsrfToken getCsrfToken(HttpServletRequest
 * request) { return (CsrfToken) request.getAttribute("_csrf"); } }
 */