package com.ronei.simplespotify.api;

import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import com.ronei.simplespotify.domain.Artista;
import com.ronei.simplespotify.dto.ArtistaDTO;
import com.ronei.simplespotify.service.ArtistaService;
import com.ronei.simplespotify.util.PageParams;

@Component
@Path("artistas")
public class ArtistaAPI extends BaseAPI {

	@Autowired
	private ArtistaService service;

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response save(@Valid ArtistaDTO dto) {
		final Artista artista = mapper(dto, Artista.class);

		service.save(artista);

		final ArtistaDTO resposta = mapper(artista, ArtistaDTO.class);

		return Response.ok(resposta).build();

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll(@QueryParam("page") @DefaultValue(PageParams.DEFAULT_PAGE) int page,
			@QueryParam("size") @DefaultValue(PageParams.DEFAULT_SIZE) int size,
			@QueryParam("sort") @DefaultValue("nome") List<String> sort,
			@QueryParam("direction") @DefaultValue(PageParams.ASC) String direction) {

		final Pageable pageable = createPageRequest(page, size, sort, direction);

		final Page<ArtistaDTO> resposta = service.findAll(pageable).map(source -> mapper(source, ArtistaDTO.class));

		return Response.ok(resposta).build();

	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response findOne(@PathParam("id") Long id) {

		final Artista artista = service.findOne(id);

		return Response.ok(mapper(artista, ArtistaDTO.class)).build();

	}

}
