package fr.adaming.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // obligatoire pour faire persister l'entitée
@Table(name = "tb_etagere") // pour nommer la table
public class Etagere {

	// Attributs
	@Id // équivalent mapping de l'id (obligatoire aussi)
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incrément
	private long idEtagere;
	private int capaciteEtagere;

	// Constructeurs
	public Etagere() {
		super();
	}

	// Getters et Setters
	public long getIdEtagere() {
		return idEtagere;
	}

	public void setIdEtagere(long idEtagere) {
		this.idEtagere = idEtagere;
	}

	public int getCapaciteEtagere() {
		return capaciteEtagere;
	}

	public void setCapaciteEtagere(int capaciteEtagere) {
		this.capaciteEtagere = capaciteEtagere;
	}

	// toString
	@Override
	public String toString() {
		return "Etagere [idEtagere=" + idEtagere + ", capaciteEtagere=" + capaciteEtagere + "]";
	}

}