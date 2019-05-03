import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import domaine.Entreprises;
import domaine.Groupes;
import domaine.Grppers;
import domaine.Personnes;

public class Exo2insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub				
		
		try {
			Session session = HibernateUtil.currentSession();
			Transaction tx = session.beginTransaction();
			Entreprises entreprises = new Entreprises();
			entreprises.setNomEnt("GOOGLE");
			entreprises.setListeActivites("on fait des recherches");
			entreprises.setNbEmployes(new Integer(46));
					
			session.save(entreprises);

			tx.commit();
			HibernateUtil.closeSession();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
