package com.stentstudio.dao.hibernate;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.stentstudio.dao.ProcedimientoDao;
import com.stentstudio.model.Procedimiento;

public class ProcedimientoDaoHibernate extends GenericDaoHibernate<Procedimiento, Long> implements ProcedimientoDao {


    public ProcedimientoDaoHibernate() {
        super(Procedimiento.class);
    }

	
	/* (non-Javadoc)
	 * @see com.stentstudio.dao.ProcedimientoDao#get(java.lang.Long)
	 */
	@Override
	public Procedimiento get(Long procedimientoId) {
		return (Procedimiento) getHibernateTemplate().get(Procedimiento.class, procedimientoId);
	}

	/* (non-Javadoc)
	 * @see com.stentstudio.dao.ProcedimientoDao#save(com.stentstudio.model.Procedimiento)
	 */
	@Override
	public Procedimiento save(Procedimiento procedimiento) {
		getHibernateTemplate().saveOrUpdate(procedimiento);
		return procedimiento;
	}

	/* (non-Javadoc)
	 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
	 */
	@Override
	public void remove(Long id) {
		Procedimiento procedimiento = get(id);
		getHibernateTemplate().delete(procedimiento);		
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
	public List<Procedimiento> getAll() {
		return getHibernateTemplate().loadAll(Procedimiento.class);
	}

}
