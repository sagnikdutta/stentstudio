package com.stentstudio.dao;

	
	import org.appfuse.dao.GenericDao;

	import com.stentstudio.model.CoilActivo;

	public interface CoilActivoDao extends GenericDao<CoilActivo, Long> {

		public CoilActivo get(Long coilActivoId);
		public CoilActivo save(CoilActivo coilActivo);
		public void remove(Long coilActivoId);

}
