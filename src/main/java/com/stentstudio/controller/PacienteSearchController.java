package com.stentstudio.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.stentstudio.model.PacienteSearchCriteria;
import com.stentstudio.service.PacienteManager;

public class PacienteSearchController extends SimpleFormController {

	private PacienteManager pacienteManager = null;

	public void setPacienteManager(
			PacienteManager pacienteManager) {
		this.pacienteManager = pacienteManager;
	}

	public PacienteSearchController() {
		setCommandClass(PacienteSearchCriteria.class);
		setCommandName("searchPaciente");
	}

	public ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		PacienteSearchCriteria searchPaciente = (PacienteSearchCriteria) command;
		String success = getSuccessView();

		Map model = new HashMap();
		List pacientes = pacienteManager.searchPacientes(searchPaciente);
		model.put("pacientes", pacientes);
		model.put("searchPaciente", searchPaciente);
		
		return new ModelAndView(success,model);
	}
}
