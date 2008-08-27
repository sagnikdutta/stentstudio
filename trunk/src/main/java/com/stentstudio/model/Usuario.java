package com.stentstudio.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.acegisecurity.GrantedAuthority;
import org.acegisecurity.userdetails.UserDetails;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
public class Usuario extends PersistentObject implements UserDetails {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	
	@Column(name="login",length=32)
	private String login;
	
	@Column(name="nombre",length=128)
	private String nombre;
	  
	@Column(name="apellido1",length=128)
	private String apellido1;
	  
	@Column(name="apellido2",length=128)
	private String apellido2;
	  
	@Column(name="mail",length=128)
	private String mail;
	  
	@Column(name="centro",length=32)
	private String centro;
	  
	@Column(name="contrasena")
	private String contrasena;
	
	@Column(name="administrador")
	private Boolean administrador;

    @Column(name="account_enabled",nullable=false)
    private boolean enabled;
    
    @Column(name="account_expired",nullable=false)
    private boolean accountExpired;
    
    @Column(name="account_locked",nullable=false)
    private boolean accountLocked;
    
    @Column(name="credentials_expired",nullable=false)
    private boolean credentialsExpired;
    
    
	@OneToMany (mappedBy="usuario")
	@Fetch(FetchMode.SUBSELECT)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Procedimiento> procedimientos;
	
	
	/**
	 * @return the procedimientos
	 */
	public List<Procedimiento> getProcedimientos() {
		return procedimientos;
	}

	/**
	 * @param procedimientos the procedimientos to set
	 */
	public void setProcedimientos(List<Procedimiento> procedimientos) {
		this.procedimientos = procedimientos;
	}

	/**
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * @return the apellido2Œ
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * @return the centro
	 */
	public String getCentro() {
		return centro;
	}

	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * @param centro the centro to set
	 */
	public void setCentro(String centro) {
		this.centro = centro;
	}

	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the administrador
	 */
	public Boolean getAdministrador() {
		return administrador;
	}

	/**
	 * @param administrador the administrador to set
	 */
	public void setAdministrador(Boolean administrador) {
		this.administrador = administrador;
	}

	 
    /**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @param accountExpired the accountExpired to set
	 */
	public void setAccountExpired(boolean accountExpired) {
		this.accountExpired = accountExpired;
	}

	/**
	 * @param accountLocked the accountLocked to set
	 */
	public void setAccountLocked(boolean accountLocked) {
		this.accountLocked = accountLocked;
	}

	/**
	 * @param credentialsExpired the credentialsExpired to set
	 */
	public void setCredentialsExpired(boolean credentialsExpired) {
		this.credentialsExpired = credentialsExpired;
	}

	/**
     * @see org.acegisecurity.userdetails.UserDetails#getAuthorities()
     * @return GrantedAuthority[] an array of roles.
     */
    @Transient
    public GrantedAuthority[] getAuthorities() {
        GrantedAuthority[] grantedAuthorities = new GrantedAuthority[1];
        grantedAuthorities[0] = new Role("ROLE_ADMIN");
        return grantedAuthorities;
    }

    public boolean isEnabled() {
        return enabled;
    }
    
    public boolean isAccountExpired() {
        return accountExpired;
    }
    
    /**
     * @see org.acegisecurity.userdetails.UserDetails#isAccountNonExpired()
     */
    @Transient
    public boolean isAccountNonExpired() {
        return !isAccountExpired();
    }

    public boolean isAccountLocked() {
        return accountLocked;
    }
    
    /**
     * @see org.acegisecurity.userdetails.UserDetails#isAccountNonLocked()
     */
    @Transient
    public boolean isAccountNonLocked() {
        return !isAccountLocked();
    }

    public boolean isCredentialsExpired() {
        return credentialsExpired;
    }
    
    /**
     * @see org.acegisecurity.userdetails.UserDetails#isCredentialsNonExpired()
     */
    @Transient
    public boolean isCredentialsNonExpired() {
        return !credentialsExpired;
    }
    

	/* (non-Javadoc)
	 * @see org.acegisecurity.userdetails.UserDetails#getPassword()
	 */
	public String getPassword() {
		return contrasena;
	}

	/* (non-Javadoc)
	 * @see org.acegisecurity.userdetails.UserDetails#getUsername()
	 */
	public String getUsername() {
		return login;
	}

	
	
}

class Role implements GrantedAuthority {

	private String name;
	
	public Role(String name) {
		this.name = name;
	}
	
	/* (non-Javadoc)
	 * @see org.acegisecurity.GrantedAuthority#getAuthority()
	 */
	public String getAuthority() {
		return name;
	}
	
}
