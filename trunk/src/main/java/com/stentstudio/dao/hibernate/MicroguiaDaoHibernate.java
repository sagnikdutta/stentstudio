package com.stentstudio.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.stentstudio.dao.MicroguiaDao;
import com.stentstudio.model.Microguia;

public class MicroguiaDaoHibernate extends GenericDaoHibernate<Microguia, Long> implements MicroguiaDao {


    public MicroguiaDaoHibernate() {
        super(Microguia.class);
    }

	
	/* (non-Javadoc)
	 * @see com.stentstudio.dao.MicroguiaDao#get(java.lang.Long)
	 */
	@Override
	public Microguia get(Long microguiaId) {
		return (Microguia) getHibernateTemplate().get(Microguia.class, microguiaId);
	}

	/* (non-Javadoc)
	 * @see com.stentstudio.dao.MicroguiaDao#save(com.stentstudio.model.Microguia)
	 */
	@Override
	public Microguia save(Microguia microguia) {
		getHibernateTemplate().saveOrUpdate(microguia);
		return microguia;
	}

	/* (non-Javadoc)
	 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
	 */
	@Override
	public void remove(Long id) {
		Microguia microguia = get(id);
		getHibernateTemplate().delete(microguia);		
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
	public List<Microguia> getAll() {
		return getHibernateTemplate().loadAll(Microguia.class);
	}

	
	
}
