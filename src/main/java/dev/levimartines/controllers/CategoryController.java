package dev.levimartines.controllers;

import dev.levimartines.mappers.CategoryMapper;
import dev.levimartines.models.dto.CategoryDTO;
import dev.levimartines.models.entities.Category;
import dev.levimartines.models.vo.CategoryVO;
import dev.levimartines.services.CategoryService;

import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/categories")
public class CategoryController {

    @Inject
    CategoryService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CategoryDTO> findAll() {
        return service.findAll().stream()
            .map(CategoryMapper::toDTO)
            .collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Category findById(@PathParam("id") Long id) {
        return service.findById(id);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Category save(CategoryVO categoryVO) {
        return service.save(categoryVO);
    }

}
