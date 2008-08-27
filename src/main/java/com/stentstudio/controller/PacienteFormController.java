package com.stentstudio.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.appfuse.service.GenericManager;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.stentstudio.model.Paciente;

public class PacienteFormController extends SimpleFormController {

	private GenericManager<Paciente, Long> pacienteManager = null;

	public void setPacienteManager(
			GenericManager<Paciente, Long> pacienteManager) {
		this.pacienteManager = pacienteManager;
	}

	public PacienteFormController() {
		setCommandClass(Paciente.class);
		setCommandName("paciente");
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
			return pacienteManager.get(new Long(id));
		}

		return new Paciente();
	}

	public ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		Paciente paciente = (Paciente) command;
		String success = getSuccessView();

		String opcion = request.getParameter("opcion");
		if("Guardar".equals(opcion)){
			pacienteManager.save(paciente);
			success = "redirect:formPaciente.html?id=" + paciente.getId();
		}else if("delete".equals(opcion)){
			pacienteManager.remove(paciente.getId());
		}

		return new ModelAndView(success);
	}
}

