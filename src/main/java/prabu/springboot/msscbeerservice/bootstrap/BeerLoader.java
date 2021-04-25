package prabu.springboot.msscbeerservice.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import prabu.springboot.msscbeerservice.domain.Beer;
import prabu.springboot.msscbeerservice.repositories.BeerRepository;

import java.math.BigDecimal;

@Component
@Slf4j
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObject();
    }

    private void loadBeerObject() {
        if(beerRepository.count() == 0){

            beerRepository.save(Beer.builder()
                .beerName("beer 1")
                .quantityToBrew(200)
                .upc(6565L)
                .price(BigDecimal.valueOf(12.50))
                .minOnHand(12)
                .build());

            beerRepository.save(Beer.builder()
                .beerName("beer 2")
                .quantityToBrew(200)
                .upc(65654L)
                .price(BigDecimal.valueOf(12.50))
                .minOnHand(12)
                .build());

        }

        log.info("loaded beer : {}", beerRepository.count());

    }
}
