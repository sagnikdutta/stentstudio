package com.stentstudio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ImagenAneurisma extends PersistentObject {


    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long id;
    
    @Column(name="content",columnDefinition="image") /** longblob para mysql e image para sql server  **/
	private byte[] content;
    
    @Column(name="content_type",length=64)
	private String contentType;
    
    @Column(name="descripcion",length=512)
	private String descripcion;
 
	@ManyToOne
	@JoinColumn(name = "aneurisma_id")
	private Aneurisma aneurisma = new Aneurisma();


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
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the content
	 */
	public byte[] getContent() {
		return content;
	}

	/**
	 * @return the contentType
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
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
	 * @param content the content to set
	 */
	public void setContent(byte[] content) {
		this.content = content;
	}

	/**
	 * @param contentType the contentType to set
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @param aneurisma the aneurisma to set
	 */
	public void setAneurisma(Aneurisma aneurisma) {
		this.aneurisma = aneurisma;
	}

}
