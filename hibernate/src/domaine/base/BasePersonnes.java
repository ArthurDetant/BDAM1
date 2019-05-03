package domaine.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the personnes table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="personnes"
 */

public abstract class BasePersonnes  implements Serializable {

	public static String REF = "Personnes";
	public static String PROP_DATENAISSPERSONNE = "Datenaisspersonne";
	public static String PROP_PRENOMPERSONNE = "Prenompersonne";
	public static String PROP_NOMPERSONNE = "Nompersonne";
	public static String PROP_ID = "Id";
	public static String PROP_COEFFPERSONNE = "Coeffpersonne";


	// constructors
	public BasePersonnes () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BasePersonnes (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String nompersonne;
	private java.lang.String prenompersonne;
	private java.util.Date datenaisspersonne;
	private java.lang.Integer coeffpersonne;

	// collections
	private java.util.Set<domaine.Grppers> grppers;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.TableHiLoGenerator"
     *  column="idpersonne"
     */
	public java.lang.Integer getId () {
		return id;
	}

	/**
	 * Set the unique identifier of this class
	 * @param id the new ID
	 */
	public void setId (java.lang.Integer id) {
		this.id = id;
		this.hashCode = Integer.MIN_VALUE;
	}




	/**
	 * Return the value associated with the column: nompersonne
	 */
	public java.lang.String getNompersonne () {
		return nompersonne;
	}

	/**
	 * Set the value related to the column: nompersonne
	 * @param nompersonne the nompersonne value
	 */
	public void setNompersonne (java.lang.String nompersonne) {
		this.nompersonne = nompersonne;
	}



	/**
	 * Return the value associated with the column: prenompersonne
	 */
	public java.lang.String getPrenompersonne () {
		return prenompersonne;
	}

	/**
	 * Set the value related to the column: prenompersonne
	 * @param prenompersonne the prenompersonne value
	 */
	public void setPrenompersonne (java.lang.String prenompersonne) {
		this.prenompersonne = prenompersonne;
	}



	/**
	 * Return the value associated with the column: datenaisspersonne
	 */
	public java.util.Date getDatenaisspersonne () {
		return datenaisspersonne;
	}

	/**
	 * Set the value related to the column: datenaisspersonne
	 * @param datenaisspersonne the datenaisspersonne value
	 */
	public void setDatenaisspersonne (java.util.Date datenaisspersonne) {
		this.datenaisspersonne = datenaisspersonne;
	}



	/**
	 * Return the value associated with the column: coeffpersonne
	 */
	public java.lang.Integer getCoeffpersonne () {
		return coeffpersonne;
	}

	/**
	 * Set the value related to the column: coeffpersonne
	 * @param coeffpersonne the coeffpersonne value
	 */
	public void setCoeffpersonne (java.lang.Integer coeffpersonne) {
		this.coeffpersonne = coeffpersonne;
	}



	/**
	 * Return the value associated with the column: Grppers
	 */
	public java.util.Set<domaine.Grppers> getGrppers () {
		return grppers;
	}

	/**
	 * Set the value related to the column: Grppers
	 * @param grppers the Grppers value
	 */
	public void setGrppers (java.util.Set<domaine.Grppers> grppers) {
		this.grppers = grppers;
	}

	public void addToGrppers (domaine.Grppers grppers) {
		if (null == getGrppers()) setGrppers(new java.util.TreeSet<domaine.Grppers>());
		getGrppers().add(grppers);
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof domaine.Personnes)) return false;
		else {
			domaine.Personnes personnes = (domaine.Personnes) obj;
			if (null == this.getId() || null == personnes.getId()) return false;
			else return (this.getId().equals(personnes.getId()));
		}
	}

	public int hashCode () {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId()) return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}


	public String toString () {
		return super.toString();
	}


}