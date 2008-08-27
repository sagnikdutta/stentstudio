package com.stentstudio.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.stentstudio.model.Revision;

public interface RevisionDao extends GenericDao<Revision, Long> {

	public Revision get(Long revisionId);
	public Revision save(Revision revision);
	public void remove(Long revisionId);
	public boolean exists(Long id);
	public List<Revision> getAll();
}
