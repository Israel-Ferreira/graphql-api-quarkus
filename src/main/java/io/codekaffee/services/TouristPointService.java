package io.codekaffee.services;

import io.codekaffee.models.PontoTuristico;
import io.codekaffee.repositories.TouristPointRepository;
import io.codekaffee.schemas.TouristPoint;
import io.codekaffee.schemas.TouristPointInput;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@ApplicationScoped
public class TouristPointService {

    @Inject
    private TouristPointRepository repository;

    public List<TouristPoint> getAllTouristPoints() {
        return repository.streamAll().map(TouristPoint::new)
                .collect(Collectors.toList());
    }


    public TouristPoint getById(Long id) {
        Optional<PontoTuristico> pontoTuristico = repository.findByIdOptional(id);

        if(pontoTuristico.isEmpty()) {
            return new TouristPoint();
        }

        return new TouristPoint(pontoTuristico.get());
    }

    @Transactional
    public TouristPoint createTouristPoint(TouristPointInput input) {
        PontoTuristico pontoTuristico = new PontoTuristico(input);

        repository.persist(pontoTuristico);
        return new TouristPoint(pontoTuristico);
    }


    @Transactional
    public TouristPoint deleteById(Long id) {
        Optional<PontoTuristico> pt = repository.findByIdOptional(id);

        if(pt.isEmpty()){
            return new TouristPoint();
        }

        TouristPoint touristPoint = new TouristPoint(pt.get());

        repository.delete(pt.get());

        return  touristPoint;
    }
}
