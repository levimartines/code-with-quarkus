package dev.levimartines.services;

import dev.levimartines.exceptions.ObjectNotFoundException;
import dev.levimartines.models.entities.Client;
import dev.levimartines.repositories.ClientRepository;

import lombok.extern.slf4j.Slf4j;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
@Slf4j
public class ClientService {

    @Inject
    ClientRepository repository;

    public Client findById(Long id) {
        return repository.findByIdOptional(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

}
