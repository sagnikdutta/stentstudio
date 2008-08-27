package com.stentstudio.dao;

import org.appfuse.dao.GenericDao;

import com.stentstudio.model.ImagenRevision;

public interface ImagenRevisionDao extends GenericDao<ImagenRevision, Long> {

	public ImagenRevision get(Long imagenId);
	public ImagenRevision save(ImagenRevision imagenRevision);
	public void remove(Long imagenId);
}

