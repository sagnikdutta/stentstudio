package com.stentstudio.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.model.Revision;

public interface RevisionManager extends GenericManager<Revision, Long> {
    
	public Revision get(Long revisionId);
	public Revision save(Revision revision);
	public void remove(Long revisionId);
	
}
