import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.transaction.Transaction;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.mysql.cj.Query;

import domaine.Entreprises;

public class Exo4 {
//NON FONCTIONNEL
private static void DeleteWithId(int id) {
		int valide = 0;
		
		try {
			Session session = HibernateUtil.currentSession();
			
			Query q = (Query) session.createQuery("delete Entreprises where id = :id").setParameter("id", id).uniqueResult();
			 ((org.hibernate.Query) q).executeUpdate();
		
			HibernateUtil.closeSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
public void delete(int id) implements AutoCloseable{
	Transaction transaction = null;
	try(Session session= HibernateUtil.getSessionFactory().openSession()){
		
	} catch (Exception e) { }
}
	
	public static void main(String[] args) {
		Entreprises entreprises;
		Scanner sc = new Scanner(System.in);
		System.out.println("Id de l'entreprise ? ");
		
		String str = sc.nextLine();				
		int id = Integer.parseInt(str);
		DeleteWithId(id);
		
	}
}
