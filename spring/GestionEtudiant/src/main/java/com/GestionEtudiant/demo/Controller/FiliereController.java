/*package com.GestionEtudiant.demo.Controller;

import com.GestionEtudiant.demo.acessBD.FiliereDAO;
import com.GestionEtudiant.demo.metier.Filiere;


public class FiliereController {
	public static void save(Filiere f)
	{
		FiliereDAO f1=new FiliereDAO();
		boolean b=f1.ajouterFiliere(f);
		if(b==true)
			System.out.println("Ajout effectuer avec succès");
	}
	/*
	public static void update(Filiere f)
	{
		FiliereDAO f1=new FiliereDAO();
		boolean b=f1.update(f);
		if(b==true)
			System.out.println("Mise à jour effectuer avec succès"); }
			*/
	
	/*public static void delete(Filiere f)
	{
		FiliereDAO f1=new FiliereDAO();
		boolean b=f1.delete(f);
		if(b==true)
			System.out.println("Suppression effectuer avec succès");
	}
	
	public static Filiere findById(String code)
	{
		FiliereDAO f1=new FiliereDAO();
		return f1.findById(code);
	}
	/*
	public static List<Filiere> findAll()
	{
		FiliereDAO f1=new FiliereDAO();
		return f1.findAll();
	}*/

