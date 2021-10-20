/**
 * 
 */
package com.gestionEcole.personne;

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
	private List<ModuleFormation> modules;
	private TypeFormateur typeFormateur;

	/**
	 * 
	 */
	public Formateur() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sePresenterAuCours() {
		System.out.println(" presenter le cours");

	}

}
