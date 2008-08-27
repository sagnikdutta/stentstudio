package com.stentstudio.dao;

	import org.appfuse.dao.GenericDao;

	import com.stentstudio.model.CoilNoActivo;

	public interface CoilNoActivoDao extends GenericDao<CoilNoActivo, Long> {

		public CoilNoActivo get(Long coilNoActivoId);
		public CoilNoActivo save(CoilNoActivo coilNoActivo);
		public void remove(Long coilNoActivoId);


}
