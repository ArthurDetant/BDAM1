package domaine.base;

import java.io.Serializable;


/**
 * This is an object that contains data related to the groupes table.
 * Do not modify this class because it will be overwritten if the configuration file
 * related to this class is modified.
 *
 * @hibernate.class
 *  table="groupes"
 */

public abstract class BaseGroupes  implements Serializable {

	public static String REF = "Groupes";
	public static String PROP_ID = "Id";
	public static String PROP_COMMENTAIREGROUPE = "Commentairegroupe";
	public static String PROP_NOMGROUPE = "Nomgroupe";


	// constructors
	public BaseGroupes () {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public BaseGroupes (java.lang.Integer id) {
		this.setId(id);
		initialize();
	}

	protected void initialize () {}



	private int hashCode = Integer.MIN_VALUE;

	// primary key
	private java.lang.Integer id;

	// fields
	private java.lang.String nomgroupe;
	private java.lang.String commentairegroupe;

	// collections
	private java.util.Set<domaine.Grppers> grppers;



	/**
	 * Return the unique identifier of this class
     * @hibernate.id
     *  generator-class="org.hibernate.id.TableHiLoGenerator"
     *  column="idgroupe"
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
	 * Return the value associated with the column: nomgroupe
	 */
	public java.lang.String getNomgroupe () {
		return nomgroupe;
	}

	/**
	 * Set the value related to the column: nomgroupe
	 * @param nomgroupe the nomgroupe value
	 */
	public void setNomgroupe (java.lang.String nomgroupe) {
		this.nomgroupe = nomgroupe;
	}



	/**
	 * Return the value associated with the column: commentairegroupe
	 */
	public java.lang.String getCommentairegroupe () {
		return commentairegroupe;
	}

	/**
	 * Set the value related to the column: commentairegroupe
	 * @param commentairegroupe the commentairegroupe value
	 */
	public void setCommentairegroupe (java.lang.String commentairegroupe) {
		this.commentairegroupe = commentairegroupe;
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
		if (!(obj instanceof domaine.Groupes)) return false;
		else {
			domaine.Groupes groupes = (domaine.Groupes) obj;
			if (null == this.getId() || null == groupes.getId()) return false;
			else return (this.getId().equals(groupes.getId()));
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