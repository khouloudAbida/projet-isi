package com.GestionEtudiant.demo.metier;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Niveau implements Serializable {
	@Id
	private int niveau;

	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Niveau(int niveau) {
		super();
		this.niveau = niveau;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(niveau);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Niveau other = (Niveau) obj;
		return niveau == other.niveau;
	}

	@Override
	public String toString() {
		return "Niveau [niveau=" + niveau + "]";
	}
}
