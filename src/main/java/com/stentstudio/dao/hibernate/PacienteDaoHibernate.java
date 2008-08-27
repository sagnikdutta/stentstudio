package com.stentstudio.dao.hibernate;

import java.util.Collection;
import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.HibernateCallback;

import com.stentstudio.dao.PacienteDao;
import com.stentstudio.model.Paciente;
import com.stentstudio.model.PacienteSearchCriteria;

public class PacienteDaoHibernate extends GenericDaoHibernate<Paciente, Long> implements PacienteDao {


    public PacienteDaoHibernate() {
        super(Paciente.class);
    }

	
	/* (non-Javadoc)
	 * @see com.stentstudio.dao.PacienteDao#get(java.lang.Long)
	 */
	@Override
	public Paciente get(Long pacienteId) {
		return (Paciente) getHibernateTemplate().get(Paciente.class, pacienteId);
	}

	/* (non-Javadoc)
	 * @see com.stentstudio.dao.PacienteDao#save(com.stentstudio.model.Paciente)
	 */
	@Override
	public Paciente save(Paciente paciente) {
		getHibernateTemplate().saveOrUpdate(paciente);
		return paciente;
	}

	/* (non-Javadoc)
	 * @see org.appfuse.dao.GenericDao#remove(java.io.Serializable)
	 */
	@Override
	public void remove(Long id) {
		Paciente paciente = get(id);
		getHibernateTemplate().delete(paciente);		
	}

	/* (non-Javadoc)
	 * @see org.appfuse.dao.GenericDao#exists(java.io.Serializable)
	 */
	@Override
	public boolean exists(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.appfuse.dao.GenericDao#getAll()
	 */
	@Override
	public List<Paciente> getAll() {
		return getHibernateTemplate().loadAll(Paciente.class);
	}

	public List<Paciente> searchPacientes(final PacienteSearchCriteria searchCriteria) throws DataAccessException {
		return (List<Paciente>) getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) {
				Criteria criteria = session.createCriteria(Paciente.class);
				if(searchCriteria.getNhc() != null && !"".equals(searchCriteria.getNhc())) {
					criteria.add(Expression.eq("nhc", searchCriteria.getNhc()));
				}
				if(searchCriteria.getNombre() != null && !"".equals(searchCriteria.getNombre())) {
					criteria.add(Expression.like("nombre", getLike(searchCriteria.getNombre())));
				}
				if(searchCriteria.getApellido1() != null && !"".equals(searchCriteria.getApellido1())) {
					criteria.add(Expression.like("apellido1", getLike(searchCriteria.getApellido1())));
				}
				if(searchCriteria.getApellido2() != null && !"".equals(searchCriteria.getApellido2())) {
					criteria.add(Expression.like("apellido2", getLike(searchCriteria.getApellido2())));
				}
				if(searchCriteria.getNeurorradiologo() != null && !"".equals(searchCriteria.getNeurorradiologo())) {
					criteria.add(Expression.like("neurorradiologo", getLike(searchCriteria.getNeurorradiologo())));
				}
				if(searchCriteria.getIdentificador() != null && !"".equals(searchCriteria.getIdentificador())) {
					criteria.add(Expression.like("identificador", getLike(searchCriteria.getIdentificador())));
				}
				if(searchCriteria.getCentro() != null && !"".equals(searchCriteria.getCentro())) {
					criteria.add(Expression.like("centro", getLike(searchCriteria.getCentro())));
					}
				return criteria.list();
			}
		});
	}

	protected String getLike(String value){
		return "%" + value + "%";
	}
	
	
}
