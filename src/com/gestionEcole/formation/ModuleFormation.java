/**
 * 
 */
package com.gestionEcole.formation;

import java.time.LocalDate;
import java.util.List;

import com.gestionEcole.personne.Formateur;

/**
 * @author DESGOUILLES Pierre
 *
 */
public class ModuleFormation {
	private String nomModule;
	private String reference;
	private Integer nbJours;
	private LocalDate date;
	private Formateur formateur;
	private List<String> outilsTechniques;

	/**
	 * 
	 */

	public ModuleFormation() {

	}

	/**
	 * @param nomModule
	 * @param reference
	 * @param nbJours
	 * @param date
	 * @param formateur
	 * @param outilsTechniques
	 */
	public ModuleFormation(String nomModule, String reference, Integer nbJours, LocalDate date, Formateur formateur,
			List<String> outilsTechniques) {
		super();
		this.nomModule = nomModule;
		this.reference = reference;
		this.nbJours = nbJours;
		this.date = date;
		this.formateur = formateur;
		this.outilsTechniques = outilsTechniques;
	}

	/**
	 * @return the nomModule
	 */
	public String getNomModule() {
		return nomModule;
	}

	/**
	 * @param nomModule the nomModule to set
	 */
	public void setNomModule(String nomModule) {
		this.nomModule = nomModule;
	}

	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}

	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}

	/**
	 * @return the nbJours
	 */
	public Integer getNbJours() {
		return nbJours;
	}

	/**
	 * @param nbJours the nbJours to set
	 */
	public void setNbJours(Integer nbJours) {
		this.nbJours = nbJours;
	}

	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
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

	/**
	 * @return the outilsTechniques
	 */
	public List<String> getOutilsTechniques() {
		return outilsTechniques;
	}

	/**
	 * @param outilsTechniques the outilsTechniques to set
	 */
	public void setOutilsTechniques(List<String> outilsTechniques) {
		this.outilsTechniques = outilsTechniques;
	}

	@Override
	public String toString() {
		return "ModuleFormation [nomModule=" + nomModule + ", reference=" + reference + ", nbJours=" + nbJours
				+ ", date=" + date + ", formateur=" + formateur + ", outilsTechniques=" + outilsTechniques + "]";
	}

}
