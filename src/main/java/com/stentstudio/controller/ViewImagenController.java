package com.stentstudio.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.appfuse.service.GenericManager;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.stentstudio.ImagenView;
import com.stentstudio.model.ImagenAneurisma;

public class ViewImagenController extends AbstractController {


	private GenericManager<ImagenAneurisma, Long> imagenManager = null;
	
	
	/**
	 * @param imagenManager the imagenManager to set
	 */
	public void setImagenManager(GenericManager<ImagenAneurisma, Long> imagenManager) {
		this.imagenManager = imagenManager;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String imagenId = request.getParameter("id");
		ImagenAneurisma imagenAneurisma = imagenManager.get(Long.parseLong(imagenId));
		return new ModelAndView(new ImagenView(imagenAneurisma));
	}

}
