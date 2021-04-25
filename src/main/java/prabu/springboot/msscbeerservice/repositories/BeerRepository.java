package prabu.springboot.msscbeerservice.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import prabu.springboot.msscbeerservice.domain.Beer;

import java.util.UUID;

@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
