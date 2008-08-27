package com.stentstudio.service.impl;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.dao.ImagenAneurismaDao;
import com.stentstudio.model.ImagenAneurisma;
import com.stentstudio.service.ImagenAneurismaManager;

public class ImagenAneurismaManagerImpl implements GenericManager<ImagenAneurisma, Long>, ImagenAneurismaManager {

	ImagenAneurismaDao imagenAneurismaDao;
	
	public ImagenAneurismaManagerImpl(ImagenAneurismaDao imagenAneurismaDao) {
		super();
		this.imagenAneurismaDao = imagenAneurismaDao;
	}
	
	public ImagenAneurisma get(Long imagenId){
		return imagenAneurismaDao.get(imagenId);
	}
	
	public ImagenAneurisma save(ImagenAneurisma imagenAneurisma){
		return imagenAneurismaDao.save(imagenAneurisma);
	}
	
	public boolean exists(Long id) {
		return imagenAneurismaDao.exists(id);
	}
	
	public List<ImagenAneurisma> getAll() {
		return imagenAneurismaDao.getAll();
	}

	public void remove(Long id) {
		imagenAneurismaDao.remove(id);
	}

}
