package beer.service;

import beer.model.Beer;

import java.util.List;

public interface BeerService {
    Beer getBeer(String id);

    List<Beer> getBeersByBrewery(String breweryId);
}
