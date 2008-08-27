package com.stentstudio.model;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
public class Procedimiento extends PersistentObject {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long id;

	@Column(name="fecha_procedimiento")
	private Date fechaProcedimiento;

	@ManyToMany
    @JoinTable(name="procedimiento_leostent",
               joinColumns={@JoinColumn(name="procedimiento_id")},
               inverseJoinColumns={@JoinColumn(name="leostent_id")})
	@LazyCollection(LazyCollectionOption.FALSE)
    private List<LeoStent> leoStent;
	
	@Transient
	private String[] leoStentSelect;

	@ManyToMany
    @JoinTable(name="procedimiento_leoplusstent",
               joinColumns={@JoinColumn(name="procedimiento_id")},
               inverseJoinColumns={@JoinColumn(name="leoplusstent_id")})
	@LazyCollection(LazyCollectionOption.FALSE)
    private List<LeoPlusStent> leoPlusStent;
	
	@Transient
	private String[] leoPlusStentSelect;

	@ManyToMany
    @JoinTable(name="procedimiento_neuroform",
               joinColumns={@JoinColumn(name="procedimiento_id")},
               inverseJoinColumns={@JoinColumn(name="neuroformstent_id")})
	@LazyCollection(LazyCollectionOption.FALSE)
    private List<NeuroformStent> neuroformStent;
	
	@Transient
	private String[] neuroformStentSelect;
	
	@OneToOne
	@JoinColumn(name="microguias_terumo_id")
	private Microguia microguiasTerumo ; 
	
	@Transient
	private String microguiasTerumoSelect;
	
	@Transient
	private String dispositivoEmbolizacionSelect;

	@OneToOne
	@JoinColumn(name="dispositivo_embolizacion_id")
	private DispositivoEmbolizacion dispositivoEmbolizacion;
	
	private Boolean coilsActivosCheck;

	@ManyToMany
    @JoinTable(name="procedimiento_coilactivo",
               joinColumns={@JoinColumn(name="procedimiento_id")},
               inverseJoinColumns={@JoinColumn(name="coilactivo_id")})      
	@LazyCollection(LazyCollectionOption.FALSE)
    private List<CoilActivo> coilActivo;
	
	@Transient
	private String[] coilActivoSelect;
	
	private Boolean coilsNoActivosCheck;

	@ManyToMany
    @JoinTable(name="procedimiento_coilnoactivo",
               joinColumns={@JoinColumn(name="procedimiento_id")},
               inverseJoinColumns={@JoinColumn(name="coilnoactivo_id")})          
	@LazyCollection(LazyCollectionOption.FALSE)
    private List<CoilNoActivo> coilNoActivo;
	
	@Transient
	private String[] coilNoActivoSelect;

	private Boolean otrosCheck;
	private String introductor;
	private String portador;
	private String guia;
	private String materialOtros;	
	private String tipoStent;
	private String navegabilidadCateter;
	private String sistemaIntroduccion;
	private String navegabilidadStent;
	private String adaptacionStent;
	private String liberacionStent;
	private Boolean localizacionEstable;
	private String localizacion;
	private Boolean completaCobertura;
	private Boolean coilingParalelo;
	private Boolean coilingMalla;
	private Boolean noCoiling;
	private String mantenimientoPosicionCoils;
	private String adecuacionPared;
	private Boolean acortamientoStent;
	private Boolean complicaciones;
	private Boolean fracasoCateter;
	private Boolean malaPosicionStent;
	private Boolean migracionStent;
	private Boolean malaLiberacionStent;
	private Boolean complicacionesOtrosDispositivos;
	private String estadoProcedimiento;
	private String resultadoAngiograficoFinal;
	private Boolean agravadoProcedimiento;
	private Boolean complicacionesTrombosis;
	private Integer rankingPost;
	private Boolean trombosis;
	private Integer glasgowPost;
	private Boolean complicacionesCoilsCheck;
	private String complicacionesCoils;
	private Boolean complicacionesOtrosCheck;
	private String complicacionesOtros;
	private String descComplicacionOtros;
	private Boolean hemorragiaProcedimiento;
	private Boolean espasmoVascular;
	private Boolean hemorragiaPostProcedimiento;
	private Boolean trombosisParcialTotal;
	private Boolean complicacionesClinicas;
	private Boolean mantPostCoils;
	private String tipoParalisisNervios;
	private String trosEstadosPrevios;
	private String estadoNeuroOtros;
	
	@Column(name="dwi_pre")
	private Boolean dwiPre;
	
	@Column(name="hallazgos_dwi_pre",length=512)
	private String hallazgosDwiPre;
	
	@Column(name="dwi_post")
	private Boolean dwiPost;

	@Column(name="hallazgos_dwi_post",length=512)
	private String hallazgosDwiPost;
	
	@Column(name="plavix_pre")
	private Boolean plavixPre;
	
	@Column(name="clopidogrel_pre")
	private Boolean clopidogrelPre;
	
	@Column(name="heparina_durante")
	private Boolean heparinaDurante;
	
	@Column(name="aspirina_durante")
	private Boolean aspirinaDurante;
	
	@Column(name="clopidogrel_durante")
	private Boolean clopidogrelDurante;
	
	@Column(name="anticoagulante_durante")
	private Boolean anticoagulanteDurante;
	
	@Column(name="anticoagulante_post")
	private Boolean anticoagulantePost;
	
	@ManyToOne
	@JoinColumn(name = "aneurisma_id")
	private Aneurisma aneurisma = new Aneurisma();
	
	@OneToMany (mappedBy="procedimiento")
	@Fetch(FetchMode.SUBSELECT)
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Revision> revisiones;
	
	
	@ManyToOne 
	@JoinColumn (name="usuario_id")
	private Usuario usuario = new Usuario();
	
	
	
	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the fechaProcedimiento
	 */
	public Date getFechaProcedimiento() {
		return fechaProcedimiento;
	}

	/**
	 * @return the leoStent
	 */
	public List<LeoStent> getLeoStent() {
		return leoStent;
	}

	/**
	 * @return the leoPlusStent
	 */
	public List<LeoPlusStent> getLeoPlusStent() {
		return leoPlusStent;
	}

	/**
	 * @return the neuroformstent
	 */
	public List getNeuroformStent() {
		return neuroformStent;
	}

	/**
	 * @return the microguiasTerumo
	 */
	public Microguia getMicroguiasTerumo() {
		return microguiasTerumo;
	}

	/**
	 * @return the dispositivoEmbolizacion
	 */
	public DispositivoEmbolizacion getDispositivoEmbolizacion() {
		return dispositivoEmbolizacion;
	}

	/**
	 * @return the coilsActivosCheck
	 */
	public Boolean getCoilsActivosCheck() {
		return coilsActivosCheck;
	}

	/**
	 * @return the coilActivo
	 */
	public List getCoilActivo() {
		return coilActivo;
	}

	/**
	 * @return the coilsNoActivosCheck
	 */
	public Boolean getCoilsNoActivosCheck() {
		return coilsNoActivosCheck;
	}

	/**
	 * @return the coilNoActivo
	 */
	public List getCoilNoActivo() {
		return coilNoActivo;
	}

	/**
	 * @return the otrosCheck
	 */
	public Boolean getOtrosCheck() {
		return otrosCheck;
	}

	/**
	 * @return the introductor
	 */
	public String getIntroductor() {
		return introductor;
	}

	/**
	 * @return the portador
	 */
	public String getPortador() {
		return portador;
	}

	/**
	 * @return the guia
	 */
	public String getGuia() {
		return guia;
	}

	/**
	 * @return the materialOtros
	 */
	public String getMaterialOtros() {
		return materialOtros;
	}

	/**
	 * @return the tipoStent
	 */
	public String getTipoStent() {
		return tipoStent;
	}

	/**
	 * @return the navegabilidadCateter
	 */
	public String getNavegabilidadCateter() {
		return navegabilidadCateter;
	}

	/**
	 * @return the sistemaIntroduccion
	 */
	public String getSistemaIntroduccion() {
		return sistemaIntroduccion;
	}

	/**
	 * @return the navegabilidadStent
	 */
	public String getNavegabilidadStent() {
		return navegabilidadStent;
	}

	/**
	 * @return the adaptacionStent
	 */
	public String getAdaptacionStent() {
		return adaptacionStent;
	}

	/**
	 * @return the liberacionStent
	 */
	public String getLiberacionStent() {
		return liberacionStent;
	}

	/**
	 * @return the localizacionEstable
	 */
	public Boolean getLocalizacionEstable() {
		return localizacionEstable;
	}

	/**
	 * @return the localizacion
	 */
	public String getLocalizacion() {
		return localizacion;
	}

	/**
	 * @return the completaCobertura
	 */
	public Boolean getCompletaCobertura() {
		return completaCobertura;
	}

	/**
	 * @return the coilingParalelo
	 */
	public Boolean getCoilingParalelo() {
		return coilingParalelo;
	}

	/**
	 * @return the coilingMalla
	 */
	public Boolean getCoilingMalla() {
		return coilingMalla;
	}

	/**
	 * @return the noCoiling
	 */
	public Boolean getNoCoiling() {
		return noCoiling;
	}

	/**
	 * @return the mantenimientoPosicionCoils
	 */
	public String getMantenimientoPosicionCoils() {
		return mantenimientoPosicionCoils;
	}

	/**
	 * @return the adecuacionPared
	 */
	public String getAdecuacionPared() {
		return adecuacionPared;
	}

	/**
	 * @return the acortamientoStent
	 */
	public Boolean getAcortamientoStent() {
		return acortamientoStent;
	}

	/**
	 * @return the complicaciones
	 */
	public Boolean getComplicaciones() {
		return complicaciones;
	}

	/**
	 * @return the fracasoCateter
	 */
	public Boolean getFracasoCateter() {
		return fracasoCateter;
	}

	/**
	 * @return the malaPosicionStent
	 */
	public Boolean getMalaPosicionStent() {
		return malaPosicionStent;
	}

	/**
	 * @return the migracionStent
	 */
	public Boolean getMigracionStent() {
		return migracionStent;
	}

	/**
	 * @return the malaLiberacionStent
	 */
	public Boolean getMalaLiberacionStent() {
		return malaLiberacionStent;
	}

	/**
	 * @return the complicacionesOtrosDispositivos
	 */
	public Boolean getComplicacionesOtrosDispositivos() {
		return complicacionesOtrosDispositivos;
	}

	/**
	 * @return the estadoProcedimiento
	 */
	public String getEstadoProcedimiento() {
		return estadoProcedimiento;
	}

	/**
	 * @return the resultadoAngiograficoFinal
	 */
	public String getResultadoAngiograficoFinal() {
		return resultadoAngiograficoFinal;
	}

	/**
	 * @return the agravadoProcedimiento
	 */
	public Boolean getAgravadoProcedimiento() {
		return agravadoProcedimiento;
	}

	/**
	 * @return the complicacionesTrombosis
	 */
	public Boolean getComplicacionesTrombosis() {
		return complicacionesTrombosis;
	}

	/**
	 * @return the rankingPost
	 */
	public Integer getRankingPost() {
		return rankingPost;
	}

	/**
	 * @return the trombosis
	 */
	public Boolean getTrombosis() {
		return trombosis;
	}

	/**
	 * @return the glasgowPost
	 */
	public Integer getGlasgowPost() {
		return glasgowPost;
	}

	/**
	 * @return the complicacionesCoilsCheck
	 */
	public Boolean getComplicacionesCoilsCheck() {
		return complicacionesCoilsCheck;
	}

	/**
	 * @return the complicacionesCoils
	 */
	public String getComplicacionesCoils() {
		return complicacionesCoils;
	}

	/**
	 * @return the complicacionesOtrosCheck
	 */
	public Boolean getComplicacionesOtrosCheck() {
		return complicacionesOtrosCheck;
	}

	/**
	 * @return the complicacionesOtros
	 */
	public String getComplicacionesOtros() {
		return complicacionesOtros;
	}

	/**
	 * @return the descComplicacionOtros
	 */
	public String getDescComplicacionOtros() {
		return descComplicacionOtros;
	}

	/**
	 * @return the hemorragiaProcedimiento
	 */
	public Boolean getHemorragiaProcedimiento() {
		return hemorragiaProcedimiento;
	}

	/**
	 * @return the espasmoVascular
	 */
	public Boolean getEspasmoVascular() {
		return espasmoVascular;
	}

	/**
	 * @return the hemorragiaPostProcedimiento
	 */
	public Boolean getHemorragiaPostProcedimiento() {
		return hemorragiaPostProcedimiento;
	}

	/**
	 * @return the trombosisParcialTotal
	 */
	public Boolean getTrombosisParcialTotal() {
		return trombosisParcialTotal;
	}

	/**
	 * @return the complicacionesClinicas
	 */
	public Boolean getComplicacionesClinicas() {
		return complicacionesClinicas;
	}

	/**
	 * @return the mantPostCoils
	 */
	public Boolean getMantPostCoils() {
		return mantPostCoils;
	}

	/**
	 * @return the tipoParalisisNervios
	 */
	public String getTipoParalisisNervios() {
		return tipoParalisisNervios;
	}

	/**
	 * @return the trosEstadosPrevios
	 */
	public String getTrosEstadosPrevios() {
		return trosEstadosPrevios;
	}

	/**
	 * @return the estadoNeuroOtros
	 */
	public String getEstadoNeuroOtros() {
		return estadoNeuroOtros;
	}

	/**
	 * @return the aneurisma
	 */
	public Aneurisma getAneurisma() {
		return aneurisma;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param fechaProcedimiento the fechaProcedimiento to set
	 */
	public void setFechaProcedimiento(Date fechaProcedimiento) {
		this.fechaProcedimiento = fechaProcedimiento;
	}

	/**
	 * @param leoStent the leoStent to set
	 */
	public void setLeoStent(List<LeoStent> leoStent) {
		this.leoStent = leoStent;
	}

	/**
	 * @param leoPlusStent the leoPlusStent to set
	 */
	public void setLeoPlusStent(List<LeoPlusStent> leoPlusStent) {
		this.leoPlusStent = leoPlusStent;
	}

	/**
	 * @param neuroform the neuroform to set
	 */
	public void setNeuroformStent(List neuroformStent) {
		this.neuroformStent = neuroformStent;
	}

	/**
	 * @param microguiasTerumo the microguiasTerumo to set
	 */
	public void setMicroguiasTerumo(Microguia microguiasTerumo) {
		this.microguiasTerumo = microguiasTerumo;
	}

	/**
	 * @param dispositivoEmbolizacion the dispositivoEmbolizacion to set
	 */
	public void setDispositivoEmbolizacion(
			DispositivoEmbolizacion dispositivoEmbolizacion) {
		this.dispositivoEmbolizacion = dispositivoEmbolizacion;
	}

	/**
	 * @param coilsActivosCheck the coilsActivosCheck to set
	 */
	public void setCoilsActivosCheck(Boolean coilsActivosCheck) {
		this.coilsActivosCheck = coilsActivosCheck;
	}

	/**
	 * @param coilActivo the coilActivo to set
	 */
	public void setCoilActivo(List coilActivo) {
		this.coilActivo = coilActivo;
	}

	/**
	 * @param coilsNoActivosCheck the coilsNoActivosCheck to set
	 */
	public void setCoilsNoActivosCheck(Boolean coilsNoActivosCheck) {
		this.coilsNoActivosCheck = coilsNoActivosCheck;
	}

	/**
	 * @param coilNoActivo the coilNoActivo to set
	 */
	public void setCoilNoActivo(List coilNoActivo) {
		this.coilNoActivo = coilNoActivo;
	}

	/**
	 * @param otrosCheck the otrosCheck to set
	 */
	public void setOtrosCheck(Boolean otrosCheck) {
		this.otrosCheck = otrosCheck;
	}

	/**
	 * @param introductor the introductor to set
	 */
	public void setIntroductor(String introductor) {
		this.introductor = introductor;
	}

	/**
	 * @param portador the portador to set
	 */
	public void setPortador(String portador) {
		this.portador = portador;
	}

	/**
	 * @param guia the guia to set
	 */
	public void setGuia(String guia) {
		this.guia = guia;
	}

	/**
	 * @param materialOtros the materialOtros to set
	 */
	public void setMaterialOtros(String materialOtros) {
		this.materialOtros = materialOtros;
	}

	/**
	 * @param tipoStent the tipoStent to set
	 */
	public void setTipoStent(String tipoStent) {
		this.tipoStent = tipoStent;
	}

	/**
	 * @param navegabilidadCateter the navegabilidadCateter to set
	 */
	public void setNavegabilidadCateter(String navegabilidadCateter) {
		this.navegabilidadCateter = navegabilidadCateter;
	}

	/**
	 * @param sistemaIntroduccion the sistemaIntroduccion to set
	 */
	public void setSistemaIntroduccion(String sistemaIntroduccion) {
		this.sistemaIntroduccion = sistemaIntroduccion;
	}

	/**
	 * @param navegabilidadStent the navegabilidadStent to set
	 */
	public void setNavegabilidadStent(String navegabilidadStent) {
		this.navegabilidadStent = navegabilidadStent;
	}

	/**
	 * @param adaptacionStent the adaptacionStent to set
	 */
	public void setAdaptacionStent(String adaptacionStent) {
		this.adaptacionStent = adaptacionStent;
	}

	/**
	 * @param liberacionStent the liberacionStent to set
	 */
	public void setLiberacionStent(String liberacionStent) {
		this.liberacionStent = liberacionStent;
	}

	/**
	 * @param localizacionEstable the localizacionEstable to set
	 */
	public void setLocalizacionEstable(Boolean localizacionEstable) {
		this.localizacionEstable = localizacionEstable;
	}

	/**
	 * @param localizacion the localizacion to set
	 */
	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	/**
	 * @param completaCobertura the completaCobertura to set
	 */
	public void setCompletaCobertura(Boolean completaCobertura) {
		this.completaCobertura = completaCobertura;
	}

	/**
	 * @param coilingParalelo the coilingParalelo to set
	 */
	public void setCoilingParalelo(Boolean coilingParalelo) {
		this.coilingParalelo = coilingParalelo;
	}

	/**
	 * @param coilingMalla the coilingMalla to set
	 */
	public void setCoilingMalla(Boolean coilingMalla) {
		this.coilingMalla = coilingMalla;
	}

	/**
	 * @param noCoiling the noCoiling to set
	 */
	public void setNoCoiling(Boolean noCoiling) {
		this.noCoiling = noCoiling;
	}

	/**
	 * @param mantenimientoPosicionCoils the mantenimientoPosicionCoils to set
	 */
	public void setMantenimientoPosicionCoils(String mantenimientoPosicionCoils) {
		this.mantenimientoPosicionCoils = mantenimientoPosicionCoils;
	}

	/**
	 * @param adecuacionPared the adecuacionPared to set
	 */
	public void setAdecuacionPared(String adecuacionPared) {
		this.adecuacionPared = adecuacionPared;
	}

	/**
	 * @param acortamientoStent the acortamientoStent to set
	 */
	public void setAcortamientoStent(Boolean acortamientoStent) {
		this.acortamientoStent = acortamientoStent;
	}

	/**
	 * @param complicaciones the complicaciones to set
	 */
	public void setComplicaciones(Boolean complicaciones) {
		this.complicaciones = complicaciones;
	}

	/**
	 * @param fracasoCateter the fracasoCateter to set
	 */
	public void setFracasoCateter(Boolean fracasoCateter) {
		this.fracasoCateter = fracasoCateter;
	}

	/**
	 * @param malaPosicionStent the malaPosicionStent to set
	 */
	public void setMalaPosicionStent(Boolean malaPosicionStent) {
		this.malaPosicionStent = malaPosicionStent;
	}

	/**
	 * @param migracionStent the migracionStent to set
	 */
	public void setMigracionStent(Boolean migracionStent) {
		this.migracionStent = migracionStent;
	}

	/**
	 * @param malaLiberacionStent the malaLiberacionStent to set
	 */
	public void setMalaLiberacionStent(Boolean malaLiberacionStent) {
		this.malaLiberacionStent = malaLiberacionStent;
	}

	/**
	 * @param complicacionesOtrosDispositivos the complicacionesOtrosDispositivos to set
	 */
	public void setComplicacionesOtrosDispositivos(
			Boolean complicacionesOtrosDispositivos) {
		this.complicacionesOtrosDispositivos = complicacionesOtrosDispositivos;
	}

	/**
	 * @param estadoProcedimiento the estadoProcedimiento to set
	 */
	public void setEstadoProcedimiento(String estadoProcedimiento) {
		this.estadoProcedimiento = estadoProcedimiento;
	}

	/**
	 * @param resultadoAngiograficoFinal the resultadoAngiograficoFinal to set
	 */
	public void setResultadoAngiograficoFinal(String resultadoAngiograficoFinal) {
		this.resultadoAngiograficoFinal = resultadoAngiograficoFinal;
	}

	/**
	 * @param agravadoProcedimiento the agravadoProcedimiento to set
	 */
	public void setAgravadoProcedimiento(Boolean agravadoProcedimiento) {
		this.agravadoProcedimiento = agravadoProcedimiento;
	}

	/**
	 * @param complicacionesTrombosis the complicacionesTrombosis to set
	 */
	public void setComplicacionesTrombosis(Boolean complicacionesTrombosis) {
		this.complicacionesTrombosis = complicacionesTrombosis;
	}

	/**
	 * @param rankingPost the rankingPost to set
	 */
	public void setRankingPost(Integer rankingPost) {
		this.rankingPost = rankingPost;
	}

	/**
	 * @param trombosis the trombosis to set
	 */
	public void setTrombosis(Boolean trombosis) {
		this.trombosis = trombosis;
	}

	/**
	 * @param glasgowPost the glasgowPost to set
	 */
	public void setGlasgowPost(Integer glasgowPost) {
		this.glasgowPost = glasgowPost;
	}

	/**
	 * @param complicacionesCoilsCheck the complicacionesCoilsCheck to set
	 */
	public void setComplicacionesCoilsCheck(Boolean complicacionesCoilsCheck) {
		this.complicacionesCoilsCheck = complicacionesCoilsCheck;
	}

	/**
	 * @param complicacionesCoils the complicacionesCoils to set
	 */
	public void setComplicacionesCoils(String complicacionesCoils) {
		this.complicacionesCoils = complicacionesCoils;
	}

	/**
	 * @param complicacionesOtrosCheck the complicacionesOtrosCheck to set
	 */
	public void setComplicacionesOtrosCheck(Boolean complicacionesOtrosCheck) {
		this.complicacionesOtrosCheck = complicacionesOtrosCheck;
	}

	/**
	 * @param complicacionesOtros the complicacionesOtros to set
	 */
	public void setComplicacionesOtros(String complicacionesOtros) {
		this.complicacionesOtros = complicacionesOtros;
	}

	/**
	 * @param descComplicacionOtros the descComplicacionOtros to set
	 */
	public void setDescComplicacionOtros(String descComplicacionOtros) {
		this.descComplicacionOtros = descComplicacionOtros;
	}

	/**
	 * @param hemorragiaProcedimiento the hemorragiaProcedimiento to set
	 */
	public void setHemorragiaProcedimiento(Boolean hemorragiaProcedimiento) {
		this.hemorragiaProcedimiento = hemorragiaProcedimiento;
	}

	/**
	 * @param espasmoVascular the espasmoVascular to set
	 */
	public void setEspasmoVascular(Boolean espasmoVascular) {
		this.espasmoVascular = espasmoVascular;
	}

	/**
	 * @param hemorragiaPostProcedimiento the hemorragiaPostProcedimiento to set
	 */
	public void setHemorragiaPostProcedimiento(Boolean hemorragiaPostProcedimiento) {
		this.hemorragiaPostProcedimiento = hemorragiaPostProcedimiento;
	}

	/**
	 * @param trombosisParcialTotal the trombosisParcialTotal to set
	 */
	public void setTrombosisParcialTotal(Boolean trombosisParcialTotal) {
		this.trombosisParcialTotal = trombosisParcialTotal;
	}

	/**
	 * @param complicacionesClinicas the complicacionesClinicas to set
	 */
	public void setComplicacionesClinicas(Boolean complicacionesClinicas) {
		this.complicacionesClinicas = complicacionesClinicas;
	}

	/**
	 * @param mantPostCoils the mantPostCoils to set
	 */
	public void setMantPostCoils(Boolean mantPostCoils) {
		this.mantPostCoils = mantPostCoils;
	}

	/**
	 * @param tipoParalisisNervios the tipoParalisisNervios to set
	 */
	public void setTipoParalisisNervios(String tipoParalisisNervios) {
		this.tipoParalisisNervios = tipoParalisisNervios;
	}

	/**
	 * @param trosEstadosPrevios the trosEstadosPrevios to set
	 */
	public void setTrosEstadosPrevios(String trosEstadosPrevios) {
		this.trosEstadosPrevios = trosEstadosPrevios;
	}

	/**
	 * @param estadoNeuroOtros the estadoNeuroOtros to set
	 */
	public void setEstadoNeuroOtros(String estadoNeuroOtros) {
		this.estadoNeuroOtros = estadoNeuroOtros;
	}

	/**
	 * @param aneurisma the aneurisma to set
	 */
	public void setAneurisma(Aneurisma aneurisma) {
		this.aneurisma = aneurisma;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((acortamientoStent == null) ? 0 : acortamientoStent
						.hashCode());
		result = prime * result
				+ ((adaptacionStent == null) ? 0 : adaptacionStent.hashCode());
		result = prime * result
				+ ((adecuacionPared == null) ? 0 : adecuacionPared.hashCode());
		result = prime
				* result
				+ ((agravadoProcedimiento == null) ? 0 : agravadoProcedimiento
						.hashCode());
		result = prime * result
				+ ((aneurisma == null) ? 0 : aneurisma.hashCode());
		result = prime * result
				+ ((coilActivo == null) ? 0 : coilActivo.hashCode());
		result = prime * result
				+ ((coilNoActivo == null) ? 0 : coilNoActivo.hashCode());
		result = prime * result
				+ ((coilingMalla == null) ? 0 : coilingMalla.hashCode());
		result = prime * result
				+ ((coilingParalelo == null) ? 0 : coilingParalelo.hashCode());
		result = prime
				* result
				+ ((coilsActivosCheck == null) ? 0 : coilsActivosCheck
						.hashCode());
		result = prime
				* result
				+ ((coilsNoActivosCheck == null) ? 0 : coilsNoActivosCheck
						.hashCode());
		result = prime
				* result
				+ ((completaCobertura == null) ? 0 : completaCobertura
						.hashCode());
		result = prime * result
				+ ((complicaciones == null) ? 0 : complicaciones.hashCode());
		result = prime
				* result
				+ ((complicacionesClinicas == null) ? 0
						: complicacionesClinicas.hashCode());
		result = prime
				* result
				+ ((complicacionesCoils == null) ? 0 : complicacionesCoils
						.hashCode());
		result = prime
				* result
				+ ((complicacionesCoilsCheck == null) ? 0
						: complicacionesCoilsCheck.hashCode());
		result = prime
				* result
				+ ((complicacionesOtros == null) ? 0 : complicacionesOtros
						.hashCode());
		result = prime
				* result
				+ ((complicacionesOtrosCheck == null) ? 0
						: complicacionesOtrosCheck.hashCode());
		result = prime
				* result
				+ ((complicacionesOtrosDispositivos == null) ? 0
						: complicacionesOtrosDispositivos.hashCode());
		result = prime
				* result
				+ ((complicacionesTrombosis == null) ? 0
						: complicacionesTrombosis.hashCode());
		result = prime
				* result
				+ ((descComplicacionOtros == null) ? 0 : descComplicacionOtros
						.hashCode());
		result = prime
				* result
				+ ((dispositivoEmbolizacion == null) ? 0
						: dispositivoEmbolizacion.hashCode());
		result = prime * result
				+ ((espasmoVascular == null) ? 0 : espasmoVascular.hashCode());
		result = prime
				* result
				+ ((estadoNeuroOtros == null) ? 0 : estadoNeuroOtros.hashCode());
		result = prime
				* result
				+ ((estadoProcedimiento == null) ? 0 : estadoProcedimiento
						.hashCode());
		result = prime
				* result
				+ ((fechaProcedimiento == null) ? 0 : fechaProcedimiento
						.hashCode());
		result = prime * result
				+ ((fracasoCateter == null) ? 0 : fracasoCateter.hashCode());
		result = prime * result
				+ ((glasgowPost == null) ? 0 : glasgowPost.hashCode());
		result = prime * result + ((guia == null) ? 0 : guia.hashCode());
		result = prime
				* result
				+ ((hemorragiaPostProcedimiento == null) ? 0
						: hemorragiaPostProcedimiento.hashCode());
		result = prime
				* result
				+ ((hemorragiaProcedimiento == null) ? 0
						: hemorragiaProcedimiento.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((introductor == null) ? 0 : introductor.hashCode());
		result = prime * result
				+ ((leoPlusStent == null) ? 0 : leoPlusStent.hashCode());
		result = prime * result
				+ ((leoStent == null) ? 0 : leoStent.hashCode());
		result = prime * result
				+ ((liberacionStent == null) ? 0 : liberacionStent.hashCode());
		result = prime * result
				+ ((localizacion == null) ? 0 : localizacion.hashCode());
		result = prime
				* result
				+ ((localizacionEstable == null) ? 0 : localizacionEstable
						.hashCode());
		result = prime
				* result
				+ ((malaLiberacionStent == null) ? 0 : malaLiberacionStent
						.hashCode());
		result = prime
				* result
				+ ((malaPosicionStent == null) ? 0 : malaPosicionStent
						.hashCode());
		result = prime * result
				+ ((mantPostCoils == null) ? 0 : mantPostCoils.hashCode());
		result = prime
				* result
				+ ((mantenimientoPosicionCoils == null) ? 0
						: mantenimientoPosicionCoils.hashCode());
		result = prime * result
				+ ((materialOtros == null) ? 0 : materialOtros.hashCode());
		result = prime
				* result
				+ ((microguiasTerumo == null) ? 0 : microguiasTerumo.hashCode());
		result = prime * result
				+ ((migracionStent == null) ? 0 : migracionStent.hashCode());
		result = prime
				* result
				+ ((navegabilidadCateter == null) ? 0 : navegabilidadCateter
						.hashCode());
		result = prime
				* result
				+ ((navegabilidadStent == null) ? 0 : navegabilidadStent
						.hashCode());
		result = prime * result
				+ ((neuroformStent == null) ? 0 : neuroformStent.hashCode());
		result = prime * result
				+ ((noCoiling == null) ? 0 : noCoiling.hashCode());
		result = prime * result
				+ ((otrosCheck == null) ? 0 : otrosCheck.hashCode());
		result = prime * result
				+ ((portador == null) ? 0 : portador.hashCode());
		result = prime * result
				+ ((rankingPost == null) ? 0 : rankingPost.hashCode());
		result = prime
				* result
				+ ((resultadoAngiograficoFinal == null) ? 0
						: resultadoAngiograficoFinal.hashCode());
		result = prime
				* result
				+ ((sistemaIntroduccion == null) ? 0 : sistemaIntroduccion
						.hashCode());
		result = prime
				* result
				+ ((tipoParalisisNervios == null) ? 0 : tipoParalisisNervios
						.hashCode());
		result = prime * result
				+ ((tipoStent == null) ? 0 : tipoStent.hashCode());
		result = prime * result
				+ ((trombosis == null) ? 0 : trombosis.hashCode());
		result = prime
				* result
				+ ((trombosisParcialTotal == null) ? 0 : trombosisParcialTotal
						.hashCode());
		result = prime
				* result
				+ ((trosEstadosPrevios == null) ? 0 : trosEstadosPrevios
						.hashCode());
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
		final Procedimiento other = (Procedimiento) obj;
		if (acortamientoStent == null) {
			if (other.acortamientoStent != null)
				return false;
		} else if (!acortamientoStent.equals(other.acortamientoStent))
			return false;
		if (adaptacionStent == null) {
			if (other.adaptacionStent != null)
				return false;
		} else if (!adaptacionStent.equals(other.adaptacionStent))
			return false;
		if (adecuacionPared == null) {
			if (other.adecuacionPared != null)
				return false;
		} else if (!adecuacionPared.equals(other.adecuacionPared))
			return false;
		if (agravadoProcedimiento == null) {
			if (other.agravadoProcedimiento != null)
				return false;
		} else if (!agravadoProcedimiento.equals(other.agravadoProcedimiento))
			return false;
		if (aneurisma == null) {
			if (other.aneurisma != null)
				return false;
		} else if (!aneurisma.equals(other.aneurisma))
			return false;
		if (coilActivo == null) {
			if (other.coilActivo != null)
				return false;
		} else if (!coilActivo.equals(other.coilActivo))
			return false;
		if (coilNoActivo == null) {
			if (other.coilNoActivo != null)
				return false;
		} else if (!coilNoActivo.equals(other.coilNoActivo))
			return false;
		if (coilingMalla == null) {
			if (other.coilingMalla != null)
				return false;
		} else if (!coilingMalla.equals(other.coilingMalla))
			return false;
		if (coilingParalelo == null) {
			if (other.coilingParalelo != null)
				return false;
		} else if (!coilingParalelo.equals(other.coilingParalelo))
			return false;
		if (coilsActivosCheck == null) {
			if (other.coilsActivosCheck != null)
				return false;
		} else if (!coilsActivosCheck.equals(other.coilsActivosCheck))
			return false;
		if (coilsNoActivosCheck == null) {
			if (other.coilsNoActivosCheck != null)
				return false;
		} else if (!coilsNoActivosCheck.equals(other.coilsNoActivosCheck))
			return false;
		if (completaCobertura == null) {
			if (other.completaCobertura != null)
				return false;
		} else if (!completaCobertura.equals(other.completaCobertura))
			return false;
		if (complicaciones == null) {
			if (other.complicaciones != null)
				return false;
		} else if (!complicaciones.equals(other.complicaciones))
			return false;
		if (complicacionesClinicas == null) {
			if (other.complicacionesClinicas != null)
				return false;
		} else if (!complicacionesClinicas.equals(other.complicacionesClinicas))
			return false;
		if (complicacionesCoils == null) {
			if (other.complicacionesCoils != null)
				return false;
		} else if (!complicacionesCoils.equals(other.complicacionesCoils))
			return false;
		if (complicacionesCoilsCheck == null) {
			if (other.complicacionesCoilsCheck != null)
				return false;
		} else if (!complicacionesCoilsCheck
				.equals(other.complicacionesCoilsCheck))
			return false;
		if (complicacionesOtros == null) {
			if (other.complicacionesOtros != null)
				return false;
		} else if (!complicacionesOtros.equals(other.complicacionesOtros))
			return false;
		if (complicacionesOtrosCheck == null) {
			if (other.complicacionesOtrosCheck != null)
				return false;
		} else if (!complicacionesOtrosCheck
				.equals(other.complicacionesOtrosCheck))
			return false;
		if (complicacionesOtrosDispositivos == null) {
			if (other.complicacionesOtrosDispositivos != null)
				return false;
		} else if (!complicacionesOtrosDispositivos
				.equals(other.complicacionesOtrosDispositivos))
			return false;
		if (complicacionesTrombosis == null) {
			if (other.complicacionesTrombosis != null)
				return false;
		} else if (!complicacionesTrombosis
				.equals(other.complicacionesTrombosis))
			return false;
		if (descComplicacionOtros == null) {
			if (other.descComplicacionOtros != null)
				return false;
		} else if (!descComplicacionOtros.equals(other.descComplicacionOtros))
			return false;
		if (dispositivoEmbolizacion == null) {
			if (other.dispositivoEmbolizacion != null)
				return false;
		} else if (!dispositivoEmbolizacion
				.equals(other.dispositivoEmbolizacion))
			return false;
		if (espasmoVascular == null) {
			if (other.espasmoVascular != null)
				return false;
		} else if (!espasmoVascular.equals(other.espasmoVascular))
			return false;
		if (estadoNeuroOtros == null) {
			if (other.estadoNeuroOtros != null)
				return false;
		} else if (!estadoNeuroOtros.equals(other.estadoNeuroOtros))
			return false;
		if (estadoProcedimiento == null) {
			if (other.estadoProcedimiento != null)
				return false;
		} else if (!estadoProcedimiento.equals(other.estadoProcedimiento))
			return false;
		if (fechaProcedimiento == null) {
			if (other.fechaProcedimiento != null)
				return false;
		} else if (!fechaProcedimiento.equals(other.fechaProcedimiento))
			return false;
		if (fracasoCateter == null) {
			if (other.fracasoCateter != null)
				return false;
		} else if (!fracasoCateter.equals(other.fracasoCateter))
			return false;
		if (glasgowPost == null) {
			if (other.glasgowPost != null)
				return false;
		} else if (!glasgowPost.equals(other.glasgowPost))
			return false;
		if (guia == null) {
			if (other.guia != null)
				return false;
		} else if (!guia.equals(other.guia))
			return false;
		if (hemorragiaPostProcedimiento == null) {
			if (other.hemorragiaPostProcedimiento != null)
				return false;
		} else if (!hemorragiaPostProcedimiento
				.equals(other.hemorragiaPostProcedimiento))
			return false;
		if (hemorragiaProcedimiento == null) {
			if (other.hemorragiaProcedimiento != null)
				return false;
		} else if (!hemorragiaProcedimiento
				.equals(other.hemorragiaProcedimiento))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (introductor == null) {
			if (other.introductor != null)
				return false;
		} else if (!introductor.equals(other.introductor))
			return false;
		if (leoPlusStent == null) {
			if (other.leoPlusStent != null)
				return false;
		} else if (!leoPlusStent.equals(other.leoPlusStent))
			return false;
		if (leoStent == null) {
			if (other.leoStent != null)
				return false;
		} else if (!leoStent.equals(other.leoStent))
			return false;
		if (liberacionStent == null) {
			if (other.liberacionStent != null)
				return false;
		} else if (!liberacionStent.equals(other.liberacionStent))
			return false;
		if (localizacion == null) {
			if (other.localizacion != null)
				return false;
		} else if (!localizacion.equals(other.localizacion))
			return false;
		if (localizacionEstable == null) {
			if (other.localizacionEstable != null)
				return false;
		} else if (!localizacionEstable.equals(other.localizacionEstable))
			return false;
		if (malaLiberacionStent == null) {
			if (other.malaLiberacionStent != null)
				return false;
		} else if (!malaLiberacionStent.equals(other.malaLiberacionStent))
			return false;
		if (malaPosicionStent == null) {
			if (other.malaPosicionStent != null)
				return false;
		} else if (!malaPosicionStent.equals(other.malaPosicionStent))
			return false;
		if (mantPostCoils == null) {
			if (other.mantPostCoils != null)
				return false;
		} else if (!mantPostCoils.equals(other.mantPostCoils))
			return false;
		if (mantenimientoPosicionCoils == null) {
			if (other.mantenimientoPosicionCoils != null)
				return false;
		} else if (!mantenimientoPosicionCoils
				.equals(other.mantenimientoPosicionCoils))
			return false;
		if (materialOtros == null) {
			if (other.materialOtros != null)
				return false;
		} else if (!materialOtros.equals(other.materialOtros))
			return false;
		if (microguiasTerumo == null) {
			if (other.microguiasTerumo != null)
				return false;
		} else if (!microguiasTerumo.equals(other.microguiasTerumo))
			return false;
		if (migracionStent == null) {
			if (other.migracionStent != null)
				return false;
		} else if (!migracionStent.equals(other.migracionStent))
			return false;
		if (navegabilidadCateter == null) {
			if (other.navegabilidadCateter != null)
				return false;
		} else if (!navegabilidadCateter.equals(other.navegabilidadCateter))
			return false;
		if (navegabilidadStent == null) {
			if (other.navegabilidadStent != null)
				return false;
		} else if (!navegabilidadStent.equals(other.navegabilidadStent))
			return false;
		if (neuroformStent == null) {
			if (other.neuroformStent != null)
				return false;
		} else if (!neuroformStent.equals(other.neuroformStent))
			return false;
		if (noCoiling == null) {
			if (other.noCoiling != null)
				return false;
		} else if (!noCoiling.equals(other.noCoiling))
			return false;
		if (otrosCheck == null) {
			if (other.otrosCheck != null)
				return false;
		} else if (!otrosCheck.equals(other.otrosCheck))
			return false;
		if (portador == null) {
			if (other.portador != null)
				return false;
		} else if (!portador.equals(other.portador))
			return false;
		if (rankingPost == null) {
			if (other.rankingPost != null)
				return false;
		} else if (!rankingPost.equals(other.rankingPost))
			return false;
		if (resultadoAngiograficoFinal == null) {
			if (other.resultadoAngiograficoFinal != null)
				return false;
		} else if (!resultadoAngiograficoFinal
				.equals(other.resultadoAngiograficoFinal))
			return false;
		if (sistemaIntroduccion == null) {
			if (other.sistemaIntroduccion != null)
				return false;
		} else if (!sistemaIntroduccion.equals(other.sistemaIntroduccion))
			return false;
		if (tipoParalisisNervios == null) {
			if (other.tipoParalisisNervios != null)
				return false;
		} else if (!tipoParalisisNervios.equals(other.tipoParalisisNervios))
			return false;
		if (tipoStent == null) {
			if (other.tipoStent != null)
				return false;
		} else if (!tipoStent.equals(other.tipoStent))
			return false;
		if (trombosis == null) {
			if (other.trombosis != null)
				return false;
		} else if (!trombosis.equals(other.trombosis))
			return false;
		if (trombosisParcialTotal == null) {
			if (other.trombosisParcialTotal != null)
				return false;
		} else if (!trombosisParcialTotal.equals(other.trombosisParcialTotal))
			return false;
		if (trosEstadosPrevios == null) {
			if (other.trosEstadosPrevios != null)
				return false;
		} else if (!trosEstadosPrevios.equals(other.trosEstadosPrevios))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see com.stentstudio.model.PersistentObject#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the microguiasTerumoSelect
	 */
	public String getMicroguiasTerumoSelect() {
		return (microguiasTerumo != null)?microguiasTerumo.getValue().toString():"";
	}

	/**
	 * @param microguiasTerumoSelect the microguiasTerumoSelect to set
	 */
	public void setMicroguiasTerumoSelect(String microguiasTerumoSelect) {
		this.microguiasTerumoSelect = microguiasTerumoSelect;
	}

	/**
	 * @return the dispositivoEmbolizacionSelect
	 */
	public String getDispositivoEmbolizacionSelect() {
		return (dispositivoEmbolizacion != null)?dispositivoEmbolizacion.getValue().toString():"";
	}

	/**
	 * @param dispositivoEmbolizacionSelect the dispositivoEmbolizacionSelect to set
	 */
	public void setDispositivoEmbolizacionSelect(
			String dispositivoEmbolizacionSelect) {
		this.dispositivoEmbolizacionSelect = dispositivoEmbolizacionSelect;
	}

	/**
	 * @return the leoStentSelect
	 */
	public String[] getLeoStentSelect() {
		if(leoStent == null) return new String[0];
		String[] result = new String[leoStent.size()];
		int i = 0;
		for (Iterator iterator = leoStent.iterator(); iterator.hasNext();) {
			LeoStent leoStent = (LeoStent) iterator.next();
			result[i++] = leoStent.getValue().toString();
		}
		return result;
	}

	/**
	 * @param leoStentSelect the leoStentSelect to set
	 */
	public void setLeoStentSelect(
			String[] leoStentSelect) {
		this.leoStentSelect = leoStentSelect;
	}
	
	/**
	 * @return the leoPlusStentSelect
	 */
	public String[] getLeoPlusStentSelect() {
		if(leoPlusStent == null) return new String[0];
		String[] result = new String[leoPlusStent.size()];
		int i = 0;
		for (Iterator iterator = leoPlusStent.iterator(); iterator.hasNext();) {
			LeoPlusStent leoPlusStent = (LeoPlusStent) iterator.next();
			result[i++] = leoPlusStent.getValue().toString();
		}
		return result;
	}

	/**
	 * @param leoStentSelect the leoStentSelect to set
	 */
	public void setLeoPlusStentSelect(
			String[] leoPlusStentSelect) {
		this.leoPlusStentSelect = leoPlusStentSelect;
	}
	
	/**
	 * @return the neuroformStentSelect
	 */
	public String[] getNeuroformStentSelect() {
		if(neuroformStent == null) return new String[0];
		String[] result = new String[neuroformStent.size()];
		int i = 0;
		for (Iterator iterator = neuroformStent.iterator(); iterator.hasNext();) {
			NeuroformStent neuroformStent = (NeuroformStent) iterator.next();
			result[i++] = neuroformStent.getValue().toString();
		}
		return result;
	}

	/**
	 * @param leoStentSelect the leoStentSelect to set
	 */
	public void setNeuroformStentSelect(
			String[] neuroformStentSelect) {
		this.neuroformStentSelect = neuroformStentSelect;
	}
	
	/**
	 * @return the coilNoActivoSelect
	 */
	public String[] getCoilNoActivoSelect() {
		if(coilNoActivo == null) return new String[0];
		String[] result = new String[coilNoActivo.size()];
		int i = 0;
		for (Iterator iterator = coilNoActivo.iterator(); iterator.hasNext();) {
			CoilNoActivo coilNoActivo = (CoilNoActivo) iterator.next();
			result[i++] = coilNoActivo.getValue().toString();
		}
		return result;
	}

	/**
	 * @param coilNoActivo the coilNoActivo to set
	 */
	public void setCoilNoActivoSelect(
			String[] coilNoActivoSelect) {
		this.coilNoActivoSelect = coilNoActivoSelect;
	}
	
	/**
	 * @return the coilActivoSelect
	 */
	public String[] getCoilActivoSelect() {
		if(coilActivo == null) return new String[0];
		String[] result = new String[coilActivo.size()];
		int i = 0;
		for (Iterator iterator = coilActivo.iterator(); iterator.hasNext();) {
			CoilActivo coilActivo = (CoilActivo) iterator.next();
			result[i++] = coilActivo.getValue().toString();
		}
		return result;
	}

	/**
	 * @param coilActivo the coilActivo to set
	 */
	public void setCoilActivoSelect(
			String[] coilActivoSelect) {
		this.coilActivoSelect = coilActivoSelect;
	}

	/**
	 * @return the dwiPost
	 */
	public Boolean getDwiPost() {
		return dwiPost;
	}

	/**
	 * @return the dwiPre
	 */
	public Boolean getDwiPre() {
		return dwiPre;
	}

	/**
	 * @return the hallazgosDwiPost
	 */
	public String getHallazgosDwiPost() {
		return hallazgosDwiPost;
	}

	/**
	 * @return the hallazgosDwiPre
	 */
	public String getHallazgosDwiPre() {
		return hallazgosDwiPre;
	}

	/**
	 * @param dwiPost the dwiPost to set
	 */
	public void setDwiPost(Boolean dwiPost) {
		this.dwiPost = dwiPost;
	}

	/**
	 * @param dwiPre the dwiPre to set
	 */
	public void setDwiPre(Boolean dwiPre) {
		this.dwiPre = dwiPre;
	}

	/**
	 * @param hallazgosDwiPost the hallazgosDwiPost to set
	 */
	public void setHallazgosDwiPost(String hallazgosDwiPost) {
		this.hallazgosDwiPost = hallazgosDwiPost;
	}

	/**
	 * @param hallazgosDwiPre the hallazgosDwiPre to set
	 */
	public void setHallazgosDwiPre(String hallazgosDwiPre) {
		this.hallazgosDwiPre = hallazgosDwiPre;
	}

	/**
	 * @return the anticoagulanteDurante
	 */
	public Boolean getAnticoagulanteDurante() {
		return anticoagulanteDurante;
	}

	/**
	 * @return the anticoagulantePost
	 */
	public Boolean getAnticoagulantePost() {
		return anticoagulantePost;
	}

	/**
	 * @return the aspirinaDurante
	 */
	public Boolean getAspirinaDurante() {
		return aspirinaDurante;
	}

	/**
	 * @return the clopidogrelDurante
	 */
	public Boolean getClopidogrelDurante() {
		return clopidogrelDurante;
	}

	/**
	 * @return the clopidogrelPre
	 */
	public Boolean getClopidogrelPre() {
		return clopidogrelPre;
	}

	/**
	 * @return the heparinaDurante
	 */
	public Boolean getHeparinaDurante() {
		return heparinaDurante;
	}

	/**
	 * @return the plavixPre
	 */
	public Boolean getPlavixPre() {
		return plavixPre;
	}

	/**
	 * @param anticoagulanteDurante the anticoagulanteDurante to set
	 */
	public void setAnticoagulanteDurante(Boolean anticoagulanteDurante) {
		this.anticoagulanteDurante = anticoagulanteDurante;
	}

	/**
	 * @param anticoagulantePost the anticoagulantePost to set
	 */
	public void setAnticoagulantePost(Boolean anticoagulantePost) {
		this.anticoagulantePost = anticoagulantePost;
	}

	/**
	 * @param aspirinaDurante the aspirinaDurante to set
	 */
	public void setAspirinaDurante(Boolean aspirinaDurante) {
		this.aspirinaDurante = aspirinaDurante;
	}

	/**
	 * @param clopidogrelDurante the clopidogrelDurante to set
	 */
	public void setClopidogrelDurante(Boolean clopidrogelDurante) {
		this.clopidogrelDurante = clopidrogelDurante;
	}

	/**
	 * @param clopidogrelPre the clopidogrelPre to set
	 */
	public void setClopidogrelPre(Boolean clopidrogelPre) {
		this.clopidogrelPre = clopidrogelPre;
	}

	/**
	 * @param heparinaDurante the heparinaDurante to set
	 */
	public void setHeparinaDurante(Boolean heparinaDurante) {
		this.heparinaDurante = heparinaDurante;
	}

	/**
	 * @param plavixPre the plavixPre to set
	 */
	public void setPlavixPre(Boolean plavixPre) {
		this.plavixPre = plavixPre;
	}

	/**
	 * @return the revisiones
	 */
	public List<Revision> getRevisiones() {
		return revisiones;
	}

	/**
	 * @param revisiones the revisiones to set
	 */
	public void setRevisiones(List<Revision> revisiones) {
		this.revisiones = revisiones;
	}

	
}
