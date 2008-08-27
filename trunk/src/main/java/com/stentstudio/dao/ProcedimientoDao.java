package com.stentstudio.dao;

import org.appfuse.dao.GenericDao;

import com.stentstudio.model.Procedimiento;

public interface ProcedimientoDao extends GenericDao<Procedimiento, Long> {

	public Procedimiento get(Long procedimientoId);
	public Procedimiento save(Procedimiento procedimiento);
	public void remove(Long procedimientoId);
}
