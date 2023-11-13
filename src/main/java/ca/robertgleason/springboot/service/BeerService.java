package ca.robertgleason.springboot.service;


import ca.robertgleason.springboot.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}
