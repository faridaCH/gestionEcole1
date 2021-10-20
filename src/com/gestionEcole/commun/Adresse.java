/**
 * 
 */
package com.gestionEcole.commun;

/**
 * @author DESGOUILLES Pierre
 *
 */
public class Adresse {

	private String rue;
	private String ville;
	private Integer codePostale;
	private String pays;

	/**
	 * 
	 */
	public Adresse() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param rue
	 * @param ville
	 * @param codePostale
	 * @param pays
	 */
	public Adresse(String rue, String ville, Integer codePostale, String pays) {
		super();
		this.rue = rue;
		this.ville = ville;
		this.codePostale = codePostale;
		this.pays = pays;
	}

	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	/**
	 * @return the codePostale
	 */
	public Integer getCodePostale() {
		return codePostale;
	}

	/**
	 * @param codePostale the codePostale to set
	 */
	public void setCodePostale(Integer codePostale) {
		this.codePostale = codePostale;
	}

	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}

	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}

	@Override
	public String toString() {
		return rue.toUpperCase() + ", " + codePostale + " - " + ville + ", " + pays;
	}

}
