/**
 * 
 */
package com.gestionEcole.personne;

import java.time.LocalDate;

/**
 * @author DESGOUILLES Pierre
 *
 */
public abstract class Personne {

	private Integer id;
//	private Enum typePersonne;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;

	/**
	 * 
	 */
	public Personne() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 */
	public Personne(Integer id, String nom, String prenom, LocalDate dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

}
