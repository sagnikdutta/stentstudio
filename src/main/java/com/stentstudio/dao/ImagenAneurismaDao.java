package com.stentstudio.dao;

import org.appfuse.dao.GenericDao;

import com.stentstudio.model.ImagenAneurisma;

public interface ImagenAneurismaDao extends GenericDao<ImagenAneurisma, Long> {

	public ImagenAneurisma get(Long imagenId);
	public ImagenAneurisma save(ImagenAneurisma imagenAneurisma);
	public void remove(Long imagenId);
}
