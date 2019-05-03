import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import domaine.Entreprises;
import domaine.Personnes;

public class Exo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Session session = HibernateUtil.currentSession();
			List list = session.createQuery("from Entreprises ").list();
			Iterator it = list.iterator();
			while(it.hasNext())
			{
				Entreprises entreprises = (Entreprises)it.next();
				System.out.println(entreprises.getidEntreprise());
			}
			HibernateUtil.closeSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

}
