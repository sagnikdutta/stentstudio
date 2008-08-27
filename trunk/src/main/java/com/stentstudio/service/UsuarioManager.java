package com.stentstudio.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.model.Usuario;
import com.stentstudio.model.UsuarioSearchCriteria;

public interface UsuarioManager extends GenericManager<Usuario, Long> {
    
	public Usuario get(Long usuarioId);
	public Usuario save(Usuario usuario);
	public void remove(Long usuarioId);
	public List<Usuario> searchUsuarios(final UsuarioSearchCriteria searchCriteria) throws Exception;

}
