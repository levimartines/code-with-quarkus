package dev.levimartines.mocks.services;

import dev.levimartines.exceptions.ObjectNotFoundException;
import dev.levimartines.models.entities.Client;
import dev.levimartines.services.ClientService;
import io.quarkus.test.Mock;

import javax.enterprise.context.ApplicationScoped;

@Mock
@ApplicationScoped
public class MockClientService extends ClientService {

    @Override
    public Client findById(Long id) {
        if (id != 1L) {
            throw new ObjectNotFoundException();
        }
        return Client.builder().id(id).name("Test Client").build();
    }
}
