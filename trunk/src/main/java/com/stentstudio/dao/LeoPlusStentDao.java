package com.stentstudio.dao;

	import org.appfuse.dao.GenericDao;

	import com.stentstudio.model.LeoPlusStent;

	public interface LeoPlusStentDao extends GenericDao<LeoPlusStent, Long> {

		public LeoPlusStent get(Long leoPlusStentId);
		public LeoPlusStent save(LeoPlusStent leoPlusStent);
		public void remove(Long leoPlusStentId);


}
