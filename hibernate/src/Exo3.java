import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import domaine.Entreprises;

public class Exo3 {
	private static void getEntreprises() {
		try {
			Session session = HibernateUtil.currentSession();
			List list = session.createQuery("from Entreprises ").list();
			Iterator it = list.iterator();
			System.out.println("idEntreprise nomEnt listeActivites nbEmployes");
				while(it.hasNext())
				{
					Entreprises entreprises = (Entreprises)it.next();
					
					System.out.println(entreprises.getidEntreprise() + " " + 
							entreprises.getNomEnt() + " " + 
							entreprises.getListeActivites() + " " + 
							entreprises.getNbEmployes());
				}
			HibernateUtil.closeSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
    }
	
	private static void getInfosWithName () {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nom de l'entreprise ? ");
		
		String str = sc.nextLine();				
		
		int valide = 0;
		
		try {
			Session session = HibernateUtil.currentSession();
			List list = session.createQuery("from Entreprises ").list();
			Iterator it = list.iterator();
			while(it.hasNext())
			{
				Entreprises entreprises = (Entreprises)it.next();
				String nom=entreprises.getNomEnt();
				
				if(nom.equals(str)) { 
					
					System.out.println("idEntreprise nomEnt listeActivites nbEmployes");
					System.out.println(entreprises.getidEntreprise() + " " + 
							entreprises.getNomEnt() + " " + 
							entreprises.getListeActivites() + " " + 
							entreprises.getNbEmployes());	
					valide = 1;
				}							
			}
			if(valide == 0) { System.out.println("Aucune entreprise avec ce Nom "); }
			HibernateUtil.closeSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
		
	private static void getEntreprisesTri() {
		try {
			Session session = HibernateUtil.currentSession();
			List list = session.createQuery("from Entreprises order by nbEmployes desc").list();
			Iterator it = list.iterator();
			System.out.println("idEntreprise nomEnt listeActivites nbEmployes");
				while(it.hasNext())
				{
					Entreprises entreprises = (Entreprises)it.next();
					
					System.out.println(entreprises.getidEntreprise() + " " + 
							entreprises.getNomEnt() + " " + 
							entreprises.getListeActivites() + " " + 
							entreprises.getNbEmployes());
				}
			HibernateUtil.closeSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
    }
	
	private static void getNumberOfLine() {
		try {
			Session session = HibernateUtil.currentSession();
			System.out.println(session.createQuery("select count(*) from Entreprises").uniqueResult());
			HibernateUtil.closeSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
    }
	
		
		
	
	
	
	
	public static void main(String[] args) {
		getEntreprises();
		//getInfosWithName();
		//getEntreprisesTri();
		//getNumberOfLine();
		
		
	}
}
