package com.stentstudio.dao;

import org.appfuse.dao.GenericDao;

import com.stentstudio.model.LeoStent;

public interface LeoStentDao extends GenericDao<LeoStent, Long> {

	public LeoStent get(Long leoStentId);
	public LeoStent save(LeoStent leoStent);
	public void remove(Long leoStentId);

}
