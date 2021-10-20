/**
 * 
 */
package com.gestionEcole.formation;

import java.util.List;

import com.gestionEcole.personne.Etudiant;
import com.gestionEcole.personne.Formateur;

/**
 * @author chelh
 *
 */
public class Salle {

	private Integer numSalle;
	private Integer nbPlaces;
	private List<Etudiant> etudiants;
	private Formateur formateur;

	/**
	 * @param numSalle
	 * @param nbPlaces
	 * @param etudiants
	 * @param formateur
	 */
	public Salle(Integer numSalle, Integer nbPlaces, List<Etudiant> etudiants, Formateur formateur) {
		super();
		this.numSalle = numSalle;
		this.nbPlaces = nbPlaces;
		this.etudiants = etudiants;
		this.formateur = formateur;
	}

	/**
	 * @return the numSalle
	 */
	public Integer getNumSalle() {
		return numSalle;
	}

	/**
	 * @param numSalle the numSalle to set
	 */
	public void setNumSalle(Integer numSalle) {
		this.numSalle = numSalle;
	}

	/**
	 * @return the nbPlaces
	 */
	public Integer getNbPlaces() {
		return nbPlaces;
	}

	/**
	 * @param nbPlaces the nbPlaces to set
	 */
	public void setNbPlaces(Integer nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	/**
	 * @return the etudiants
	 */
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	/**
	 * @param etudiants the etudiants to set
	 */
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	/**
	 * @return the formateur
	 */
	public Formateur getFormateur() {
		return formateur;
	}

	/**
	 * @param formateur the formateur to set
	 */
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}

}
