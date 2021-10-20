/**
 * 
 */
package com.gestionEcole.personne;

import java.time.LocalDate;
import java.util.List;

import com.gestionEcole.commun.Statut;
import com.gestionEcole.commun.TypeParcour;

/**
 * @author DESGOUILLES Pierre
 *
 */
public class Etudiant extends Personne implements IEtudiantFormateur {
	private Statut statut; // alterant, stagiaire ,
	private List<TypeParcour> parcours;
	private String enteprise;

	/**
	 * 
	 */
	public Etudiant() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 * @param statut
	 * @param parcours
	 * @param enteprise
	 */
	public Etudiant(Integer id, String nom, String prenom, LocalDate dateNaissance, Statut statut,
			List<TypeParcour> parcours, String enteprise) {
		super(id, nom, prenom, dateNaissance);
		this.statut = statut;
		this.parcours = parcours;
		this.enteprise = enteprise;
	}

	/**
	 * @return the statut
	 */
	public Statut getStatut() {
		return statut;
	}

	/**
	 * @param statut the statut to set
	 */
	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	/**
	 * @return the parcours
	 */
	public List<TypeParcour> getParcours() {
		return parcours;
	}

	/**
	 * @param parcours the parcours to set
	 */
	public void setParcours(List<TypeParcour> parcours) {
		this.parcours = parcours;
	}

	/**
	 * @return the enteprise
	 */
	public String getEnteprise() {
		return enteprise;
	}

	/**
	 * @param enteprise the enteprise to set
	 */
	public void setEnteprise(String enteprise) {
		this.enteprise = enteprise;
	}

	@Override
	public void sePresenterAuCours() {

		System.out.println(" suivre le cours ");

	}

}
