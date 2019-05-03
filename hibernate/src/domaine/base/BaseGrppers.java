package domaine.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the grppers table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="grppers"
 */

public abstract class BaseGrppers  implements Serializable {

	public static String REF = "Grppers";
	public static String PROP_IDPERSONNE = "Idpersonne";
	public static String PROP_ID = "Id";
	public static String PROP_IDGROUPE = "Idgroupe";


	// constructors
	public BaseGrppers () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseGrppers (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// many to one
	private domaine.Groupes idgroupe;
	private domaine.Personnes idpersonne;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.TableHiLoGenerator"
     *  column="idgrppers"
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
	 * Return the value associated with the column: idgroupe
	 */
	public domaine.Groupes getIdgroupe () {
		return idgroupe;
	}

	/**
	 * Set the value related to the column: idgroupe
	 * @param idgroupe the idgroupe value
	 */
	public void setIdgroupe (domaine.Groupes idgroupe) {
		this.idgroupe = idgroupe;
	}



	/**
	 * Return the value associated with the column: idpersonne
	 */
	public domaine.Personnes getIdpersonne () {
		return idpersonne;
	}

	/**
	 * Set the value related to the column: idpersonne
	 * @param idpersonne the idpersonne value
	 */
	public void setIdpersonne (domaine.Personnes idpersonne) {
		this.idpersonne = idpersonne;
	}




	public boolean equals (Object obj) {
		if (null == obj) return false;
		if (!(obj instanceof domaine.Grppers)) return false;
		else {
			domaine.Grppers grppers = (domaine.Grppers) obj;
			if (null == this.getId() || null == grppers.getId()) return false;
			else return (this.getId().equals(grppers.getId()));
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