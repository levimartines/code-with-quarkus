package dev.levimartines.controllers;

import dev.levimartines.models.entities.Client;
import dev.levimartines.services.ClientService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/clients")
public class ClientController {

    @Inject
    ClientService service;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Client findById(@PathParam("id") Long id) {
        return service.findById(id);
    }

}
