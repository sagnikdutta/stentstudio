package com.stentstudio.dao;

import org.appfuse.dao.GenericDao;
import java.util.List;
import org.springframework.dao.DataAccessException;
import com.stentstudio.model.Paciente;
import com.stentstudio.model.PacienteSearchCriteria;

public interface PacienteDao extends GenericDao<Paciente, Long> {

	public Paciente get(Long pacienteId);
	public Paciente save(Paciente paciente);
	public void remove(Long pacienteId);
	public List getAll();
	public List<Paciente> searchPacientes(final PacienteSearchCriteria searchCriteria) throws DataAccessException;
}
