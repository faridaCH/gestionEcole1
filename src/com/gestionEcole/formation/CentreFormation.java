/**
 * 
 */
package com.gestionEcole.formation;

import java.util.ArrayList;
import java.util.List;

import com.gestionEcole.commun.Adresse;

/**
 * @author DESGOUILLES Pierre
 *
 */
public class CentreFormation {

	private String nom = "M2iFormation";
	private String siret = "333 544 153 00344";
	private Adresse adresse = new Adresse("146 RUE DE PICPUS", "Paris", 75012, "France");
	private String telephone = "08 91 65 31 57";
	private List<Formation> formations;
	private List<Salle> salles = new ArrayList<Salle>();

	/**
	 * 
	 */
	public CentreFormation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nom
	 * @param siret
	 * @param adresse
	 * @param telephone
	 * @param formations TODO
	 */
	public CentreFormation(String nom, String siret, Adresse adresse, String telephone, List<Formation> formations) {
		super();
		this.nom = nom;
		this.siret = siret;
		this.adresse = adresse;
		this.telephone = telephone;
		this.formations = formations;
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
	 * @return the siret
	 */
	public String getSiret() {
		return siret;
	}

	/**
	 * @param siret the siret to set
	 */
	public void setSiret(String siret) {
		this.siret = siret;
	}

	/**
	 * @return the adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * @param telephone the telephone to set
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	/**
	 * @return the formations
	 */
	public List<Formation> getFormations() {
		return formations;
	}

	/**
	 * @param formations the formations to set
	 */
	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	@Override
	public String toString() {
		return "CentreFormation : " + nom + " \nSIRET : " + siret + "\nAdresse : " + adresse.toString().toUpperCase()
				+ "\nTelephone : " + telephone + "\n Formation : [ \n" + formations + "\n]";
	}

}
