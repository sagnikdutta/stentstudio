package com.stentstudio.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.appfuse.service.GenericManager;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.stentstudio.model.Aneurisma;
import com.stentstudio.model.Paciente;

public class AneurismaFormController extends SimpleFormController {

	private GenericManager<Aneurisma, Long> aneurismaManager = null;
	private GenericManager<Paciente, Long> pacienteManager = null;

	public void setAneurismaManager(
			GenericManager<Aneurisma, Long> aneurismaManager) {
		this.aneurismaManager = aneurismaManager;
	}

	public void setPacienteManager(GenericManager<Paciente, Long> pacienteManager) {
		this.pacienteManager = pacienteManager;
	}
	
	public AneurismaFormController() {
		setCommandClass(Aneurisma.class);
		setCommandName("aneurisma");
	}

	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		String id = request.getParameter("id");

		String pacienteId = request.getParameter("pacienteId");
		Aneurisma aneurisma = new Aneurisma();
		if(StringUtils.isNotBlank(pacienteId)){
			Paciente paciente = pacienteManager.get(new Long(pacienteId));
			aneurisma.setPaciente(paciente);
		}
		if (id != null && !"".equals("id")) {
			return aneurismaManager.get(new Long(id));
		}

		return aneurisma;
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

		Aneurisma aneurisma = (Aneurisma) command;
		String success = getSuccessView();

		String opcion = request.getParameter("opcion");
		if("Guardar".equals(opcion)){
			aneurismaManager.save(aneurisma);
			success = "redirect:formAneurisma.html?id=" + aneurisma.getId();
		}else if("delete".equals(opcion)){
			aneurismaManager.remove(aneurisma.getId());
		}

		return new ModelAndView(success);
	}

}
