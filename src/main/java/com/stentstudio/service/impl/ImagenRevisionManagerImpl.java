package com.stentstudio.service.impl;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.dao.ImagenRevisionDao;
import com.stentstudio.model.ImagenRevision;
import com.stentstudio.service.ImagenRevisionManager;

public class ImagenRevisionManagerImpl implements GenericManager<ImagenRevision, Long>, ImagenRevisionManager {

	ImagenRevisionDao imagenRevisionDao;
	
	public ImagenRevisionManagerImpl(ImagenRevisionDao imagenRevisionDao) {
		super();
		this.imagenRevisionDao = imagenRevisionDao;
	}
	
	public ImagenRevision get(Long imagenId){
		return imagenRevisionDao.get(imagenId);
	}
	
	public ImagenRevision save(ImagenRevision imagenRevision){
		return imagenRevisionDao.save(imagenRevision);
	}
	
	public boolean exists(Long id) {
		return imagenRevisionDao.exists(id);
	}
	
	public List<ImagenRevision> getAll() {
		return imagenRevisionDao.getAll();
	}

	public void remove(Long id) {
		imagenRevisionDao.remove(id);
	}

}
