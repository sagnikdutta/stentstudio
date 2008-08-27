package com.stentstudio.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.appfuse.service.GenericManager;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.stentstudio.model.Revision;
import com.stentstudio.model.Procedimiento;

public class RevisionFormController extends SimpleFormController {

	private GenericManager<Revision, Long> revisionManager = null;
	private GenericManager<Procedimiento, Long> procedimientoManager = null;

	public void setRevisionManager(
			GenericManager<Revision, Long> revisionManager) {
		this.revisionManager = revisionManager;
	}

	public void setProcedimientoManager(GenericManager<Procedimiento, Long> procedimientoManager) {
		this.procedimientoManager = procedimientoManager;
	}
	
	public RevisionFormController() {
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

		String procedimientoId = request.getParameter("procedimientoId");
		Revision revision = new Revision();
		if(StringUtils.isNotBlank(procedimientoId)){
			Procedimiento procedimiento = procedimientoManager.get(new Long(procedimientoId));
			revision.setProcedimiento(procedimiento);
		}
		if (id != null && !"".equals("id")) {
			return revisionManager.get(new Long(id));
		}

		return revision;
	}

	
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.BaseCommandController#initBinder(javax.servlet.http.HttpServletRequest, org.springframework.web.bind.ServletRequestDataBinder)
	 */
	@Override
	protected void initBinder(HttpServletRequest request,
			ServletRequestDataBinder binder) throws Exception {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(true);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
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

}
