package com.stentstudio.service.impl;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.dao.PacienteDao;
import com.stentstudio.model.Paciente;
import com.stentstudio.service.PacienteManager;
import com.stentstudio.model.PacienteSearchCriteria;

public class PacienteManagerImpl implements GenericManager<Paciente, Long>, PacienteManager {

	PacienteDao pacienteDao;
	
	public PacienteManagerImpl(PacienteDao pacienteDao) {
		super();
		this.pacienteDao = pacienteDao;
	}
	public Paciente get(Long pacienteId){
		return pacienteDao.get(pacienteId);
	}
	
	public Paciente save(Paciente paciente){
		return pacienteDao.save(paciente);
	}
	
	public boolean exists(Long id) {
		return pacienteDao.exists(id);
	}
	
	public List<Paciente> getAll() {
		return pacienteDao.getAll();
	}

	public void remove(Long id) {
		pacienteDao.remove(id);
	}
	
	public List<Paciente> searchPacientes(final PacienteSearchCriteria searchCriteria) throws Exception {
		return pacienteDao.searchPacientes(searchCriteria);

	}
	
}
