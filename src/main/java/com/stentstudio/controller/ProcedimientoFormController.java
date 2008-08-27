package com.stentstudio.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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

import com.stentstudio.model.Aneurisma;
import com.stentstudio.model.CoilActivo;
import com.stentstudio.model.CoilNoActivo;
import com.stentstudio.model.LeoPlusStent;
import com.stentstudio.model.LeoStent;
import com.stentstudio.model.NeuroformStent;
import com.stentstudio.model.Procedimiento;
import com.stentstudio.model.Usuario;
import com.stentstudio.security.SecurityContext;
import com.stentstudio.service.ProcedimientoManager;

public class ProcedimientoFormController extends SimpleFormController {

	private ProcedimientoManager procedimientoManager = null;
	private GenericManager<Aneurisma, Long> aneurismaManager = null;
	private String disallowedFields;
	
	/**
	 * @param disallowedFields the disallowedFields to set
	 */
	public void setDisallowedFields(String disallowedFields) {
		this.disallowedFields = disallowedFields;
	}
	
	public void setProcedimientoManager(
			ProcedimientoManager procedimientoManager) {
		this.procedimientoManager = procedimientoManager;
	}
	/**
	 * @param aneurismaManager the aneurismaManager to set
	 */
	public void setAneurismaManager(GenericManager<Aneurisma, Long> aneurismaManager) {
		this.aneurismaManager = aneurismaManager;
	}
	
	

	public ProcedimientoFormController() {
		setCommandClass(Procedimiento.class);
		setCommandName("procedimiento");
	}


	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.SimpleFormController#referenceData(javax.servlet.http.HttpServletRequest, java.lang.Object, org.springframework.validation.Errors)
	 */
	@Override
	protected Map referenceData(HttpServletRequest request, Object command,Errors errors) throws Exception {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("microguias", procedimientoManager.getAllMicroguia());
		map.put("dispositivoEmbolizacion", procedimientoManager.getAllDispositivoEmbolizacion());
		map.put("leoStent", procedimientoManager.getAllLeoStent());
		map.put("leoPlusStent", procedimientoManager.getAllLeoPlusStent());
		map.put("neuroformStent", procedimientoManager.getAllNeuroformStent());
		map.put("coilActivo", procedimientoManager.getAllCoilActivo());
		map.put("coilNoActivo", procedimientoManager.getAllCoilNoActivo());
		return map;
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
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.BaseCommandController#onBind(javax.servlet.http.HttpServletRequest, java.lang.Object)
	 */
	@Override
	protected void onBind(HttpServletRequest request, Object command)
			throws Exception {
		Procedimiento procedimiento = (Procedimiento) command;
		String[] leoStents = request.getParameterValues("leoStentSelect");
		if(leoStents != null && leoStents.length > 0){
			List<LeoStent> results = new ArrayList<LeoStent>();
			for (int i = 0; i < leoStents.length; i++) {
				String leoStentId = leoStents[i];
				LeoStent leoStent = procedimientoManager.getLeoStent(Long.parseLong(leoStentId));
				results.add(leoStent);
			}
			procedimiento.setLeoStent(results);
		}
		String[] leoPlusStents = request.getParameterValues("leoPlusStentSelect");
		if(leoPlusStents  != null && leoPlusStents.length > 0){
			List<LeoPlusStent> results = new ArrayList<LeoPlusStent>();
			for (int i = 0; i < leoPlusStents.length; i++) {
				String leoPlusStentId = leoPlusStents[i];
				LeoPlusStent leoPlusStent = procedimientoManager.getLeoPlusStent(Long.parseLong(leoPlusStentId));
				results.add(leoPlusStent);
			}
			procedimiento.setLeoPlusStent(results);
		}
		String[] neuroformStents = request.getParameterValues("neuroformStentSelect");
		if(neuroformStents != null && neuroformStents.length > 0){
			List<NeuroformStent> results = new ArrayList<NeuroformStent>();
			for (int i = 0; i < neuroformStents.length; i++) {
				String neuroformStentId = neuroformStents[i];
			    NeuroformStent neuroformStent = procedimientoManager.getNeuroformStent(Long.parseLong(neuroformStentId));
				results.add(neuroformStent);
			}
			procedimiento.setNeuroformStent(results);
		}
		String[] coilNoActivos = request.getParameterValues("coilNoActivoSelect");
		if(coilNoActivos != null && coilNoActivos.length > 0){
			List<CoilNoActivo> results = new ArrayList<CoilNoActivo>();
			for (int i = 0; i < coilNoActivos.length; i++) {
				String coilNoActivoId = coilNoActivos[i];
				CoilNoActivo coilNoActivo = procedimientoManager.getCoilNoActivo(Long.parseLong(coilNoActivoId));
				results.add(coilNoActivo);
			}
			procedimiento.setCoilNoActivo(results);
		}
		String[] coilActivos = request.getParameterValues("coilActivoSelect");
		if(coilActivos != null && coilActivos.length > 0){
			List<CoilActivo> results = new ArrayList<CoilActivo>();
			for (int i = 0; i < coilActivos.length; i++) {
				String coilActivoId = coilActivos[i];
				CoilActivo coilActivo = procedimientoManager.getCoilActivo(Long.parseLong(coilActivoId));
				results.add(coilActivo);
			}
			procedimiento.setCoilActivo(results);
		}
		
		
		String microguiasTerumo = request.getParameter("microguiasTerumoSelect");
		if(microguiasTerumo != null){
		procedimiento.setMicroguiasTerumo(procedimientoManager.getMicroguia(Long.parseLong(microguiasTerumo)));}
		
		String dispositivoEmbolizacion = request.getParameter("dispositivoEmbolizacionSelect");
		if(dispositivoEmbolizacion != null){
		procedimiento.setDispositivoEmbolizacion(procedimientoManager.getDispositivoEmbolizacion(Long.parseLong(dispositivoEmbolizacion)));}
	}
	
	
	/* (non-Javadoc)
	 * @see org.springframework.web.servlet.mvc.BaseCommandController#createBinder(javax.servlet.http.HttpServletRequest, java.lang.Object)
	 */
	@Override
	protected ServletRequestDataBinder createBinder(HttpServletRequest request,
			Object command) throws Exception {
		// TODO Auto-generated method stub
		ServletRequestDataBinder binder =  super.createBinder(request, command);
		binder.setDisallowedFields(disallowedFields.split(","));
		return binder;
	}
	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		String id = request.getParameter("id");
		String aneurismaId = request.getParameter("aneurismaId");
		Procedimiento procedimiento = new Procedimiento();
		if(StringUtils.isNotBlank(aneurismaId)){
			Aneurisma aneurisma = aneurismaManager.get(new Long(aneurismaId));
			procedimiento.setAneurisma(aneurisma);
		}
		if (id != null && !"".equals("id")) {
			return procedimientoManager.get(new Long(id));
		}

		return procedimiento;
	}

	@Override
	public ModelAndView onSubmit(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		Procedimiento procedimiento = (Procedimiento) command;
		String success = getSuccessView();
		procedimiento.setUsuario(SecurityContext.getUsuario());
		String opcion = request.getParameter("opcion");
		if("Guardar".equals(opcion)){
			procedimientoManager.save(procedimiento);
			success = "redirect:formProcedimiento.html?id=" + procedimiento.getId();
		}else if("delete".equals(opcion)){
			procedimientoManager.remove(procedimiento.getId());
		}

		return new ModelAndView(success);
	}
}
