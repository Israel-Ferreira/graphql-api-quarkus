package io.codekaffee.repositories;

import javax.enterprise.context.ApplicationScoped;

import io.codekaffee.models.PontoTuristico;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class TouristPointRepository implements PanacheRepository<PontoTuristico> {
    
}
