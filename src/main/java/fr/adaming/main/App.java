package fr.adaming.main;

import org.hibernate.Session;

import fr.adaming.entities.Client;
import fr.adaming.entities.Etagere;
import fr.adaming.entities.Livre;
import fr.adaming.entities.Reservation;
import fr.adaming.util.HibernateUtil;

public class App {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		// Prepare la transaction
		session.beginTransaction();

		Etagere eta1 = new Etagere();
		eta1.setCapaciteEtagere(200);

		Etagere eta2 = new Etagere();
		eta2.setCapaciteEtagere(250);

		Client cl1 = new Client();
		cl1.setNomClient("TOTO");
		cl1.setPrenomClient("toto");
		cl1.setAdresseClient("Rennes");

		Client cl2 = new Client();
		cl2.setNomClient("TITI");
		cl2.setPrenomClient("titi");
		cl2.setAdresseClient("Nantes");

		Livre l1 = new Livre();
		l1.setTitreLivre("Mon premier livre");
		l1.setAuteurLivre("Killian");
		l1.setNbPagesLivre(300);
		l1.setPrixLivre(9.99);
		l1.setStockLivre(9);
		l1.setEtagere(eta2);

		Livre l2 = new Livre();
		l2.setTitreLivre("Mon deuxième livre");
		l2.setAuteurLivre("Killian");
		l2.setNbPagesLivre(320);
		l2.setPrixLivre(15.99);
		l2.setStockLivre(6);
		l2.setEtagere(eta2);

		Livre l3 = new Livre();
		l3.setTitreLivre("Mon troisième livre");
		l3.setAuteurLivre("Pierre");
		l3.setNbPagesLivre(400);
		l3.setPrixLivre(11.49);
		l3.setStockLivre(15);
		l3.setEtagere(eta1);

		Reservation res1 = new Reservation();
		res1.setClient(cl1);
		res1.setLivre(l2);

		// Ajouter les requêtes à la transaction
		session.save(eta1);
		session.save(eta2);
		session.save(l1);
		session.save(l2);
		session.save(l3);
		session.save(cl1);
		session.save(cl2);
		session.save(res1);

		// Envoyez la transaction
		session.getTransaction().commit();

	}

}