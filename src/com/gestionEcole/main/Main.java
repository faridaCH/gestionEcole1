/**
 * 
 */
package com.gestionEcole.main;

import com.gestionEcole.formation.CentreFormation;

/**
 * @author DESGOUILLES Pierre
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CentreFormation centreFormation = new CentreFormation();

		String nom = centreFormation.getNom();

		System.out.println(centreFormation);
	}

}
