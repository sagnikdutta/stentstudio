package com.stentstudio.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.model.Aneurisma;

public interface AneurismaManager extends GenericManager<Aneurisma, Long> {
    
	public Aneurisma get(Long aneurismaId);
	public Aneurisma save(Aneurisma aneurisma);
	public void remove(Long aneurismaId);
	
}
