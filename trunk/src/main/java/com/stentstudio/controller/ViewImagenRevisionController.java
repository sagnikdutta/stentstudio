package com.stentstudio.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.appfuse.service.GenericManager;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.stentstudio.ImagenRevisionView;
import com.stentstudio.model.ImagenRevision;

public class ViewImagenRevisionController extends AbstractController {


	private GenericManager<ImagenRevision, Long> imagenManager = null;
	
	
	/**
	 * @param imagenManager the imagenManager to set
	 */
	public void setImagenManager(GenericManager<ImagenRevision, Long> imagenManager) {
		this.imagenManager = imagenManager;
	}


	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String imagenId = request.getParameter("id");
		ImagenRevision imagenRevision = imagenManager.get(Long.parseLong(imagenId));
		return new ModelAndView(new ImagenRevisionView(imagenRevision));
	}

}
