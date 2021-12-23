package com.GestionEtudiant.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.GestionEtudiant.demo.DAO.EtudiantDAO;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.GestionEtudiant.demo.metier.Etudiant;


@SpringBootApplication
public class GestionEtudiantApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(GestionEtudiantApplication.class, args);
		
		
		Etudiant e1= new Etudiant("0214","khouloud","abida","celibataire",21 ,"50749051") ;
		
		EtudiantDAO edao = ctx.getBean(EtudiantDAO.class);
		edao.save(e1);
			
		
	}

}
