package davhenriques.spring.msscbeerservice.repositories;

import davhenriques.spring.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

/**
 * Created by DavHenriques on 15/07/2022
 */
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {


}
