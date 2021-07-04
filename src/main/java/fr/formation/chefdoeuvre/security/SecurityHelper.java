package fr.formation.chefdoeuvre.security;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;

public class SecurityHelper {

    private static JwtAuthenticationToken token() {
	return (JwtAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
    }

    public static String userName() {
	JwtAuthenticationToken token = token();
	return token.getName();
    }

    public static Long userId() {
	JwtAuthenticationToken token = token();
	return (Long) token.getTokenAttributes().get("userId");
    }

}