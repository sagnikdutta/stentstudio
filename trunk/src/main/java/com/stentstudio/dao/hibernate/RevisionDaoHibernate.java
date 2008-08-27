package com.stentstudio.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.stentstudio.dao.RevisionDao;
import com.stentstudio.model.Revision;

public class RevisionDaoHibernate extends GenericDaoHibernate<Revision, Long> implements RevisionDao {


    public RevisionDaoHibernate() {
        super(Revision.class);
    }

	
	/* (non-Javadoc)
	 * @see com.stentstudio.dao.PacienteDao#get(java.lang.Long)
	 */
	@Override
	public Revision get(Long revisionId) {
		return (Revision) getHibernateTemplate().get(Revision.class, revisionId);
	}

	/* (non-Javadoc)
	 * @see com.stentstudio.dao.PacienteDao#save(com.stentstudio.model.Paciente)
	 */
	@Override
	public Revision save(Revision revision) {
		getHibernateTemplate().saveOrUpdate(revision);
		return revision;
	}

	/* (non-Javadoc)
	 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
	 */
	@Override
	public void remove(Long id) {
		Revision revision = get(id);
		getHibernateTemplate().delete(revision);		
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
	public List<Revision> getAll() {
		return getHibernateTemplate().loadAll(Revision.class);
	}

	
	
}
