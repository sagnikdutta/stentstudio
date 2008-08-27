package com.stentstudio.security;

import org.acegisecurity.AccessDeniedException;
import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContextHolder;
import org.acegisecurity.userdetails.UserDetails;

import com.stentstudio.model.Usuario;

public class SecurityContext {

	public static Usuario getUsuario() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		Usuario currentUser;
        if (auth.getPrincipal() instanceof UserDetails) {
            currentUser = (Usuario) auth.getPrincipal();
        } else if (auth.getDetails() instanceof UserDetails) {
            currentUser = (Usuario) auth.getDetails();
        } else {
            throw new AccessDeniedException("User not properly authenticated.");
        }
        return currentUser;
	}
	
}
