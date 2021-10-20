/**
 * 
 */
package com.gestionEcole.lanceur;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.gestionEcole.commun.TypeFormateur;
import com.gestionEcole.commun.TypeFormation;
import com.gestionEcole.formation.CentreFormation;
import com.gestionEcole.formation.Formation;
import com.gestionEcole.formation.ModuleFormation;
import com.gestionEcole.personne.Formateur;

/**
 * @author chelh
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> outilsTechniques = new ArrayList<String>();

		List<ModuleFormation> moduleFormations = new ArrayList<ModuleFormation>();
		outilsTechniques.add("Eclipse");

		List<Formateur> formateurs = new ArrayList<Formateur>();
		Formation formation = new Formation("fullstack", TypeFormation.Distancielle, LocalDate.of(2021, 9, 20),
				LocalDate.of(2021, 12, 10), moduleFormations, formateurs);
		Formateur formateur = new Formateur(1, "Dupuy", "Bernard", LocalDate.of(1967, 9, 20), formation,
				moduleFormations, TypeFormateur.Externe);
		formateurs.add(formateur);

		ModuleFormation moduleFormation = new ModuleFormation("Java", "f34", 20, LocalDate.of(2021, 9, 20), formateur,
				outilsTechniques);
		moduleFormations.add(moduleFormation);

//		((Etudiant) etudiant).sePresenterAuCours();
		((Formateur) formateur).sePresenterAuCours();
		CentreFormation centreFormation = new CentreFormation();
		List<Formation> formations = new ArrayList<Formation>();
		formations.add(formation);
		centreFormation.setFormations(formations);

		String nom = centreFormation.getNom();

		System.out.println(centreFormation);
	}

}
