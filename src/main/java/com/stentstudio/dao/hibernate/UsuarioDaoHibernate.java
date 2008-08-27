package com.stentstudio.dao.hibernate;

import java.util.List;

import org.acegisecurity.userdetails.UserDetails;
import org.acegisecurity.userdetails.UserDetailsService;
import org.acegisecurity.userdetails.UsernameNotFoundException;
import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.SessionFactoryUtils;

import com.stentstudio.dao.UsuarioDao;
import com.stentstudio.model.Usuario;
import com.stentstudio.model.UsuarioSearchCriteria;

/**
 * This class interacts with Spring's HibernateTemplate to save/delete and
 * retrieve User objects.
 *
 * @author <a href="mailto:matt@raibledesigns.com">Matt Raible</a>
 *   Modified by <a href="mailto:dan@getrolling.com">Dan Kibler</a>
 *   Extended to implement Acegi UserDetailsService interface by David Carter david@carter.net
 *   Modified by <a href="mailto:bwnoll@gmail.com">Bryan Noll</a> to work with 
 *   the new BaseDaoHibernate implementation that uses generics.
*/
public class UsuarioDaoHibernate extends GenericDaoHibernate<Usuario, Long> implements UsuarioDao, UserDetailsService {

    /**
     * Constructor that sets the entity to Usuario.class.
     */
    public UsuarioDaoHibernate() {
        super(Usuario.class);
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    public List<Usuario> getUsers() {
        return getHibernateTemplate().find("from Usuario u order by upper(u.login)");
    }

    /**
     * {@inheritDoc}
     */
    public Usuario saveUser(Usuario user) {
        log.debug("user's id: " + user.getId());
        getHibernateTemplate().saveOrUpdate(user);
        // necessary to throw a DataIntegrityViolation and catch it in UsuarioManager
        getHibernateTemplate().flush();
        return user;
    }

    /**
     * Overridden simply to call the saveUsuario method. This is happenening 
     * because saveUsuario flushes the session and saveObject of BaseDaoHibernate 
     * does not.
     *
     * @param user the user to save
     * @return the modified user (with a primary key set if they're new)
     */
    @Override
    public Usuario save(Usuario user) {
        return this.saveUser(user);
    }

    /** 
     * {@inheritDoc}
    */
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List users = getHibernateTemplate().find("from Usuario where login=?", username);
        if (users == null || users.isEmpty()) {
            throw new UsernameNotFoundException("user '" + username + "' not found...");
        } else {
            return (UserDetails) users.get(0);
        }
    }

    /** 
     * {@inheritDoc}
    */
    public String getUserPassword(String username) {
        SimpleJdbcTemplate jdbcTemplate =
                new SimpleJdbcTemplate(SessionFactoryUtils.getDataSource(getSessionFactory()));
        String password = null;
        try {
        	password = jdbcTemplate.queryForObject(        
                "select contrasena from Usuario where login=?", String.class, username);
        }catch (EmptyResultDataAccessException ex) {
        }
        return password;

    }
    

	public List<Usuario> searchUsuarios(final UsuarioSearchCriteria searchCriteria) throws DataAccessException {
		return (List<Usuario>) getHibernateTemplate().execute(new HibernateCallback() {
			public Object doInHibernate(Session session) {
				Criteria criteria = session.createCriteria(Usuario.class);
				if(searchCriteria.getMail() != null) {
					criteria.add(Expression.eq("mail", searchCriteria.getMail()));
				}
				if(searchCriteria.getNombre() != null) {
					criteria.add(Expression.like("nombre", getLike(searchCriteria.getNombre())));
				}
				if(searchCriteria.getApellido1() != null) {
					criteria.add(Expression.like("apellido1", getLike(searchCriteria.getApellido1())));
				}
				if(searchCriteria.getApellido2() != null) {
					criteria.add(Expression.like("apellido2", getLike(searchCriteria.getApellido2())));
				}
				if(searchCriteria.getLogin() != null) {
					criteria.add(Expression.like("login", getLike(searchCriteria.getLogin())));
				}
				return criteria.list();
			}
		});
	}

	protected String getLike(String value){
		return "%" + value + "%";
	}
	
}
