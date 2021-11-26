package com.misiontic.library.service;


import com.misiontic.library.model.Client;
import com.misiontic.library.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    public Optional<Client> getClient(Integer id){
        return clientRepository.getClient(id);
    }
    public Client save(Client client) {
        if (client.getIdClient() == null) {
            return clientRepository.save(client);
        } else {
            Optional<Client> clientAux = clientRepository.getClient(client.getIdClient());
            if (clientAux.isEmpty()) {
                return clientRepository.save(client);
            } else {
                return client;
            }
        }
    }
}
