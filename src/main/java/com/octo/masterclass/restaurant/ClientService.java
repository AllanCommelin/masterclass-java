package com.octo.masterclass.restaurant;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    public String getFullName(Client client) {
        return client.getPrenom() + " " + client.getNom();
    }
}
