package com.octo.masterclass.api;

import com.octo.masterclass.restaurant.Client;
import com.octo.masterclass.restaurant.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/client")
public class ClientController {
    // Init some clients
    Client client1 = new Client("Doe", "John", "1 rue du perond");
    Client client2 = new Client("Dupond", "Michel", "2 rue des lilas");
    Client client3 = new Client("Marchand", "Isabelle", "3 impasse des corneilles");

    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @GetMapping()
    List<Client> getAllClients() {
        return List.of(client1, client2, client3);
    }
}
