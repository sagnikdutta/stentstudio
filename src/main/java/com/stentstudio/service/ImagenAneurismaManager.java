package com.stentstudio.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.model.ImagenAneurisma;
public interface ImagenAneurismaManager extends GenericManager<ImagenAneurisma, Long> {
    
	public ImagenAneurisma get(Long imagenId);
	public ImagenAneurisma save(ImagenAneurisma imagenAneurisma);
	public void remove(Long imagenId);

}
