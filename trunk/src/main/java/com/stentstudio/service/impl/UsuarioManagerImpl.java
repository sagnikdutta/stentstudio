package com.stentstudio.service.impl;

import java.util.List;

import org.acegisecurity.providers.dao.DaoAuthenticationProvider;
import org.acegisecurity.providers.encoding.PasswordEncoder;
import org.appfuse.service.GenericManager;

import com.stentstudio.dao.UsuarioDao;
import com.stentstudio.model.Usuario;
import com.stentstudio.model.UsuarioSearchCriteria;
import com.stentstudio.service.UsuarioManager;

public class UsuarioManagerImpl implements GenericManager<Usuario, Long>, UsuarioManager {

	UsuarioDao usuarioDao;
    private DaoAuthenticationProvider authenticationProvider;
	
	/**
	 * @param usuarioDao the usuarioDao to set
	 */
	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}



	/**
	 * @param authenticationProvider the authenticationProvider to set
	 */
	public void setAuthenticationProvider(
			DaoAuthenticationProvider authenticationProvider) {
		this.authenticationProvider = authenticationProvider;
	}



	public Usuario get(Long usuarioId){
		return usuarioDao.get(usuarioId);
	}
	
	public Usuario save(Usuario user) {

        // Get and prepare password management-related artifacts
        boolean passwordChanged = false;
        if (authenticationProvider != null) {
            PasswordEncoder passwordEncoder = authenticationProvider.getPasswordEncoder();

            if (passwordEncoder != null) {
                // Existing user, check password in DB
                 String currentPassword = usuarioDao.getUserPassword(user.getUsername());
                if (currentPassword == null) {
                    passwordChanged = true;
                } else {
                    if (!currentPassword.equals(user.getPassword())) {
                        passwordChanged = true;
                    }
                }

                // If password was changed (or new user), encrypt it
                if (passwordChanged) {
                    user.setContrasena(passwordEncoder.encodePassword(user.getPassword(), null));
                }
            } 
        }
        
        user.setEnabled(true);
        return usuarioDao.saveUser(user);
    }
	
	public boolean exists(Long id) {
		return usuarioDao.exists(id);
	}
	
	public List<Usuario> getAll() {
		return usuarioDao.getAll();
	}

	public void remove(Long id) {
		usuarioDao.remove(id);
	}

	public List<Usuario> searchUsuarios(final UsuarioSearchCriteria searchCriteria) throws Exception {
		return usuarioDao.searchUsuarios(searchCriteria);
	}
	
}
