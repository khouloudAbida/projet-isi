package com.GestionEtudiant.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.GestionEtudiant.demo.DAO.EtudiantDAO;
import com.GestionEtudiant.demo.metier.Etudiant;



@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/etudiant")
public class EtudiantController {
	
	@Autowired
	EtudiantDAO etudao;
	
	
	@RequestMapping(value="/all", method = RequestMethod.GET)
	@CrossOrigin
	public List<Etudiant> findAll()
	{
		List<Etudiant> list = new ArrayList<Etudiant>();
		list = etudao.findAll();
		return list;
	}
	
	@RequestMapping(value="/save" , method = RequestMethod.POST)
	@CrossOrigin
	public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
		
		
		etudao.save(etudiant);
		return etudiant;
	}
	
	@RequestMapping(value="/delete" , method = RequestMethod.DELETE)
	@CrossOrigin
	public List<Etudiant> deleteEtudiant(@RequestBody Etudiant etudiant) {
		
		etudao.deleteByMatricule(etudiant.getMatricule());
		List<Etudiant> list = new ArrayList<Etudiant>();
		list = etudao.findAll();
		return list;
	
	
	}
}
