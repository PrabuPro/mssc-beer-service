package prabu.springboot.msscbeerservice.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prabu.springboot.msscbeerservice.web.model.BeerDTO;

import java.util.UUID;

@RestController
@RequestMapping(BeerController.API_V_1_BEER)
public class BeerController {
    public static final String API_V_1_BEER = "/api/v1/beer";


    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDTO> getBeerById(@PathVariable UUID beerId){

        return new ResponseEntity<>(BeerDTO.builder().build(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<BeerDTO> saveBeer(@RequestBody BeerDTO beerDTO){
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDTO> updateBeer(@PathVariable UUID beerId, @RequestBody BeerDTO beerDTO){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){

    }
}
