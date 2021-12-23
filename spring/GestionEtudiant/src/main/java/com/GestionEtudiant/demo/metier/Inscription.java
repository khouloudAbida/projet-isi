package com.GestionEtudiant.demo.metier;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Inscription implements Serializable {
	@Id
	private String codeIns;
	private Date date;
	private static Etudiant etudiant;
	private Filiere filiere ;
	private Niveau niveau;
	
	@OneToOne
	private Etudiant m_Etudiant;
	@OneToOne
	public Filiere m_Filiere;
	@OneToOne
	public Niveau m_Niveau;

	public Inscription(String codeIns, Date date,  Etudiant etudiant, Filiere filiere, Niveau niveau) {
		super();
		this.codeIns = codeIns;
		this.date = date;
		Inscription.etudiant= etudiant;
		this.filiere = filiere;
		this.niveau = niveau;
	}
	

	public Inscription(String codeIns, Date date, Filiere filiere, Niveau niveau, Etudiant m_Etudiant,
			Filiere m_Filiere, Niveau m_Niveau) {
		super();
		this.codeIns = codeIns;
		this.date = date;
		this.filiere = filiere;
		this.niveau = niveau;
		this.m_Etudiant = m_Etudiant;
		this.m_Filiere = m_Filiere;
		this.m_Niveau = m_Niveau;
	}


	public Inscription() {
		super();
	}


	public String getCodeIns() {
		return codeIns;
	}

	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static Etudiant getEtudiant() {
		return etudiant;
	}

	public static void setEtudiant(Etudiant etudiant) {
		Inscription.etudiant = etudiant;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}

	public Niveau getNiveau() {
		return niveau;
	}

	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}

	

	
	@Override
	public int hashCode() {
		return Objects.hash(codeIns);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inscription other = (Inscription) obj;
		return Objects.equals(codeIns, other.codeIns);
	}


	@Override
	public String toString() {
		return "Inscription [codeIns=" + codeIns + ", date=" + date + ", filiere=" + filiere + ", niveau=" + niveau
				+ "]";
	}

}
