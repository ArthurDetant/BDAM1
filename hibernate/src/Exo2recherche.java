import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import domaine.Entreprises;

public class Exo2recherche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Id de l'entreprise ? ");
		
		String str = sc.nextLine();				
		
		int f = 0;
		
		try {
			Session session = HibernateUtil.currentSession();
			List list = session.createQuery("from Entreprises ").list();
			Iterator it = list.iterator();
			while(it.hasNext())
			{
				Entreprises entreprises = (Entreprises)it.next();
				if(entreprises.getidEntreprise() == Integer.parseInt(str)) {
					System.out.println("idEntreprise nomEnt listeActivites nbEmployes");
					System.out.println(entreprises.getidEntreprise() + " " + 
							entreprises.getNomEnt() + " " + 
							entreprises.getListeActivites() + " " + 
							entreprises.getNbEmployes());	
					f = 1;
				}							
			}
			if(f == 0) { System.out.println("Aucune entreprise avec cet ID"); }
			HibernateUtil.closeSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

}
