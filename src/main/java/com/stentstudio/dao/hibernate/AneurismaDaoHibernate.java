package com.stentstudio.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.stentstudio.dao.AneurismaDao;
import com.stentstudio.model.Aneurisma;

public class AneurismaDaoHibernate extends GenericDaoHibernate<Aneurisma, Long> implements AneurismaDao {


    public AneurismaDaoHibernate() {
        super(Aneurisma.class);
    }

	
	/* (non-Javadoc)
	 * @see com.stentstudio.dao.AneurismaDao#get(java.lang.Long)
	 */
	@Override
	public Aneurisma get(Long aneurismaId) {
		return (Aneurisma) getHibernateTemplate().get(Aneurisma.class, aneurismaId);
	}

	/* (non-Javadoc)
	 * @see com.stentstudio.dao.AneurismaDao#save(com.stentstudio.model.Aneurisma)
	 */
	@Override
	public Aneurisma save(Aneurisma aneurisma) {
		getHibernateTemplate().saveOrUpdate(aneurisma);
		return aneurisma;
	}

	/* (non-Javadoc)
	 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
	 */
	@Override
	public void remove(Long id) {
		Aneurisma aneurisma = get(id);
		getHibernateTemplate().delete(aneurisma);		
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
	public List<Aneurisma> getAll() {
		return getHibernateTemplate().loadAll(Aneurisma.class);
	}

	
	
}
