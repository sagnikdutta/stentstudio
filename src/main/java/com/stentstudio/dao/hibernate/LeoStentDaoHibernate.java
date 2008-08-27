package com.stentstudio.dao.hibernate;

	import java.util.List;

	import org.appfuse.dao.hibernate.GenericDaoHibernate;

	import com.stentstudio.dao.LeoStentDao;
	import com.stentstudio.model.LeoStent;

	public class LeoStentDaoHibernate extends GenericDaoHibernate<LeoStent, Long> implements LeoStentDao {


	    public LeoStentDaoHibernate() {
	        super(LeoStent.class);
	    }

		
		/* (non-Javadoc)
		 * @see com.stentstudio.dao.MedicacionDao#get(java.lang.Long)
		 */
		@Override
		public LeoStent get(Long leoStentId) {
			return (LeoStent) getHibernateTemplate().get(LeoStent.class, leoStentId);
		}

		/* (non-Javadoc)
		 * @see com.stentstudio.dao.MedicacionDao#save(com.stentstudio.model.Medicacion)
		 */
		@Override
		public LeoStent save(LeoStent leoStent) {
			getHibernateTemplate().saveOrUpdate(leoStent);
			return leoStent;
		}

		/* (non-Javadoc)
		 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
		 */
		@Override
		public void remove(Long id) {
			LeoStent leoStent = get(id);
			getHibernateTemplate().delete(leoStent);		
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
		public List<LeoStent> getAll() {
			return getHibernateTemplate().loadAll(LeoStent.class);
		}

		

}
