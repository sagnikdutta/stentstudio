package com.stentstudio.dao.hibernate;

	
	import java.util.List;

	import org.appfuse.dao.hibernate.GenericDaoHibernate;

	import com.stentstudio.dao.NeuroformStentDao;
	import com.stentstudio.model.NeuroformStent;

	public class NeuroformStentDaoHibernate extends GenericDaoHibernate<NeuroformStent, Long> implements NeuroformStentDao {


	    public NeuroformStentDaoHibernate() {
	        super(NeuroformStent.class);
	    }

		
		/* (non-Javadoc)
		 * @see com.stentstudio.dao.MedicacionDao#get(java.lang.Long)
		 */
		@Override
		public NeuroformStent get(Long neuroformStentId) {
			return (NeuroformStent) getHibernateTemplate().get(NeuroformStent.class, neuroformStentId);
		}

		/* (non-Javadoc)
		 * @see com.stentstudio.dao.MedicacionDao#save(com.stentstudio.model.Medicacion)
		 */
		@Override
		public NeuroformStent save(NeuroformStent neuroformStent) {
			getHibernateTemplate().saveOrUpdate(neuroformStent);
			return neuroformStent;
		}

		/* (non-Javadoc)
		 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
		 */
		@Override
		public void remove(Long id) {
			NeuroformStent neuroformStent = get(id);
			getHibernateTemplate().delete(neuroformStent);		
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
		public List<NeuroformStent> getAll() {
			return getHibernateTemplate().loadAll(NeuroformStent.class);
		}

		

}
