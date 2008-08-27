package com.stentstudio.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.model.Paciente;
import com.stentstudio.model.PacienteSearchCriteria;

public interface PacienteManager extends GenericManager<Paciente, Long> {
    
	public Paciente get(Long pacienteId);
	public Paciente save(Paciente paciente);
	public void remove(Long pacienteId);
	public List<Paciente> searchPacientes(final PacienteSearchCriteria searchCriteria) throws Exception;
	
}
