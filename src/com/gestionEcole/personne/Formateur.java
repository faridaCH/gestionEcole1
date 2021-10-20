/**
 * 
 */
package com.gestionEcole.personne;

import java.time.LocalDate;
import java.util.List;

import com.gestionEcole.commun.TypeFormateur;
import com.gestionEcole.formation.Formation;
import com.gestionEcole.formation.ModuleFormation;

/**
 * @author DESGOUILLES Pierre
 *
 */
public class Formateur extends Personne implements IEtudiantFormateur {
	private Formation formation;
	private static List<ModuleFormation> modules;
	private TypeFormateur typeFormateur;

	/**
	 * 
	 */
	public Formateur() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param formation
	 * @param modules
	 * @param typeFormateur
	 */
	public Formateur(Formation formation, List<ModuleFormation> modules, TypeFormateur typeFormateur) {
		super();
		this.formation = formation;
		this.modules = modules;
		this.typeFormateur = typeFormateur;
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param formation
	 * @param modules
	 * @param typeFormateur
	 */
	public Formateur(Integer id, String nom, String prenom, LocalDate dateNaissance, Formation formation,
			List<ModuleFormation> modules, TypeFormateur typeFormateur) {
		super(id, nom, prenom, dateNaissance);
		this.formation = formation;
		this.modules = modules;
		this.typeFormateur = typeFormateur;
	}

	@Override
	public void sePresenterAuCours() {
		System.out.println(" presenter le cours");

	}

	@Override
	public String toString() {
		return "Formateur [getId()=" + getId() + ", getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getDateNaissance()=" + getDateNaissance() + "]";
	}

}
