import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domaine.Groupes;
import domaine.Grppers;
import domaine.Personnes;
public class Test2 {
	public static void main(String[] args) {
		try {
				Session session = HibernateUtil.currentSession();
				Transaction tx = session.beginTransaction();
				Personnes personne = new Personnes();
				personne.setNompersonne("nom6");personne.setPrenompersonne("prenom6");
				personne.setCoeffpersonne(new Integer(46));
				personne.setDatenaisspersonne(new Date());
				session.save(personne);
				Groupes groupe = (Groupes) session.load(Groupes.class, new Integer(1));
				Grppers grppres = new Grppers();
				grppres.setIdpersonne(personne);
				grppres.setIdgroupe(groupe);
				session.save(grppres);
				tx.commit();
				HibernateUtil.closeSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
}
}