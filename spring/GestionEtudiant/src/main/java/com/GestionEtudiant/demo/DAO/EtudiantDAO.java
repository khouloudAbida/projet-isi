package com.GestionEtudiant.demo.DAO;

import javax.transaction.Transactional;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionEtudiant.demo.metier.Etudiant;

public interface EtudiantDAO extends JpaRepository<Etudiant,String> {
	public Etudiant findByMatricule(String matricule);
	@Modifying
	@Transactional
	Etudiant deleteByMatricule(String Matricule);
	
}
