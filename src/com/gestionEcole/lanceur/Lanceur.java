/**
 * 
 */
package com.gestionEcole.lanceur;

import com.gestionEcole.personne.Etudiant;
import com.gestionEcole.personne.Formateur;
import com.gestionEcole.personne.Personne;

/**
 * @author chelh
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Personne etudiant = new Etudiant();
		Personne formateur = new Formateur();

		((Etudiant) etudiant).sePresenterAuCours();
		((Formateur) formateur).sePresenterAuCours();
	}

}
