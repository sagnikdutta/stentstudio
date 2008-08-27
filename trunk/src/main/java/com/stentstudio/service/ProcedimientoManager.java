package com.stentstudio.service;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.model.Microguia;
import com.stentstudio.model.DispositivoEmbolizacion;
import com.stentstudio.model.Procedimiento;
import com.stentstudio.model.LeoStent;
import com.stentstudio.model.LeoPlusStent;
import com.stentstudio.model.NeuroformStent;
import com.stentstudio.model.CoilActivo;
import com.stentstudio.model.CoilNoActivo;

public interface ProcedimientoManager extends GenericManager<Procedimiento, Long> {
    
	public Procedimiento get(Long procedimientoId);
	public Procedimiento save(Procedimiento procedimiento);
	public void remove(Long procedimientoId);
	
	public List<Microguia> getAllMicroguia();
	public Microguia getMicroguia(Long microguiaId);
	
	public List<DispositivoEmbolizacion> getAllDispositivoEmbolizacion();
	public DispositivoEmbolizacion getDispositivoEmbolizacion(Long dispositivoEmbolizacionId);
	
	public List<LeoStent> getAllLeoStent();
	public LeoStent getLeoStent(Long leoStentId);
	
	public List<LeoPlusStent> getAllLeoPlusStent();
	public LeoPlusStent getLeoPlusStent(Long leoPlusStentId);
	
	public List<NeuroformStent> getAllNeuroformStent();
	public NeuroformStent getNeuroformStent(Long neuroformStentId);
	
	public List<CoilActivo> getAllCoilActivo();
	public CoilActivo getCoilActivo(Long coilActivoId);
	
	public List<CoilNoActivo> getAllCoilNoActivo();
	public CoilNoActivo getCoilNoActivo(Long coilNoActivoId);
	
}
