package com.stentstudio.dao.hibernate;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;

import com.stentstudio.dao.ImagenRevisionDao;
import com.stentstudio.model.ImagenRevision;

public class ImagenRevisionDaoHibernate extends GenericDaoHibernate<ImagenRevision, Long> implements ImagenRevisionDao {


    public ImagenRevisionDaoHibernate() {
        super(ImagenRevision.class);
    }

	
	/* (non-Javadoc)
	 * @see com.stentstudio.dao.ImagenRevisionDao#get(java.lang.Long)
	 */
	@Override
	public ImagenRevision get(Long imagenId) {
		return (ImagenRevision) getHibernateTemplate().get(ImagenRevision.class, imagenId);
	}

	/* (non-Javadoc)
	 * @see com.stentstudio.dao.ImagenRevisionDao#save(com.stentstudio.model.ImagenRevision)
	 */
	@Override
	public ImagenRevision save(ImagenRevision imagenRevision) {
		getHibernateTemplate().saveOrUpdate(imagenRevision);
		return imagenRevision;
	}

	/* (non-Javadoc)
	 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
	 */
	@Override
	public void remove(Long id) {
		ImagenRevision imagenRevision = get(id);
		getHibernateTemplate().delete(imagenRevision);		
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
	public List<ImagenRevision> getAll() {
		return getHibernateTemplate().loadAll(ImagenRevision.class);
	}

}
