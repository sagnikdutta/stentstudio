package com.stentstudio.service.impl;

import java.util.List;

import org.appfuse.service.GenericManager;

import com.stentstudio.dao.MicroguiaDao;
import com.stentstudio.dao.ProcedimientoDao;
import com.stentstudio.dao.DispositivoEmbolizacionDao;
import com.stentstudio.dao.LeoStentDao;
import com.stentstudio.dao.LeoPlusStentDao;
import com.stentstudio.dao.NeuroformStentDao;
import com.stentstudio.dao.CoilActivoDao;
import com.stentstudio.dao.CoilNoActivoDao;
import com.stentstudio.model.Microguia;
import com.stentstudio.model.Procedimiento;
import com.stentstudio.model.DispositivoEmbolizacion;
import com.stentstudio.model.LeoStent;
import com.stentstudio.model.LeoPlusStent;
import com.stentstudio.model.NeuroformStent;
import com.stentstudio.model.CoilActivo;
import com.stentstudio.model.CoilNoActivo;

import com.stentstudio.service.ProcedimientoManager;

public class ProcedimientoManagerImpl implements GenericManager<Procedimiento, Long>, ProcedimientoManager {

	ProcedimientoDao procedimientoDao;
	MicroguiaDao microguiaDao;
	DispositivoEmbolizacionDao dispositivoEmbolizacionDao;
	LeoStentDao leoStentDao;
	LeoPlusStentDao leoPlusStentDao;
	NeuroformStentDao neuroformStentDao;
	CoilActivoDao coilActivoDao;
	CoilNoActivoDao coilNoActivoDao;
	
	
	public ProcedimientoManagerImpl(ProcedimientoDao procedimientoDao, MicroguiaDao microguiaDao, DispositivoEmbolizacionDao dispositivoEmbolizacionDao, LeoStentDao leoStentDao, LeoPlusStentDao leoPlusStentDao, NeuroformStentDao neuroformStentDao, CoilActivoDao coilActivoDao, CoilNoActivoDao coilNoActivoDao) {
		super();
		this.procedimientoDao = procedimientoDao;
		this.microguiaDao = microguiaDao;
		this.dispositivoEmbolizacionDao = dispositivoEmbolizacionDao;
		this.leoStentDao = leoStentDao;
		this.leoPlusStentDao = leoPlusStentDao;
		this.neuroformStentDao = neuroformStentDao;
		this.coilActivoDao = coilActivoDao;
		this.coilNoActivoDao = coilNoActivoDao;
	}
	
	public Procedimiento get(Long procedimientoId){
		return procedimientoDao.get(procedimientoId);
	}
	
	public Procedimiento save(Procedimiento procedimiento){
		return procedimientoDao.save(procedimiento);
	}
	
	public boolean exists(Long id) {
		return procedimientoDao.exists(id);
	}
	
	public List<Procedimiento> getAll() {
		return procedimientoDao.getAll();
	}

	public void remove(Long id) {
		procedimientoDao.remove(id);
	}
	
	public List<Microguia> getAllMicroguia(){
		return microguiaDao.getAll();
	}
	
	public Microguia getMicroguia(Long microguiaId){
		return microguiaDao.get(microguiaId);
	}
	
	public List<DispositivoEmbolizacion> getAllDispositivoEmbolizacion(){
		return dispositivoEmbolizacionDao.getAll();
	}
	
	public DispositivoEmbolizacion getDispositivoEmbolizacion(Long dispositivoEmbolizacionId){
		return dispositivoEmbolizacionDao.get(dispositivoEmbolizacionId);
	}
	public List<LeoStent> getAllLeoStent(){
		return leoStentDao.getAll();
	}
	
	public LeoStent getLeoStent(Long leoStentId){
		return leoStentDao.get(leoStentId);
	}
	public List<LeoPlusStent> getAllLeoPlusStent(){
		return leoPlusStentDao.getAll();
	}
	
	public LeoPlusStent getLeoPlusStent(Long leoPlusStentId){
		return leoPlusStentDao.get(leoPlusStentId);
	}
	public List<NeuroformStent> getAllNeuroformStent(){
		return neuroformStentDao.getAll();
	}
	
	public NeuroformStent getNeuroformStent(Long neuroformStentId){
		return neuroformStentDao.get(neuroformStentId);
	}
	public List<CoilActivo> getAllCoilActivo(){
		return coilActivoDao.getAll();
	}
	
	public CoilActivo getCoilActivo(Long coilActivoId){
		return coilActivoDao.get(coilActivoId);
	}
	public List<CoilNoActivo> getAllCoilNoActivo(){
		return coilNoActivoDao.getAll();
	}
	
	public CoilNoActivo getCoilNoActivo(Long coilNoActivoId){
		return coilNoActivoDao.get(coilNoActivoId);
	}
}
