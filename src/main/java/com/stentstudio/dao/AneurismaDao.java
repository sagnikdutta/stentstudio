package com.stentstudio.dao;

import org.appfuse.dao.GenericDao;

import com.stentstudio.model.Aneurisma;

public interface AneurismaDao extends GenericDao<Aneurisma, Long> {

	public Aneurisma get(Long aneurismaId);
	public Aneurisma save(Aneurisma aneurisma);
	public void remove(Long aneurismaId);
}
