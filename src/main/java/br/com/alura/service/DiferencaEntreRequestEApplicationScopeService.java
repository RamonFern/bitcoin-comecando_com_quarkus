package br.com.alura.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
//@RequestScoped
public class DiferencaEntreRequestEApplicationScopeService {

	
	private List<String> listaNome = new ArrayList<>();

	/*
	 * código com exemplo de utilizaçao @ApplicationScoped 
	 * 	e @RequestScope
	 * */
	
	public void adicionar(String nome) {
		listaNome.add(nome);
	}
	
	public List<String> listar(){
		return listaNome;
	}
}
