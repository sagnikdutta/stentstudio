package com.stentstudio.dao.hibernate;
	
	import java.util.List;

	import org.appfuse.dao.hibernate.GenericDaoHibernate;

	import com.stentstudio.dao.CoilNoActivoDao;
	import com.stentstudio.model.CoilNoActivo;

	public class CoilNoActivoDaoHibernate extends GenericDaoHibernate<CoilNoActivo, Long> implements CoilNoActivoDao {


	    public CoilNoActivoDaoHibernate() {
	        super(CoilNoActivo.class);
	    }

		
		/* (non-Javadoc)
		 * @see com.stentstudio.dao.MedicacionDao#get(java.lang.Long)
		 */
		@Override
		public CoilNoActivo get(Long coilNoActivoId) {
			return (CoilNoActivo) getHibernateTemplate().get(CoilNoActivo.class, coilNoActivoId);
		}

		/* (non-Javadoc)
		 * @see com.stentstudio.dao.MedicacionDao#save(com.stentstudio.model.Medicacion)
		 */
		@Override
		public CoilNoActivo save(CoilNoActivo coilNoActivo) {
			getHibernateTemplate().saveOrUpdate(coilNoActivo);
			return coilNoActivo;
		}

		/* (non-Javadoc)
		 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
		 */
		@Override
		public void remove(Long id) {
			CoilNoActivo coilNoActivo = get(id);
			getHibernateTemplate().delete(coilNoActivo);		
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
		public List<CoilNoActivo> getAll() {
			return getHibernateTemplate().loadAll(CoilNoActivo.class);
		}


}
