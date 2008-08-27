package com.stentstudio.controller;

import java.text.SimpleDateFormat;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.appfuse.service.GenericManager;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.stentstudio.model.Revision;
import com.stentstudio.model.Procedimiento;;

public class CopyOfRevisionFormController extends SimpleFormController {

	private GenericManager<Revision, Long> revisionManager = null;

	public void setRevisionManager(
			GenericManager<Revision, Long> revisionManager) {
		this.revisionManager = revisionManager;
	}

	public CopyOfRevisionFormController() {
		setCommandClass(Revision.class);
		setCommandName("revision");
	}

	
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.SimpleFormController#referenceData(javax.servlet.http.HttpServletRequest, java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	protected Map referenceData(HttpServletRequest request, Object command,
			Errors errors) throws Exception {
		// TODO Auto-generated method stub
		return super.referenceData(request, command, errors);
	}

	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		String id = request.getParameter("id");

		if (id != null && !"".equals("id")) {
			return revisionManager.get(new Long(id));
		}

		return new Revision();
	}

	public ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		Revision revision = (Revision) command;
		String success = getSuccessView();

		String opcion = request.getParameter("opcion");
		if("Guardar".equals(opcion)){
			revisionManager.save(revision);
			success = "redirect:formRevisiones.html?id=" + revision.getId();
		}else if("delete".equals(opcion)){
			revisionManager.remove(revision.getId());
		}

		return new ModelAndView(success);
	}

	/**
	 * @return the revisionManager
	 */
	public GenericManager<Revision, Long> getRevisionManager() {
		return revisionManager;
	}
}

