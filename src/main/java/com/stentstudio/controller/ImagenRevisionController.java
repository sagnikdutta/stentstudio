package com.stentstudio.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.appfuse.Constants;
import org.appfuse.service.GenericManager;
import org.appfuse.webapp.controller.FileUpload;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.stentstudio.model.Revision;
import com.stentstudio.model.ImagenRevision;

/**
 * Controller class to upload Files.
 *
 * <p>
 * <a href="FileUploadFormController.java.html"><i>View Source</i></a>
 * </p>
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 */
public class ImagenRevisionController extends SimpleFormController {

	private String disallowedFields;
	private String rutaImagenes;

	private GenericManager<Revision, Long> revisionManager = null;
	private GenericManager<ImagenRevision, Long> imagenManager = null;
	
	public ImagenRevisionController() {
        setCommandName("fileUpload");
        setCommandClass(ImagenRevision.class);
    }
    
	
	
    /**
	 * @param revisionManager the revisionManager to set
	 */
	public void setRevisionManager(GenericManager<Revision, Long> revisionManager) {
		this.revisionManager = revisionManager;
	}



	/**
	 * @param rutaImagenes the rutaImagenes to set
	 */
	public void setRutaImagenes(String rutaImagenes) {
		this.rutaImagenes = rutaImagenes;
	}



	/**
	 * @param imagenManager the imagenManager to set
	 */
	public void setImagenManager(GenericManager<ImagenRevision, Long> imagenManager) {
		this.imagenManager = imagenManager;
	}



	/**
	 * @param disallowedFields the disallowedFields to set
	 */
	public void setDisallowedFields(String disallowedFields) {
		this.disallowedFields = disallowedFields;
	}

	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.SimpleFormController#referenceData(javax.servlet.http.HttpServletRequest, java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	protected Map referenceData(HttpServletRequest request, Object command,Errors errors) throws Exception {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		String revisionId = request.getParameter("revisionId");
		map.put("revisionId", revisionId);
		Revision revision = revisionManager.get(new Long(revisionId));
        map.put("imagenes", revision.getImagenes());
		return map;
	}


	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.BaseCommandController#createBinder(javax.servlet.http.HttpServletRequest, java.lang.Object)
	 */
	@Override
	protected ServletRequestDataBinder createBinder(HttpServletRequest request,
			Object command) throws Exception {
		ServletRequestDataBinder binder =  super.createBinder(request, command);
		binder.setDisallowedFields(disallowedFields.split(","));
		return binder;
	}

	public ModelAndView processFormSubmission(HttpServletRequest request,
                                              HttpServletResponse response,
                                              Object command,
                                              BindException errors)
    throws Exception {

        return super.processFormSubmission(request, response, command, errors);
    }

    public ModelAndView onSubmit(HttpServletRequest request,
                                 HttpServletResponse response, Object command,
                                 BindException errors)
    throws Exception {
        ImagenRevision fileUpload = (ImagenRevision) command;

		String revisionId = request.getParameter("revisionId");
		Revision revision = revisionManager.get(new Long(revisionId));
		fileUpload.setRevision(revision);
		
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        CommonsMultipartFile file = (CommonsMultipartFile) multipartRequest.getFile("file");

        fileUpload.setContent(file.getBytes());
        fileUpload.setContentType(file.getContentType());
        
        imagenManager.save(fileUpload);

        String success = getSuccessView() + "?revisionId=" + revisionId;
        
        return new ModelAndView(success);
    }
}
