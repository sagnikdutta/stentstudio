package com.stentstudio.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.stentstudio.dao.DispositivoEmbolizacionDao;
import com.stentstudio.model.DispositivoEmbolizacion;

public class DispositivoEmbolizacionDaoHibernate extends GenericDaoHibernate<DispositivoEmbolizacion, Long> implements DispositivoEmbolizacionDao {

	    public DispositivoEmbolizacionDaoHibernate() {
	        super(DispositivoEmbolizacion.class);
	    }

		
		/* (non-Javadoc)
		 * @see com.stentstudio.dao.DispositivoEmbolizacion#get(java.lang.Long)
		 */
		@Override
		public DispositivoEmbolizacion get(Long dispositivoEmbolizacionId) {
			return (DispositivoEmbolizacion) getHibernateTemplate().get(DispositivoEmbolizacion.class, dispositivoEmbolizacionId);
		}

		/* (non-Javadoc)
		 * @see com.stentstudio.dao.DispositivoEmbolizacion#save(com.stentstudio.model.DispositivoEmbolizacion)
		 */
		@Override
		public DispositivoEmbolizacion save(DispositivoEmbolizacion dispositivoEmbolizacion) {
			getHibernateTemplate().saveOrUpdate(dispositivoEmbolizacion);
			return dispositivoEmbolizacion;
		}

		/* (non-Javadoc)
		 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
		 */
		@Override
		public void remove(Long id) {
			DispositivoEmbolizacion dispositivoEmbolizacion = get(id);
			getHibernateTemplate().delete(dispositivoEmbolizacion);		
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
		public List<DispositivoEmbolizacion> getAll() {
			return getHibernateTemplate().loadAll(DispositivoEmbolizacion.class);
		}

}
