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
public class Revision extends PersistentObject{
		
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;
	
	@Column(name="hemorragia_cerebral_6m")
	private Boolean hemorragiaCerebral6m;
	
	@Column(name="trombosis_intrastent_6m")
	private Boolean trombosisIntrastent6m;
	  
	@Column(name="fecha_revision_6m")
	private Date fecharRevision6m;
	  
	@Column(name="trombosis_arterial_6m")
	private Boolean trombosisArterial6m;
	  
	@Column(name="prolapso_coils_6m")
	private Boolean prolapsoCoils6m;
	  
	@Column(name="hiperplasia_6m")
	private Boolean hiperplasia6m;
	  
	@Column(name="alteraciones_calibre_6m")
	private Boolean alteracionesCalibre6m;
	  
	@Column(name="grado_oclusion_6m")
	private Integer gradoOclusion6m;
	  
	@Column(name="empaquetamiento_coils_6m")
	private Boolean empaquetamientoCoils6m;
	  
	@Column(name="recoiling_6m")
	private Boolean recoiling6m;
	  
	@Column(name="deterioro_neurologico_6m")
	private Boolean deterioroNeurologico6m;
	  
	@Column(name="deficit_pares_craneales_6m")
	private Boolean deficitParesCraneales6m;
	  
	@Column(name="stroke_cva_6m")
	private Boolean strokeCva6m;	
	
	@Column(name="hemorragia_cerebral_12m")
	private Boolean hemorragiaCerebral12m;
	
	@Column(name="trombosis_intrastent_12m")
	private Boolean trombosisIntrastent12m;
	  
	@Column(name="fecha_revision_12m")
	private Date fecharRevision12m;
	  
	@Column(name="trombosis_arterial_12m")
	private Boolean trombosisArterial12m;
	  
	@Column(name="prolapso_coils_12m")
	private Boolean prolapsoCoils12m;
	  
	@Column(name="hiperplasia_12m")
	private Boolean hiperplasia12m;
	  
	@Column(name="alteraciones_calibre_12m")
	private Boolean alteracionesCalibre12m;
	  
	@Column(name="grado_oclusion_12m")
	private Integer gradoOclusion12m;
	  
	@Column(name="empaquetamiento_coils_12m")
	private Boolean empaquetamientoCoils12m;
	  
	@Column(name="recoiling_12m")
	private Boolean recoiling12m;
	  
	@Column(name="deterioro_neurologico_12m")
	private Boolean deterioroNeurologico12m;
	  
	@Column(name="deficit_pares_craneales_12m")
	private Boolean deficitParesCraneales12m;
	  
	@Column(name="stroke_cva_12m")
	private Boolean strokeCva12m;
	
	@Column(name="hemorragia_cerebral_24m")
	private Boolean hemorragiaCerebral24m;
	
	@Column(name="trombosis_intrastent_24m")
	private Boolean trombosisIntrastent24m;
	  
	@Column(name="fecha_revision_24m")
	private Date fecharRevision24m;
	  
	@Column(name="trombosis_arterial_24m")
	private Boolean trombosisArterial24m;
	  
	@Column(name="prolapso_coils_24m")
	private Boolean prolapsoCoils24m;
	  
	@Column(name="hiperplasia_24m")
	private Boolean hiperplasia24m;
	  
	@Column(name="alteraciones_calibre_24m")
	private Boolean alteracionesCalibre24m;
	  
	@Column(name="grado_oclusion_24m")
	private Integer gradoOclusion24m;
	  
	@Column(name="empaquetamiento_coils_24m")
	private Boolean empaquetamientoCoils24m;
	  
	@Column(name="recoiling_24m")
	private Boolean recoiling24m;
	  
	@Column(name="deterioro_neurologico_24m")
	private Boolean deterioroNeurologico24m;
	  
	@Column(name="deficit_pares_craneales_24m")
	private Boolean deficitParesCraneales24m;
	  
	@Column(name="stroke_cva_24m")
	private Boolean strokeCva24m;
	
	@ManyToOne
	@JoinColumn(name = "procedimiento_id")
	private Procedimiento procedimiento = new Procedimiento();

	@OneToMany (mappedBy="revision")
	@Fetch(FetchMode.SUBSELECT)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ImagenRevision> imagenes;
	

/**
	 * @return the imagenes
	 */
	public List<ImagenRevision> getImagenes() {
		return imagenes;
	}
	/**
	 * @param imagenes the imagenes to set
	 */
	public void setImagenes(List<ImagenRevision> imagenes) {
		this.imagenes = imagenes;
	}
/**
	 * @return the alteracionesCalibre12m
	 */
	public Boolean getAlteracionesCalibre12m() {
		return alteracionesCalibre12m;
	}
	/**
	 * @return the alteracionesCalibre24m
	 */
	public Boolean getAlteracionesCalibre24m() {
		return alteracionesCalibre24m;
	}
	/**
	 * @return the alteracionesCalibre6m
	 */
	public Boolean getAlteracionesCalibre6m() {
		return alteracionesCalibre6m;
	}
	/**
	 * @return the deficitParesCraneales12m
	 */
	public Boolean getDeficitParesCraneales12m() {
		return deficitParesCraneales12m;
	}
	/**
	 * @return the deficitParesCraneales24m
	 */
	public Boolean getDeficitParesCraneales24m() {
		return deficitParesCraneales24m;
	}
	/**
	 * @return the deficitParesCraneales6m
	 */
	public Boolean getDeficitParesCraneales6m() {
		return deficitParesCraneales6m;
	}
	/**
	 * @return the deterioroNeurologico12m
	 */
	public Boolean getDeterioroNeurologico12m() {
		return deterioroNeurologico12m;
	}
	/**
	 * @return the deterioroNeurologico24m
	 */
	public Boolean getDeterioroNeurologico24m() {
		return deterioroNeurologico24m;
	}
	/**
	 * @return the deterioroNeurologico6m
	 */
	public Boolean getDeterioroNeurologico6m() {
		return deterioroNeurologico6m;
	}
	/**
	 * @return the empaquetamientoCoils12m
	 */
	public Boolean getEmpaquetamientoCoils12m() {
		return empaquetamientoCoils12m;
	}
	/**
	 * @return the empaquetamientoCoils24m
	 */
	public Boolean getEmpaquetamientoCoils24m() {
		return empaquetamientoCoils24m;
	}
	/**
	 * @return the empaquetamientoCoils6m
	 */
	public Boolean getEmpaquetamientoCoils6m() {
		return empaquetamientoCoils6m;
	}
	/**
	 * @return the fecharRevision12m
	 */
	public Date getFecharRevision12m() {
		return fecharRevision12m;
	}
	/**
	 * @return the fecharRevision24m
	 */
	public Date getFecharRevision24m() {
		return fecharRevision24m;
	}
	/**
	 * @return the fecharRevision6m
	 */
	public Date getFecharRevision6m() {
		return fecharRevision6m;
	}
	/**
	 * @return the gradoOclusion12m
	 */
	public Integer getGradoOclusion12m() {
		return gradoOclusion12m;
	}
	/**
	 * @return the gradoOclusion24m
	 */
	public Integer getGradoOclusion24m() {
		return gradoOclusion24m;
	}
	/**
	 * @return the gradoOclusion6m
	 */
	public Integer getGradoOclusion6m() {
		return gradoOclusion6m;
	}
	/**
	 * @return the hemorragiaCerebral12m
	 */
	public Boolean getHemorragiaCerebral12m() {
		return hemorragiaCerebral12m;
	}
	/**
	 * @return the hemorragiaCerebral24m
	 */
	public Boolean getHemorragiaCerebral24m() {
		return hemorragiaCerebral24m;
	}
	/**
	 * @return the hemorragiaCerebral6m
	 */
	public Boolean getHemorragiaCerebral6m() {
		return hemorragiaCerebral6m;
	}
	/**
	 * @return the hiperplasia12m
	 */
	public Boolean getHiperplasia12m() {
		return hiperplasia12m;
	}
	/**
	 * @return the hiperplasia24m
	 */
	public Boolean getHiperplasia24m() {
		return hiperplasia24m;
	}
	/**
	 * @return the hiperplasia6m
	 */
	public Boolean getHiperplasia6m() {
		return hiperplasia6m;
	}
	/**
	 * @return the prolapsoCoils12m
	 */
	public Boolean getProlapsoCoils12m() {
		return prolapsoCoils12m;
	}
	/**
	 * @return the prolapsoCoils24m
	 */
	public Boolean getProlapsoCoils24m() {
		return prolapsoCoils24m;
	}
	/**
	 * @return the prolapsoCoils6m
	 */
	public Boolean getProlapsoCoils6m() {
		return prolapsoCoils6m;
	}
	/**
	 * @return the recoiling12m
	 */
	public Boolean getRecoiling12m() {
		return recoiling12m;
	}
	/**
	 * @return the recoiling24m
	 */
	public Boolean getRecoiling24m() {
		return recoiling24m;
	}
	/**
	 * @return the recoiling6m
	 */
	public Boolean getRecoiling6m() {
		return recoiling6m;
	}
	/**
	 * @return the strokeCva12m
	 */
	public Boolean getStrokeCva12m() {
		return strokeCva12m;
	}
	/**
	 * @return the strokeCva24m
	 */
	public Boolean getStrokeCva24m() {
		return strokeCva24m;
	}
	/**
	 * @return the strokeCva6m
	 */
	public Boolean getStrokeCva6m() {
		return strokeCva6m;
	}
	/**
	 * @return the trombosisArterial12m
	 */
	public Boolean getTrombosisArterial12m() {
		return trombosisArterial12m;
	}
	/**
	 * @return the trombosisArterial24m
	 */
	public Boolean getTrombosisArterial24m() {
		return trombosisArterial24m;
	}
	/**
	 * @return the trombosisArterial6m
	 */
	public Boolean getTrombosisArterial6m() {
		return trombosisArterial6m;
	}
	/**
	 * @return the trombosisIntrastent12m
	 */
	public Boolean getTrombosisIntrastent12m() {
		return trombosisIntrastent12m;
	}
	/**
	 * @return the trombosisIntrastent24m
	 */
	public Boolean getTrombosisIntrastent24m() {
		return trombosisIntrastent24m;
	}
	/**
	 * @return the trombosisIntrastent6m
	 */
	public Boolean getTrombosisIntrastent6m() {
		return trombosisIntrastent6m;
	}
	/**
	 * @param alteracionesCalibre12m the alteracionesCalibre12m to set
	 */
	public void setAlteracionesCalibre12m(Boolean alteracionesCalibre12m) {
		this.alteracionesCalibre12m = alteracionesCalibre12m;
	}
	/**
	 * @param alteracionesCalibre24m the alteracionesCalibre24m to set
	 */
	public void setAlteracionesCalibre24m(Boolean alteracionesCalibre24m) {
		this.alteracionesCalibre24m = alteracionesCalibre24m;
	}
	/**
	 * @param alteracionesCalibre6m the alteracionesCalibre6m to set
	 */
	public void setAlteracionesCalibre6m(Boolean alteracionesCalibre6m) {
		this.alteracionesCalibre6m = alteracionesCalibre6m;
	}
	/**
	 * @param deficitParesCraneales12m the deficitParesCraneales12m to set
	 */
	public void setDeficitParesCraneales12m(Boolean deficitParesCraneales12m) {
		this.deficitParesCraneales12m = deficitParesCraneales12m;
	}
	/**
	 * @param deficitParesCraneales24m the deficitParesCraneales24m to set
	 */
	public void setDeficitParesCraneales24m(Boolean deficitParesCraneales24m) {
		this.deficitParesCraneales24m = deficitParesCraneales24m;
	}
	/**
	 * @param deficitParesCraneales6m the deficitParesCraneales6m to set
	 */
	public void setDeficitParesCraneales6m(Boolean deficitParesCraneales6m) {
		this.deficitParesCraneales6m = deficitParesCraneales6m;
	}
	/**
	 * @param deterioroNeurologico12m the deterioroNeurologico12m to set
	 */
	public void setDeterioroNeurologico12m(Boolean deterioroNeurologico12m) {
		this.deterioroNeurologico12m = deterioroNeurologico12m;
	}
	/**
	 * @param deterioroNeurologico24m the deterioroNeurologico24m to set
	 */
	public void setDeterioroNeurologico24m(Boolean deterioroNeurologico24m) {
		this.deterioroNeurologico24m = deterioroNeurologico24m;
	}
	/**
	 * @param deterioroNeurologico6m the deterioroNeurologico6m to set
	 */
	public void setDeterioroNeurologico6m(Boolean deterioroNeurologico6m) {
		this.deterioroNeurologico6m = deterioroNeurologico6m;
	}
	/**
	 * @param empaquetamientoCoils12m the empaquetamientoCoils12m to set
	 */
	public void setEmpaquetamientoCoils12m(Boolean empaquetamientoCoils12m) {
		this.empaquetamientoCoils12m = empaquetamientoCoils12m;
	}
	/**
	 * @param empaquetamientoCoils24m the empaquetamientoCoils24m to set
	 */
	public void setEmpaquetamientoCoils24m(Boolean empaquetamientoCoils24m) {
		this.empaquetamientoCoils24m = empaquetamientoCoils24m;
	}
	/**
	 * @param empaquetamientoCoils6m the empaquetamientoCoils6m to set
	 */
	public void setEmpaquetamientoCoils6m(Boolean empaquetamientoCoils6m) {
		this.empaquetamientoCoils6m = empaquetamientoCoils6m;
	}
	/**
	 * @param fecharRevision12m the fecharRevision12m to set
	 */
	public void setFecharRevision12m(Date fecharRevision12m) {
		this.fecharRevision12m = fecharRevision12m;
	}
	/**
	 * @param fecharRevision24m the fecharRevision24m to set
	 */
	public void setFecharRevision24m(Date fecharRevision24m) {
		this.fecharRevision24m = fecharRevision24m;
	}
	/**
	 * @param fecharRevision6m the fecharRevision6m to set
	 */
	public void setFecharRevision6m(Date fecharRevision6m) {
		this.fecharRevision6m = fecharRevision6m;
	}
	/**
	 * @param gradoOclusion12m the gradoOclusion12m to set
	 */
	public void setGradoOclusion12m(Integer gradoOclusion12m) {
		this.gradoOclusion12m = gradoOclusion12m;
	}
	/**
	 * @param gradoOclusion24m the gradoOclusion24m to set
	 */
	public void setGradoOclusion24m(Integer gradoOclusion24m) {
		this.gradoOclusion24m = gradoOclusion24m;
	}
	/**
	 * @param gradoOclusion6m the gradoOclusion6m to set
	 */
	public void setGradoOclusion6m(Integer gradoOclusion6m) {
		this.gradoOclusion6m = gradoOclusion6m;
	}
	/**
	 * @param hemorragiaCerebral12m the hemorragiaCerebral12m to set
	 */
	public void setHemorragiaCerebral12m(Boolean hemorragiaCerebral12m) {
		this.hemorragiaCerebral12m = hemorragiaCerebral12m;
	}
	/**
	 * @param hemorragiaCerebral24m the hemorragiaCerebral24m to set
	 */
	public void setHemorragiaCerebral24m(Boolean hemorragiaCerebral24m) {
		this.hemorragiaCerebral24m = hemorragiaCerebral24m;
	}
	/**
	 * @param hemorragiaCerebral6m the hemorragiaCerebral6m to set
	 */
	public void setHemorragiaCerebral6m(Boolean hemorragiaCerebral6m) {
		this.hemorragiaCerebral6m = hemorragiaCerebral6m;
	}
	/**
	 * @param hiperplasia12m the hiperplasia12m to set
	 */
	public void setHiperplasia12m(Boolean hiperplasia12m) {
		this.hiperplasia12m = hiperplasia12m;
	}
	/**
	 * @param hiperplasia24m the hiperplasia24m to set
	 */
	public void setHiperplasia24m(Boolean hiperplasia24m) {
		this.hiperplasia24m = hiperplasia24m;
	}
	/**
	 * @param hiperplasia6m the hiperplasia6m to set
	 */
	public void setHiperplasia6m(Boolean hiperplasia6m) {
		this.hiperplasia6m = hiperplasia6m;
	}
	/**
	 * @param prolapsoCoils12m the prolapsoCoils12m to set
	 */
	public void setProlapsoCoils12m(Boolean prolapsoCoils12m) {
		this.prolapsoCoils12m = prolapsoCoils12m;
	}
	/**
	 * @param prolapsoCoils24m the prolapsoCoils24m to set
	 */
	public void setProlapsoCoils24m(Boolean prolapsoCoils24m) {
		this.prolapsoCoils24m = prolapsoCoils24m;
	}
	/**
	 * @param prolapsoCoils6m the prolapsoCoils6m to set
	 */
	public void setProlapsoCoils6m(Boolean prolapsoCoils6m) {
		this.prolapsoCoils6m = prolapsoCoils6m;
	}
	/**
	 * @param recoiling12m the recoiling12m to set
	 */
	public void setRecoiling12m(Boolean recoiling12m) {
		this.recoiling12m = recoiling12m;
	}
	/**
	 * @param recoiling24m the recoiling24m to set
	 */
	public void setRecoiling24m(Boolean recoiling24m) {
		this.recoiling24m = recoiling24m;
	}
	/**
	 * @param recoiling6m the recoiling6m to set
	 */
	public void setRecoiling6m(Boolean recoiling6m) {
		this.recoiling6m = recoiling6m;
	}
	/**
	 * @param strokeCva12m the strokeCva12m to set
	 */
	public void setStrokeCva12m(Boolean strokeCva12m) {
		this.strokeCva12m = strokeCva12m;
	}
	/**
	 * @param strokeCva24m the strokeCva24m to set
	 */
	public void setStrokeCva24m(Boolean strokeCva24m) {
		this.strokeCva24m = strokeCva24m;
	}
	/**
	 * @param strokeCva6m the strokeCva6m to set
	 */
	public void setStrokeCva6m(Boolean strokeCva6m) {
		this.strokeCva6m = strokeCva6m;
	}
	/**
	 * @param trombosisArterial12m the trombosisArterial12m to set
	 */
	public void setTrombosisArterial12m(Boolean trombosisArterial12m) {
		this.trombosisArterial12m = trombosisArterial12m;
	}
	/**
	 * @param trombosisArterial24m the trombosisArterial24m to set
	 */
	public void setTrombosisArterial24m(Boolean trombosisArterial24m) {
		this.trombosisArterial24m = trombosisArterial24m;
	}
	/**
	 * @param trombosisArterial6m the trombosisArterial6m to set
	 */
	public void setTrombosisArterial6m(Boolean trombosisArterial6m) {
		this.trombosisArterial6m = trombosisArterial6m;
	}
	/**
	 * @param trombosisIntrastent12m the trombosisIntrastent12m to set
	 */
	public void setTrombosisIntrastent12m(Boolean trombosisIntrastent12m) {
		this.trombosisIntrastent12m = trombosisIntrastent12m;
	}
	/**
	 * @param trombosisIntrastent24m the trombosisIntrastent24m to set
	 */
	public void setTrombosisIntrastent24m(Boolean trombosisIntrastent24m) {
		this.trombosisIntrastent24m = trombosisIntrastent24m;
	}
	/**
	 * @param trombosisIntrastent6m the trombosisIntrastent6m to set
	 */
	public void setTrombosisIntrastent6m(Boolean trombosisIntrastent6m) {
		this.trombosisIntrastent6m = trombosisIntrastent6m;
	}

/**
 * @return the id
 */
public Long getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(Long id) {
	this.id = id;
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
 * @return the procedimiento
 */
public Procedimiento getProcedimiento() {
	return procedimiento;
}
/**
 * @param procedimiento the procedimiento to set
 */
public void setProcedimiento(Procedimiento procedimiento) {
	this.procedimiento = procedimiento;
}


}
