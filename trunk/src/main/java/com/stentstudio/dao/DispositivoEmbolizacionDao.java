package com.stentstudio.dao;
 
import org.appfuse.dao.GenericDao;

import com.stentstudio.model.DispositivoEmbolizacion;

public interface DispositivoEmbolizacionDao extends GenericDao<DispositivoEmbolizacion, Long> {

	public DispositivoEmbolizacion get(Long dispositivoEmbolizacionId);
	public DispositivoEmbolizacion save(DispositivoEmbolizacion dispositivoEmbolizacion);
	public void remove(Long dispositivoEmbolizacionId);

}
