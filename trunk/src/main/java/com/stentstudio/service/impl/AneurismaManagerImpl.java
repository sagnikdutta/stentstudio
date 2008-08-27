package com.stentstudio.service.impl;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.dao.AneurismaDao;
import com.stentstudio.model.Aneurisma;
import com.stentstudio.service.AneurismaManager;

public class AneurismaManagerImpl implements GenericManager<Aneurisma, Long>, AneurismaManager {

	AneurismaDao aneurismaDao;
	
	public AneurismaManagerImpl(AneurismaDao aneurismaDao) {
		super();
		this.aneurismaDao = aneurismaDao;
	}
	public Aneurisma get(Long aneurismaId){
		return aneurismaDao.get(aneurismaId);
	}
	
	public Aneurisma save(Aneurisma aneurisma){
		return aneurismaDao.save(aneurisma);
	}
	
	public boolean exists(Long id) {
		return aneurismaDao.exists(id);
	}
	
	public List<Aneurisma> getAll() {
		return aneurismaDao.getAll();
	}

	public void remove(Long id) {
		aneurismaDao.remove(id);
	}
	
}
