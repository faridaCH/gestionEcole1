/**
 * 
 */
package com.gestionEcole.formation;

import java.time.LocalDate;
import java.util.List;

import com.gestionEcole.commun.TypeFormation;
import com.gestionEcole.personne.Formateur;

/**
 * @author DESGOUILLES Pierre
 *
 */
public class Formation {

	private String titre;
	private TypeFormation typeFormation; // présentielle ou distancielle
	private LocalDate dateDebut;
	private LocalDate dateFin;
	private List<ModuleFormation> modules;
	private List<Formateur> formateurs;

	/**
	 * 
	 */
	public Formation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param titre
	 * @param typeFormation
	 * @param dateDebut
	 * @param dateFin
	 * @param modules
	 * @param formateurs
	 */
	public Formation(String titre, TypeFormation typeFormation, LocalDate dateDebut, LocalDate dateFin,
			List<ModuleFormation> modules, List<Formateur> formateurs) {
		super();
		this.titre = titre;
		this.typeFormation = typeFormation;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.modules = modules;
		this.formateurs = formateurs;
	}

	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**
	 * @return the typeFormation
	 */
	public TypeFormation getTypeFormation() {
		return typeFormation;
	}

	/**
	 * @param typeFormation the typeFormation to set
	 */
	public void setTypeFormation(TypeFormation typeFormation) {
		this.typeFormation = typeFormation;
	}

	/**
	 * @return the dateDebut
	 */
	public LocalDate getDateDebut() {
		return dateDebut;
	}

	/**
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * @return the modules
	 */
	public List<ModuleFormation> getModules() {
		return modules;
	}

	/**
	 * @param modules the modules to set
	 */
	public void setModules(List<ModuleFormation> modules) {
		this.modules = modules;
	}

	/**
	 * @return the formateurs
	 */
	public List<Formateur> getFormateurs() {
		return formateurs;
	}

	/**
	 * @param formateurs the formateurs to set
	 */
	public void setFormateurs(List<Formateur> formateurs) {
		this.formateurs = formateurs;
	}

	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Formation [titre=" + titre + ", typeFormation=" + typeFormation + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + ", modules=" + modules + ", formateurs=" + formateurs + "]";
	}

}
