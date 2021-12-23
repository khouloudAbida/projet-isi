package com.GestionEtudiant.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GestionEtudiant.demo.metier.*;

public interface InscriptionDAO extends JpaRepository<Inscription,String>  {

}
