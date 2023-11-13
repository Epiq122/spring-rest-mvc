package ca.robertgleason.springboot.service;

import ca.robertgleason.springboot.model.Beer;
import ca.robertgleason.springboot.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@Slf4j
public class BeerServiceImpl implements BeerService {

    @Override
    public Beer getBeerById(UUID id) {
        log.debug("Get Beer Id in service was called");
        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Galaxy Cat")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("124124")
                .price(new BigDecimal("12.99"))
                .quantityOnHand(821)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
