import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import domaine.Personnes;

public class Test1 {
	public static void main(String[] args) {
		try {
			System.out.println("je suis la");
			Session session = HibernateUtil.currentSession();
			System.out.println("je suis la 2");
			List list = session.createQuery("from Personnes ").list();
			Iterator it = list.iterator();
			while(it.hasNext())
			{
			Personnes personne = (Personnes)it.next();
			System.out.println(personne.getNompersonne());
			}
			HibernateUtil.closeSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}