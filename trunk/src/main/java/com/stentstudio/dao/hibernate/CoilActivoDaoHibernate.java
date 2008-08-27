package com.stentstudio.dao.hibernate;
	

	import java.util.List;

	import org.appfuse.dao.hibernate.GenericDaoHibernate;

	import com.stentstudio.dao.CoilActivoDao;
	import com.stentstudio.model.CoilActivo;

	public class CoilActivoDaoHibernate extends GenericDaoHibernate<CoilActivo, Long> implements CoilActivoDao {


	    public CoilActivoDaoHibernate() {
	        super(CoilActivo.class);
	    }

		
		/* (non-Javadoc)
		 * @see com.stentstudio.dao.MedicacionDao#get(java.lang.Long)
		 */
		@Override
		public CoilActivo get(Long coilActivoId) {
			return (CoilActivo) getHibernateTemplate().get(CoilActivo.class, coilActivoId);
		}

		/* (non-Javadoc)
		 * @see com.stentstudio.dao.MedicacionDao#save(com.stentstudio.model.Medicacion)
		 */
		@Override
		public CoilActivo save(CoilActivo coilActivo) {
			getHibernateTemplate().saveOrUpdate(coilActivo);
			return coilActivo;
		}

		/* (non-Javadoc)
		 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
		 */
		@Override
		public void remove(Long id) {
			CoilActivo coilActivo = get(id);
			getHibernateTemplate().delete(coilActivo);		
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
		public List<CoilActivo> getAll() {
			return getHibernateTemplate().loadAll(CoilActivo.class);
		}


}
