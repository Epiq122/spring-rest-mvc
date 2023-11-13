package ca.robertgleason.springboot.controller;


import ca.robertgleason.springboot.model.Beer;
import ca.robertgleason.springboot.service.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Controller
@AllArgsConstructor
@Slf4j
public class BeerController {

    private final BeerService beerService;


    public Beer getBeerById(UUID id) {
        log.debug("Get Beer by Id - in controller");
        
        return beerService.getBeerById(id);


    }
}
