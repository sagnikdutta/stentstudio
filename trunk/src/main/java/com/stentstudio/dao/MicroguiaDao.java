package com.stentstudio.dao;

import org.appfuse.dao.GenericDao;

import com.stentstudio.model.Microguia;

public interface MicroguiaDao extends GenericDao<Microguia, Long> {

	public Microguia get(Long microguiaId);
	public Microguia save(Microguia microguia);
	public void remove(Long microguiaId);
}
