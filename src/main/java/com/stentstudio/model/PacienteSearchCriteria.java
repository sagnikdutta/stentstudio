package com.stentstudio.model;

public class PacienteSearchCriteria {

	private Long id;
	private String identificador;
	private String nombre;
	private Integer nhc;
	private String apellido1;
	private String apellido2;
	private String neurorradiologo;
	private String centro;

	/**
	 * @return the centro
	 */
	public String getCentro() {
		return centro;
	}

	/**
	 * @param centro the centro to set
	 */
	public void setCentro(String centro) {
		this.centro = centro;
	}

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
	 * @return the nhc
	 */
	public Integer getNhc() {
		return nhc;
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
	 * @param nhc the nhc to set
	 */
	public void setNhc(Integer nhc) {
		this.nhc = nhc;
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
	 * @return the neurorradiologo
	 */
	public String getNeurorradiologo() {
		return neurorradiologo;
	}

	/**
	 * @param neurorradiologo the neurorradiologo to set
	 */
	public void setNeurorradiologo(String neurorradiologo) {
		this.neurorradiologo = neurorradiologo;
	}

	/**
	 * @return the identificador
	 */
	public String getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador the identificador to set
	 */
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	

}
