package br.com.alura.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.alura.service.DiferencaEntreRequestEApplicationScopeService;

@Path("teste")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class DiferencaEntreRequestEApplicationScopeRest {
	
	@Inject
	DiferencaEntreRequestEApplicationScopeService service;
	
	
	@GET
	@Path("/{nome}")
	public Response adicionarLista(@PathParam("nome") String nome) {
		service.adicionar(nome);
		return Response
				.status(201)
				.entity(service.listar())
				.build();
	}

	@GET
	@Path("/")
	public Response obterLista() {
		return Response
				.status(200)
				.entity(service.listar())
				.build();
	}

}
