package com.example.demo.service;

import com.example.demo.model.Client;

import java.util.List;

public interface ClientService {

    void create(Client client);

    List<Client> getAll();

    Client getById(int id);

    boolean update(Client client, int id);

    boolean delete(int id);
}
