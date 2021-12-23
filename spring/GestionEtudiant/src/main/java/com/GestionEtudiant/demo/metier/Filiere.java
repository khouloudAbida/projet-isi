package com.GestionEtudiant.demo.metier;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Filiere implements Serializable {
	@Id
	private String code;
	private String nom;
	public Filiere(String code, String nom) {
		super();
		this.code = code;
		this.nom = nom;
	}
	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		return code;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(code);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filiere other = (Filiere) obj;
		return Objects.equals(code, other.code);
	}
	@Override
	public String toString() {
		return "filiere [code=" + code + ", nom=" + nom + "]";
	}
	
}
