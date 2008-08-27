package com.stentstudio.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.model.ImagenRevision;
public interface ImagenRevisionManager extends GenericManager<ImagenRevision, Long> {
    
	public ImagenRevision get(Long imagenId);
	public ImagenRevision save(ImagenRevision imagenRevision);
	public void remove(Long imagenId);

}
