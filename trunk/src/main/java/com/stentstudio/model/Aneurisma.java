package com.stentstudio.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
public class Aneurisma extends PersistentObject{

    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
    
	@Column(name="longitud")
	private Integer longitud;

	@Column(name="anchura_max")
	private Integer anchuraMax;

	@Column(name="altura_max")
	private Integer alturaMax;

	@Column(name="rel_cuello_anchura")
	private Integer relCuelloAnchura;

	@Column(name="segmento_aferente1")
	private Integer segmentoAferente1;

	@Column(name="segmento_aferente2")
	private Integer segmentoAferente2;

	@Column(name="forma",length=64)
	private String forma;

	@Column(name="localizacion",length=256)
	private String localizacion;

	@Column(name="otras_localizaciones",length=64)
	private String otrasLocalizaciones;

	@Column(name="vasos_tortusos")
	private Boolean vasosTortuosos;

	@Column(name="fecha_rotura")
	private Date fechaRotura;

	@Column(name="fecha_aneurisma")
	private Date fechaAneurisma;

	@Column(name="rotura")
	private Boolean rotura;

	@Column(name="evaluacion_coagulo")
	private Boolean evaluacionCoagulo;

	@Column(name="clipping_intracraneal")
	private Boolean clippingIntracraneal;

	@Column(name="embolizacion_intracraneal")
	private Boolean embolizacionIntracraneal;

	@Column(name="paralisis_nervios")
	private Boolean paralisisNervios;
	
	@Column(name="tipo_nervios")
	private String tipoNervios;
	
	@Column(name="otros_tipo_nervios")
	private String otrosTipoNervios;

	@Column(name="rankin_pre")
	private Integer rankinPre;

	@Column(name="glasgow_pre")
	private Integer glasgowPre;

	@Column(name="hem_intracraneal")
	private Boolean hemIntracraneal;

	@Column(name="hem_subdural")
	private Boolean hemSubdural;

	@Column(name="acv")
	private Boolean acv;

	@Column(name="convulsiones")
	private Boolean convulsiones;

	@Column(name="cefaleas")
	private Boolean cefaleas;

	@Column(name="hem_subaracnoidea")
	private Boolean hemSubaracnoidea;
	
	@Column(name="paciente_otros",length=128)
	private String pacienteOtros;
	
	@OneToMany (mappedBy="aneurisma")
	@Fetch(FetchMode.SUBSELECT)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Procedimiento> procedimientos;

	@OneToMany (mappedBy="aneurisma")
	@Fetch(FetchMode.SUBSELECT)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ImagenAneurisma> imagenes;

	@ManyToOne 
	@JoinColumn (name="paciente_id")
	private Paciente paciente = new Paciente();
	
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
    
	/**
	 * @return the longitud
	 */
	public Integer getLongitud() {
		return longitud;
	}
	/**
	 * @return the anchuraMax
	 */
	public Integer getAnchuraMax() {
		return anchuraMax;
	}
	/**
	 * @return the alturaMax
	 */
	public Integer getAlturaMax() {
		return alturaMax;
	}
	/**
	 * @return the relCuelloAnchura
	 */
	public Integer getRelCuelloAnchura() {
		return relCuelloAnchura;
	}
	/**
	 * @return the segmentoAferente1
	 */
	public Integer getSegmentoAferente1() {
		return segmentoAferente1;
	}
	/**
	 * @return the segmentoAferente2
	 */
	public Integer getSegmentoAferente2() {
		return segmentoAferente2;
	}
	/**
	 * @return the forma
	 */
	public String getForma() {
		return forma;
	}
	
	/**
	 * @return the otrasLocalizaciones
	 */
	public String getOtrasLocalizaciones() {
		return otrasLocalizaciones;
	}
	/**
	 * @return the vasosTortuosos
	 */
	public Boolean getVasosTortuosos() {
		return vasosTortuosos;
	}
	/**
	 * @return the fechaRotura
	 */
	public Date getFechaRotura() {
		return fechaRotura;
	}
	/**
	 * @return the fechaAneurisma
	 */
	public Date getFechaAneurisma() {
		return fechaAneurisma;
	}
	/**
	 * @return the rotura
	 */
	public Boolean getRotura() {
		return rotura;
	}

	/**
	 * @return the evaluacionCoagulo
	 */
	public Boolean getEvaluacionCoagulo() {
		return evaluacionCoagulo;
	}
	/**
	 * @return the clippingIntracraneal
	 */
	public Boolean getClippingIntracraneal() {
		return clippingIntracraneal;
	}
	/**
	 * @return the embolizacionIntracraneal
	 */
	public Boolean getEmbolizacionIntracraneal() {
		return embolizacionIntracraneal;
	}
	/**
	 * @return the paralisisNervios
	 */
	public Boolean getParalisisNervios() {
		return paralisisNervios;
	}
	/**
	 * @return the rankinPre
	 */
	public Integer getRankinPre() {
		return rankinPre;
	}
	/**
	 * @return the glasgowPre
	 */
	public Integer getGlasgowPre() {
		return glasgowPre;
	}
	/**
	 * @return the hemIntracraneal
	 */
	public Boolean getHemIntracraneal() {
		return hemIntracraneal;
	}
	/**
	 * @return the hemSubdural
	 */
	public Boolean getHemSubdural() {
		return hemSubdural;
	}
	/**
	 * @return the acv
	 */
	public Boolean getAcv() {
		return acv;
	}
	/**
	 * @return the convulsiones
	 */
	public Boolean getConvulsiones() {
		return convulsiones;
	}
	/**
	 * @return the cefaleas
	 */
	public Boolean getCefaleas() {
		return cefaleas;
	}
	/**
	 * @return the hemoSubaracnoidea
	 */
	public Boolean getHemSubaracnoidea() {
		return hemSubaracnoidea;
	}
	/**
	 * @return the pacienteId
	 */
	public Paciente getPaciente() {
		return paciente;
	}

	
	
	
	
	
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param longitud the longitud to set
	 */
	public void setLongitud(Integer longitud) {
		this.longitud = longitud;
	}
	/**
	 * @param anchuraMax the anchuraMax to set
	 */
	public void setAnchuraMax(Integer anchuraMax) {
		this.anchuraMax = anchuraMax;
	}
	/**
	 * @param alturaMax the alturaMax to set
	 */
	public void setAlturaMax(Integer alturaMax) {
		this.alturaMax = alturaMax;
	}
	/**
	 * @param relCuelloAnchura the relCuelloAnchura to set
	 */
	public void setRelCuelloAnchura(Integer relCuelloAnchura) {
		this.relCuelloAnchura = relCuelloAnchura;
	}
	/**
	 * @param segmentoAferente1 the segmentoAferente1 to set
	 */
	public void setSegmentoAferente1(Integer segmentoAferente1) {
		this.segmentoAferente1 = segmentoAferente1;
	}
	/**
	 * @param segmentoAferente2 the segmentoAferente2 to set
	 */
	public void setSegmentoAferente2(Integer segmentoAferente2) {
		this.segmentoAferente2 = segmentoAferente2;
	}
	/**
	 * @param forma the forma to set
	 */
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	/**
	 * @return the localizacion
	 */
	public String getLocalizacion() {
		return localizacion;
	}

	/**
	 * @param localizacion the localizacion to set
	 */
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	/**
	 * @param otrasLocalizaciones the otrasLocalizaciones to set
	 */
	public void setOtrasLocalizaciones(String otrasLocalizaciones) {
		this.otrasLocalizaciones = otrasLocalizaciones;
	}
	/**
	 * @param vasosTortuosos the vasosTortuosos to set
	 */
	public void setVasosTortuosos(Boolean vasosTortuosos) {
		this.vasosTortuosos = vasosTortuosos;
	}
	/**
	 * @param fechaRotura the fechaRotura to set
	 */
	public void setFechaRotura(Date fechaRotura) {
		this.fechaRotura = fechaRotura;
	}
	/**
	 * @param fechaAneurisma the fechaAneurisma to set
	 */
	public void setFechaAneurisma(Date fechaAneurisma) {
		this.fechaAneurisma = fechaAneurisma;
	}
	/**
	 * @param rotura the rotura to set
	 */
	public void setRotura(Boolean rotura) {
		this.rotura = rotura;
	}

	/**
	 * @param evaluacionCoagulo the evaluacionCoagulo to set
	 */
	public void setEvaluacionCoagulo(Boolean evaluacionCoagulo) {
		this.evaluacionCoagulo = evaluacionCoagulo;
	}
	/**
	 * @param clippingIntracraneal the clippingIntracraneal to set
	 */
	public void setClippingIntracraneal(Boolean clippingIntracraneal) {
		this.clippingIntracraneal = clippingIntracraneal;
	}
	/**
	 * @param embolizacionIntracraneal the embolizacionIntracraneal to set
	 */
	public void setEmbolizacionIntracraneal(Boolean embolizacionIntracraneal) {
		this.embolizacionIntracraneal = embolizacionIntracraneal;
	}
	/**
	 * @param paralisisNervios the paralisisNervios to set
	 */
	public void setParalisisNervios(Boolean paralisisNervios) {
		this.paralisisNervios = paralisisNervios;
	}
	/**
	 * @param rankinPre the rankinPre to set
	 */
	public void setRankinPre(Integer rankinPre) {
		this.rankinPre = rankinPre;
	}
	/**
	 * @param glasgowPre the glasgowPre to set
	 */
	public void setGlasgowPre(Integer glasgowPre) {
		this.glasgowPre = glasgowPre;
	}
	/**
	 * @param hemIntracraneal the hemIntracraneal to set
	 */
	public void setHemIntracraneal(Boolean hemIntracraneal) {
		this.hemIntracraneal = hemIntracraneal;
	}
	/**
	 * @param hemSubdural the hemSubdural to set
	 */
	public void setHemSubdural(Boolean hemSubdural) {
		this.hemSubdural = hemSubdural;
	}
	/**
	 * @param acv the acv to set
	 */
	public void setAcv(Boolean acv) {
		this.acv = acv;
	}
	/**
	 * @param convulsiones the convulsiones to set
	 */
	public void setConvulsiones(Boolean convulsiones) {
		this.convulsiones = convulsiones;
	}
	/**
	 * @param cefaleas the cefaleas to set
	 */
	public void setCefaleas(Boolean cefaleas) {
		this.cefaleas = cefaleas;
	}
	/**
	 * @param hemoSubaracnoidea the hemoSubaracnoidea to set
	 */
	public void setHemoSubaracnoidea(Boolean hemSubaracnoidea) {
		this.hemSubaracnoidea = hemSubaracnoidea;
	}
	/**
	 * @param pacienteId the pacienteId to set
	 */
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	/**
	 * @param procedimientos the procedimientos to set
	 */
	public void setProcedimientos(List<Procedimiento> procedimientos) {
		this.procedimientos = procedimientos;
	}
	
	/**
	 * @return the procedimientos
	 */
	public List<Procedimiento> getProcedimientos() {
		return procedimientos;
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acv == null) ? 0 : acv.hashCode());
		result = prime * result
				+ ((alturaMax == null) ? 0 : alturaMax.hashCode());
		result = prime * result
				+ ((anchuraMax == null) ? 0 : anchuraMax.hashCode());
		result = prime * result
				+ ((cefaleas == null) ? 0 : cefaleas.hashCode());
		result = prime
				* result
				+ ((clippingIntracraneal == null) ? 0 : clippingIntracraneal
						.hashCode());
		result = prime * result
				+ ((convulsiones == null) ? 0 : convulsiones.hashCode());
		result = prime
				* result
				+ ((embolizacionIntracraneal == null) ? 0
						: embolizacionIntracraneal.hashCode());
		result = prime
				* result
				+ ((evaluacionCoagulo == null) ? 0 : evaluacionCoagulo
						.hashCode());
		result = prime * result
				+ ((fechaAneurisma == null) ? 0 : fechaAneurisma.hashCode());
		result = prime * result
				+ ((fechaRotura == null) ? 0 : fechaRotura.hashCode());
		result = prime * result + ((forma == null) ? 0 : forma.hashCode());
		result = prime * result
				+ ((glasgowPre == null) ? 0 : glasgowPre.hashCode());
		result = prime * result
				+ ((hemIntracraneal == null) ? 0 : hemIntracraneal.hashCode());
		result = prime * result
				+ ((hemSubdural == null) ? 0 : hemSubdural.hashCode());
		result = prime
				* result
				+ ((hemSubaracnoidea == null) ? 0 : hemSubaracnoidea
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((localizacion == null) ? 0 : localizacion.hashCode());
		result = prime * result
				+ ((longitud == null) ? 0 : longitud.hashCode());
		result = prime
				* result
				+ ((otrasLocalizaciones == null) ? 0 : otrasLocalizaciones
						.hashCode());
		result = prime
				* result
				+ ((paralisisNervios == null) ? 0 : paralisisNervios.hashCode());
		result = prime * result
				+ ((rankinPre == null) ? 0 : rankinPre.hashCode());
		result = prime
				* result
				+ ((relCuelloAnchura == null) ? 0 : relCuelloAnchura.hashCode());
		result = prime * result + (rotura ? 1231 : 1237);
		result = prime
				* result
				+ ((segmentoAferente1 == null) ? 0 : segmentoAferente1
						.hashCode());
		result = prime
				* result
				+ ((segmentoAferente2 == null) ? 0 : segmentoAferente2
						.hashCode());
		result = prime * result + (vasosTortuosos ? 1231 : 1237);
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
		final Aneurisma other = (Aneurisma) obj;
		if (acv == null) {
			if (other.acv != null)
				return false;
		} else if (!acv.equals(other.acv))
			return false;
		if (alturaMax == null) {
			if (other.alturaMax != null)
				return false;
		} else if (!alturaMax.equals(other.alturaMax))
			return false;
		if (anchuraMax == null) {
			if (other.anchuraMax != null)
				return false;
		} else if (!anchuraMax.equals(other.anchuraMax))
			return false;
		if (cefaleas == null) {
			if (other.cefaleas != null)
				return false;
		} else if (!cefaleas.equals(other.cefaleas))
			return false;
		if (clippingIntracraneal == null) {
			if (other.clippingIntracraneal != null)
				return false;
		} else if (!clippingIntracraneal.equals(other.clippingIntracraneal))
			return false;
		if (convulsiones == null) {
			if (other.convulsiones != null)
				return false;
		} else if (!convulsiones.equals(other.convulsiones))
			return false;
		if (embolizacionIntracraneal == null) {
			if (other.embolizacionIntracraneal != null)
				return false;
		} else if (!embolizacionIntracraneal
				.equals(other.embolizacionIntracraneal))
			return false;
		if (evaluacionCoagulo == null) {
			if (other.evaluacionCoagulo != null)
				return false;
		} else if (!evaluacionCoagulo.equals(other.evaluacionCoagulo))
			return false;
		if (fechaAneurisma == null) {
			if (other.fechaAneurisma != null)
				return false;
		} else if (!fechaAneurisma.equals(other.fechaAneurisma))
			return false;
		if (fechaRotura == null) {
			if (other.fechaRotura != null)
				return false;
		} else if (!fechaRotura.equals(other.fechaRotura))
			return false;
		if (forma == null) {
			if (other.forma != null)
				return false;
		} else if (!forma.equals(other.forma))
			return false;
		if (glasgowPre == null) {
			if (other.glasgowPre != null)
				return false;
		} else if (!glasgowPre.equals(other.glasgowPre))
			return false;
		if (hemIntracraneal == null) {
			if (other.hemIntracraneal != null)
				return false;
		} else if (!hemIntracraneal.equals(other.hemIntracraneal))
			return false;
		if (hemSubdural == null) {
			if (other.hemSubdural != null)
				return false;
		} else if (!hemSubdural.equals(other.hemSubdural))
			return false;
		if (hemSubaracnoidea == null) {
			if (other.hemSubaracnoidea != null)
				return false;
		} else if (!hemSubaracnoidea.equals(other.hemSubaracnoidea))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (localizacion == null) {
			if (other.localizacion != null)
				return false;
		} else if (!localizacion.equals(other.localizacion))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		if (otrasLocalizaciones == null) {
			if (other.otrasLocalizaciones != null)
				return false;
		} else if (!otrasLocalizaciones.equals(other.otrasLocalizaciones))
			return false;
		if (paralisisNervios == null) {
			if (other.paralisisNervios != null)
				return false;
		} else if (!paralisisNervios.equals(other.paralisisNervios))
			return false;
		if (rankinPre == null) {
			if (other.rankinPre != null)
				return false;
		} else if (!rankinPre.equals(other.rankinPre))
			return false;
		if (relCuelloAnchura == null) {
			if (other.relCuelloAnchura != null)
				return false;
		} else if (!relCuelloAnchura.equals(other.relCuelloAnchura))
			return false;
		if (rotura != other.rotura)
			return false;
		if (segmentoAferente1 == null) {
			if (other.segmentoAferente1 != null)
				return false;
		} else if (!segmentoAferente1.equals(other.segmentoAferente1))
			return false;
		if (segmentoAferente2 == null) {
			if (other.segmentoAferente2 != null)
				return false;
		} else if (!segmentoAferente2.equals(other.segmentoAferente2))
			return false;
		if (vasosTortuosos != other.vasosTortuosos)
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "";
	}

	/**
	 * @return the pacienteOtros
	 */
	public String getPacienteOtros() {
		return pacienteOtros;
	}

	/**
	 * @param hemSubaracnoidea the hemSubaracnoidea to set
	 */
	public void setHemSubaracnoidea(Boolean hemSubaracnoidea) {
		this.hemSubaracnoidea = hemSubaracnoidea;
	}

	/**
	 * @param pacienteOtros the pacienteOtros to set
	 */
	public void setPacienteOtros(String pacienteOtros) {
		this.pacienteOtros = pacienteOtros;
	}

	/**
	 * @return the tipoNervios
	 */
	public String getTipoNervios() {
		return tipoNervios;
	}

	/**
	 * @param tipoNervios the tipoNervios to set
	 */
	public void setTipoNervios(String tipoNervios) {
		this.tipoNervios = tipoNervios;
	}

	/**
	 * @return the otrosTipoNervios
	 */
	public String getOtrosTipoNervios() {
		return otrosTipoNervios;
	}

	/**
	 * @param otrosTipoNervios the otrosTipoNervios to set
	 */
	public void setOtrosTipoNervios(String otrosTipoNervios) {
		this.otrosTipoNervios = otrosTipoNervios;
	}

	/**
	 * @return the imagenes
	 */
	public List<ImagenAneurisma> getImagenes() {
		return imagenes;
	}

	/**
	 * @param imagenes the imagenes to set
	 */
	public void setImagenes(List<ImagenAneurisma> imagenes) {
		this.imagenes = imagenes;
	}

}
