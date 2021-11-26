package com.misiontic.library.repository;

import com.misiontic.library.model.Client;
import com.misiontic.library.repository.crud.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {

    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll() {
        return (List<Client>) clientCrudRepository.findAll();
    }

    public Optional<Client> getClient(Integer id) {
        return clientCrudRepository.findById(id);
    }

    public Client save(Client client) {
        return clientCrudRepository.save(client);
    }
}
