package com.stentstudio.service.impl;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.dao.RevisionDao;
import com.stentstudio.model.Revision;
import com.stentstudio.service.RevisionManager;

public class RevisionManagerImpl implements GenericManager<Revision, Long>, RevisionManager {

	RevisionDao revisionDao;
	
	public RevisionManagerImpl(RevisionDao revisionDao) {
		super();
		this.revisionDao = revisionDao;
	}
	public Revision get(Long revisionId){
		return revisionDao.get(revisionId);
	}
	
	public Revision save(Revision revision){
		return revisionDao.save(revision);
	}
	
	public boolean exists(Long id) {
		return revisionDao.exists(id);
	}
	
	public List<Revision> getAll() {
		return revisionDao.getAll();
	}

	public void remove(Long id) {
		revisionDao.remove(id);
	}
	
}
