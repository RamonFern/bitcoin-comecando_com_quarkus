package br.com.alura.service;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.alura.dao.TodoDao;

@RequestScoped
public class TodoService {
	
	@Inject
	TodoDao dao;
	
	private void validar() {
		//validar regra de negocio
	}
	
	@Transactional(rollbackOn = Exception.class)
	private void inserir() {
		//validacao
		validar();
		//chamar dao
	}
	
	private void listar() {
		//chamr dao
	}
	
	
	
	


}
