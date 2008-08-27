package com.stentstudio.dao.hibernate;

	
	import java.util.List;

	import org.appfuse.dao.hibernate.GenericDaoHibernate;

	import com.stentstudio.dao.LeoPlusStentDao;
	import com.stentstudio.model.LeoPlusStent;

	public class LeoPlusStentDaoHibernate extends GenericDaoHibernate<LeoPlusStent, Long> implements LeoPlusStentDao {


	    public LeoPlusStentDaoHibernate() {
	        super(LeoPlusStent.class);
	    }

		
		/* (non-Javadoc)
		 * @see com.stentstudio.dao.MedicacionDao#get(java.lang.Long)
		 */
		@Override
		public LeoPlusStent get(Long leoPlusStentId) {
			return (LeoPlusStent) getHibernateTemplate().get(LeoPlusStent.class, leoPlusStentId);
		}

		/* (non-Javadoc)
		 * @see com.stentstudio.dao.MedicacionDao#save(com.stentstudio.model.Medicacion)
		 */
		@Override
		public LeoPlusStent save(LeoPlusStent leoPlusStent) {
			getHibernateTemplate().saveOrUpdate(leoPlusStent);
			return leoPlusStent;
		}

		/* (non-Javadoc)
		 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
		 */
		@Override
		public void remove(Long id) {
			LeoPlusStent leoPlusStent = get(id);
			getHibernateTemplate().delete(leoPlusStent);		
		}

		/* (non-Javadoc)
		 * @see org.appfuse.dao.GenericDao#exists(java.io.Serializable)
		 */
		@Override
		public boolean exists(Long id) {
			// TODO Auto-generated method stub
			return false;
		}

		/* (non-Javadoc)
		 * @see org.appfuse.dao.GenericDao#getAll()
		 */
		@Override
		public List<LeoPlusStent> getAll() {
			return getHibernateTemplate().loadAll(LeoPlusStent.class);
		}

		


}
