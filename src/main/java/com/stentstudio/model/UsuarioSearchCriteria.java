package com.stentstudio.model;

	import java.util.Date;
	import java.util.List;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.ManyToOne;
	import javax.persistence.OneToMany;

	import org.hibernate.Criteria;
	import org.hibernate.annotations.Fetch;
	import org.hibernate.annotations.FetchMode;
	import org.hibernate.annotations.LazyCollection;
	import org.hibernate.annotations.LazyCollectionOption;

	public class UsuarioSearchCriteria {

		private Long id;
		private String nombre;
		private String login;
		private String mail;
		private String apellido1;
		private String apellido2;

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @return the nombre
		 */
		public String getNombre() {
			return nombre;
		}

		/**
		 * @return the apellido1
		 */
		public String getApellido1() {
			return apellido1;
		}

		/**
		 * @return the apellido2
		 */
		public String getApellido2() {
			return apellido2;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNombre(String nombre) {
			this.nombre = nombre;
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

		
	
	
}
