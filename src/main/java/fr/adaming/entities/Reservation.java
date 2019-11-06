package fr.adaming.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_reservations")
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idReservation;

	@ManyToOne
	private Livre livre;

	@ManyToOne
	private Client client;

	// Constructeurs
	public Reservation() {
		super();
	}

	// Getters et Setters
	public long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(long idReservation) {
		this.idReservation = idReservation;
	}

	public Livre getLivre() {
		return livre;
	}

	public void setLivre(Livre livre) {
		this.livre = livre;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	// toString
	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", livre=" + livre + ", client=" + client + "]";
	}

}