package com.GestionEtudiant.demo.metier;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Etudiant implements Serializable {
	
	@Id
	private String matricule;
	private String nom;
	private String prenom;
	private String etatCivil;
	private int age;
	private String tel;
	
	public Etudiant(String matricule, String nom, String prenom, String etatCivil, int age, String tel) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.etatCivil = etatCivil;
		this.age = age;
		this.tel = tel;
	}

	public Etudiant() {
		super();
		
	}

	public  String getMatricule() {
		return matricule;
	}

	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEtatCivil() {
		return etatCivil;
	}

	public void setEtatCivil(String etatCivil) {
		this.etatCivil = etatCivil;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(matricule);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		return Objects.equals(matricule, other.matricule);
	}

	@Override
	public String toString() {
		return "Etudiant [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", etatCivil=" + etatCivil
				+ ", age=" + age + ", tel=" + tel + "]";
	}
	
	
}
