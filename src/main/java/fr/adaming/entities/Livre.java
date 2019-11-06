package fr.adaming.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // obligatoire pour faire persister l'entit�e
@Table(name = "tb_livres") // pour nommer la table
public class Livre {

	// Attributs
	@Id // �quivalent mapping de l'id (obligatoire aussi)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incr�ment
	private long idLivre;
	private String titreLivre;
	private String auteurLivre;
	private int nbPagesLivre;
	private double prixLivre;
	private int stockLivre;

	@ManyToOne
	private Etagere etagere;

	// Constructeurs
	public Livre() {
		super();
	}

	// Getters et Setters
	public long getIdLivre() {
		return idLivre;
	}

	public void setIdLivre(long idLivre) {
		this.idLivre = idLivre;
	}

	public String getTitreLivre() {
		return titreLivre;
	}

	public void setTitreLivre(String titreLivre) {
		this.titreLivre = titreLivre;
	}

	public String getAuteurLivre() {
		return auteurLivre;
	}

	public void setAuteurLivre(String auteurLivre) {
		this.auteurLivre = auteurLivre;
	}

	public int getNbPagesLivre() {
		return nbPagesLivre;
	}

	public void setNbPagesLivre(int nbPagesLivre) {
		this.nbPagesLivre = nbPagesLivre;
	}

	public double getPrixLivre() {
		return prixLivre;
	}

	public void setPrixLivre(double prixLivre) {
		this.prixLivre = prixLivre;
	}

	public int getStockLivre() {
		return stockLivre;
	}

	public void setStockLivre(int stockLivre) {
		this.stockLivre = stockLivre;
	}

	public Etagere getEtagere() {
		return etagere;
	}

	public void setEtagere(Etagere etagere) {
		this.etagere = etagere;
	}

	// toString
	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", titreLivre=" + titreLivre + ", auteurLivre=" + auteurLivre
				+ ", nbPagesLivre=" + nbPagesLivre + ", prixLivre=" + prixLivre + ", stockLivre=" + stockLivre
				+ ", etagere=" + etagere + "]";
	}

}