package domaine.base;

import java.io.Serializable;

import domaine.Grppers;
import domaine.Personnes;


/**
 * This is an object that contains data related to the personnes table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="personnes"
 */

public abstract class BaseEntreprises  implements Serializable {

	public static String REF = "Entreprises";
	public static String PROP_IDENTREPRISE = "idEntreprise";
	public static String PROP_NOMENT = "NomEnt";
	public static String PROP_LISTEACTIVITES = "ListeActivites";
	public static String PROP_NBEMPLOYES = "NbEmployes";
	


	// constructors
	public BaseEntreprises () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseEntreprises (java.lang.Integer id) {
		this.setidEntreprise(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer idEntreprise;

	// fields
	private java.lang.String nomEnt;
	private java.lang.String listeActivites;
	private java.lang.Integer nbEmployes;






	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.TableHiLoGenerator"
     *  column="idpersonne"
     */
	public java.lang.Integer getidEntreprise () {
		return idEntreprise;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setidEntreprise (java.lang.Integer id) {
		this.idEntreprise = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: nompersonne
	 */
	public java.lang.String getNomEnt () {
		return nomEnt;
	}

	/**
	 * Set the value related to the column: nompersonne
	 * @param nompersonne the nompersonne value
	 */
	public void setNomEnt (java.lang.String nompersonne) {
		this.nomEnt = nompersonne;
	}



	/**
	 * Return the value associated with the column: prenompersonne
	 */
	public java.lang.String getListeActivites () {
		return listeActivites;
	}

	/**
	 * Set the value related to the column: prenompersonne
	 * @param prenompersonne the prenompersonne value
	 */
	public void setListeActivites (java.lang.String prenompersonne) {
		this.listeActivites = prenompersonne;
	}

	/**
	 * Return the value associated with the column: coeffpersonne
	 */
	public java.lang.Integer getNbEmployes () {
		return nbEmployes;
	}

	/**
	 * Set the value related to the column: coeffpersonne
	 * @param coeffpersonne the coeffpersonne value
	 */
	public void setNbEmployes (java.lang.Integer coeffpersonne) {
		this.nbEmployes = coeffpersonne;
	}


	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof domaine.Personnes)) return false;
		else {
			domaine.Personnes personnes = (domaine.Personnes) obj;
			if (null == this.getidEntreprise() || null == personnes.getId()) return false;
			else return (this.getidEntreprise().equals(personnes.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getidEntreprise()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getidEntreprise().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}