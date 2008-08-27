package com.stentstudio.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Paciente extends PersistentObject {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
    
	@Column(name="nombre",length=64)
	private String nombre;
	
	@Column(name="identificador",length=64)
	private String identificador;
	
	@Column(name="nhc",length=8)
	private Integer nhc;
	
	@Column(name="apellido1",length=64)
	private String apellido1;
	
	@Column(name="apellido2",length=64)
	private String apellido2;
	
	@Column(name="neurorradiologo",length=64)
	private String neurorradiologo;
	
	@Column(name="centro",length=64)
	private String centro;
	
	@Column(name="edad",length=3)
	private Integer edad;
	
	@Column(name="fecha_inclusion")
	private Date fechaInclusion;
	
	@Column(name="fecha_nacimiento")
	private Date fechaNaciemiento;
	
	@Column(name="hipertension")
	private Boolean hipertension;
	
	@Column(name="e_endocrina_met")
	private Boolean endocrinaMet; 
	
	@Column(name="e_cardiovascular")
	private Boolean cardiovascular;
	
	@Column(name="e_renal")
	private Boolean renal;
	
	@Column(name="contraind_antiagreg")
	private Boolean contraindAntiagreg;
	
	@Column(name="diabetes")
	private Boolean diabetes;
	
	@Column(name="hipersen_contraste")
	private Boolean hipersenContraste;
	
	@Column(name="paciente_otros",length=32)
	private String pacienteOtros;
	
	@OneToMany (mappedBy="paciente")
	@Fetch(FetchMode.SUBSELECT)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Aneurisma> aneurismas;
	

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
	 * @return the neurorradiologo
	 */
	public String getNeurorradiologo() {
		return neurorradiologo;
	}
	/**
	 * @return the centro
	 */
	public String getCentro() {
		return centro;
	}
	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}
	/**
	 * @return the fechaInclusion
	 */
	public Date getFechaInclusion() {
		return fechaInclusion;
	}
	/**
	 * @return the fechaNaciemiento
	 */
	public Date getFechaNaciemiento() {
		return fechaNaciemiento;
	}
	
	/**
	 * @return the pacienteOtros
	 */
	public String getPacienteOtros() {
		return pacienteOtros;
	}
		
	
	/**
	 * @return the hipertension
	 */
	public Boolean getHipertension() {
		return hipertension;
	}
	/**
	 * @return the endocrinaMet
	 */
	public Boolean getEndocrinaMet() {
		return endocrinaMet;
	}
	/**
	 * @return the cardiovascular
	 */
	public Boolean getCardiovascular() {
		return cardiovascular;
	}
	/**
	 * @return the renal
	 */
	public Boolean getRenal() {
		return renal;
	}
	/**
	 * @return the contraindAntiagreg
	 */
	public Boolean getContraindAntiagreg() {
		return contraindAntiagreg;
	}
	/**
	 * @return the diabetes
	 */
	public Boolean getDiabetes() {
		return diabetes;
	}
	/**
	 * @return the hipersenContraste
	 */
	public Boolean getHipersenContraste() {
		return hipersenContraste;
	}
	/**
	 * @return the aneurimas
	 */
	public List<Aneurisma> getAneurismas() {
		return aneurismas;
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
	 * @param neurorradiologo the neurorradiologo to set
	 */
	public void setNeurorradiologo(String neurorradiologo) {
		this.neurorradiologo = neurorradiologo;
	}
	/**
	 * @param centro the centro to set
	 */
	public void setCentro(String centro) {
		this.centro = centro;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	/**
	 * @param fechaInclusion the fechaInclusion to set
	 */
	public void setFechaInclusion(Date fechaInclusion) {
		this.fechaInclusion = fechaInclusion;
	}
	/**
	 * @param fechaNaciemiento the fechaNaciemiento to set
	 */
	public void setFechaNaciemiento(Date fechaNaciemiento) {
		this.fechaNaciemiento = fechaNaciemiento;
	}

	/**
	 * @param pacienteOtros the pacienteOtros to set
	 */
	public void setPacienteOtros(String pacienteOtros) {
		this.pacienteOtros = pacienteOtros;
	}
	/**
	 * @param hipertension the hipertension to set
	 */
	public void setHipertension(Boolean hipertension) {
		this.hipertension = hipertension;
	}
	/**
	 * @param endocrinaMet the endocrinaMet to set
	 */
	public void setEndocrinaMet(Boolean endocrinaMet) {
		this.endocrinaMet = endocrinaMet;
	}
	/**
	 * @param cardiovascular the cardiovascular to set
	 */
	public void setCardiovascular(Boolean cardiovascular) {
		this.cardiovascular = cardiovascular;
	}
	/**
	 * @param renal the renal to set
	 */
	public void setRenal(Boolean renal) {
		this.renal = renal;
	}
	/**
	 * @param contraindAntiagreg the contraindAntiagreg to set
	 */
	public void setContraindAntiagreg(Boolean contraindAntiagreg) {
		this.contraindAntiagreg = contraindAntiagreg;
	}
	/**
	 * @param diabetes the diabetes to set
	 */
	public void setDiabetes(Boolean diabetes) {
		this.diabetes = diabetes;
	}
	/**
	 * @param hipersenContraste the hipersenContraste to set
	 */
	public void setHipersenContraste(Boolean hipersenContraste) {
		this.hipersenContraste = hipersenContraste;
	}
	/**
	 * @param aneurimas the aneurimas to set
	 */
	public void setAneurismas(List<Aneurisma> aneurismas) {
		this.aneurismas = aneurismas;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((apellido1 == null) ? 0 : apellido1.hashCode());
		result = prime * result
				+ ((apellido2 == null) ? 0 : apellido2.hashCode());
		result = prime * result + ((centro == null) ? 0 : centro.hashCode());
		result = prime
				* result
				+ ((contraindAntiagreg == null) ? 0 : contraindAntiagreg
						.hashCode());
		result = prime * result
				+ ((diabetes == null) ? 0 : diabetes.hashCode());
		result = prime * result
				+ ((cardiovascular == null) ? 0 : cardiovascular.hashCode());
		result = prime * result
				+ ((endocrinaMet == null) ? 0 : endocrinaMet.hashCode());
		result = prime * result + ((renal == null) ? 0 : renal.hashCode());
		result = prime * result + ((edad == null) ? 0 : edad.hashCode());
		result = prime * result
				+ ((fechaInclusion == null) ? 0 : fechaInclusion.hashCode());
		result = prime
				* result
				+ ((fechaNaciemiento == null) ? 0 : fechaNaciemiento.hashCode());
		result = prime
				* result
				+ ((hipersenContraste == null) ? 0 : hipersenContraste
						.hashCode());
		result = prime * result
				+ ((hipertension == null) ? 0 : hipertension.hashCode());
		result = prime * result
				+ ((neurorradiologo == null) ? 0 : neurorradiologo.hashCode());
		result = prime * result + ((nhc == null) ? 0 : nhc.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result
				+ ((pacienteOtros == null) ? 0 : pacienteOtros.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final Paciente other = (Paciente) obj;
		if (apellido1 == null) {
			if (other.apellido1 != null)
				return false;
		} else if (!apellido1.equals(other.apellido1))
			return false;
		if (apellido2 == null) {
			if (other.apellido2 != null)
				return false;
		} else if (!apellido2.equals(other.apellido2))
			return false;
		if (centro == null) {
			if (other.centro != null)
				return false;
		} else if (!centro.equals(other.centro))
			return false;
		if (contraindAntiagreg == null) {
			if (other.contraindAntiagreg != null)
				return false;
		} else if (!contraindAntiagreg.equals(other.contraindAntiagreg))
			return false;
		if (diabetes == null) {
			if (other.diabetes != null)
				return false;
		} else if (!diabetes.equals(other.diabetes))
			return false;
		if (cardiovascular == null) {
			if (other.cardiovascular != null)
				return false;
		} else if (!cardiovascular.equals(other.cardiovascular))
			return false;
		if (endocrinaMet == null) {
			if (other.endocrinaMet != null)
				return false;
		} else if (!endocrinaMet.equals(other.endocrinaMet))
			return false;
		if (renal == null) {
			if (other.renal != null)
				return false;
		} else if (!renal.equals(other.renal))
			return false;
		if (edad == null) {
			if (other.edad != null)
				return false;
		} else if (!edad.equals(other.edad))
			return false;
		if (fechaInclusion == null) {
			if (other.fechaInclusion != null)
				return false;
		} else if (!fechaInclusion.equals(other.fechaInclusion))
			return false;
		if (fechaNaciemiento == null) {
			if (other.fechaNaciemiento != null)
				return false;
		} else if (!fechaNaciemiento.equals(other.fechaNaciemiento))
			return false;
		if (hipersenContraste == null) {
			if (other.hipersenContraste != null)
				return false;
		} else if (!hipersenContraste.equals(other.hipersenContraste))
			return false;
		if (hipertension == null) {
			if (other.hipertension != null)
				return false;
		} else if (!hipertension.equals(other.hipertension))
			return false;
		if (neurorradiologo == null) {
			if (other.neurorradiologo != null)
				return false;
		} else if (!neurorradiologo.equals(other.neurorradiologo))
			return false;
		if (nhc == null) {
			if (other.nhc != null)
				return false;
		} else if (!nhc.equals(other.nhc))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (pacienteOtros == null) {
			if (other.pacienteOtros != null)
				return false;
		} else if (!pacienteOtros.equals(other.pacienteOtros))
			return false;
		return true;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
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
