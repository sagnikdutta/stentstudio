package com.stentstudio.dao.hibernate;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.stentstudio.dao.ImagenAneurismaDao;
import com.stentstudio.model.ImagenAneurisma;

public class ImagenAneurismaDaoHibernate extends GenericDaoHibernate<ImagenAneurisma, Long> implements ImagenAneurismaDao {


    public ImagenAneurismaDaoHibernate() {
        super(ImagenAneurisma.class);
    }

	
	/* (non-Javadoc)
	 * @see com.stentstudio.dao.ImagenAneurismaDao#get(java.lang.Long)
	 */
	@Override
	public ImagenAneurisma get(Long imagenId) {
		return (ImagenAneurisma) getHibernateTemplate().get(ImagenAneurisma.class, imagenId);
	}

	/* (non-Javadoc)
	 * @see com.stentstudio.dao.ImagenAneurismaDao#save(com.stentstudio.model.ImagenAneurisma)
	 */
	@Override
	public ImagenAneurisma save(ImagenAneurisma imagenAneurisma) {
		getHibernateTemplate().saveOrUpdate(imagenAneurisma);
		return imagenAneurisma;
	}

	/* (non-Javadoc)
	 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
	 */
	@Override
	public void remove(Long id) {
		ImagenAneurisma imagenAneurisma = get(id);
		getHibernateTemplate().delete(imagenAneurisma);		
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
	public List<ImagenAneurisma> getAll() {
		return getHibernateTemplate().loadAll(ImagenAneurisma.class);
	}

}
