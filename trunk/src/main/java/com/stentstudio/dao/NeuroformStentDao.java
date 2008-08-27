package com.stentstudio.dao;

	import org.appfuse.dao.GenericDao;

	import com.stentstudio.model.NeuroformStent;

	public interface NeuroformStentDao extends GenericDao<NeuroformStent, Long> {

		public NeuroformStent get(Long neuroformStentId);
		public NeuroformStent save(NeuroformStent neuroformStent);
		public void remove(Long neuroformStentId);



}
