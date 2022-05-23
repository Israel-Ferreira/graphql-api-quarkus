package io.codekaffee.resolvers;

import io.codekaffee.schemas.TouristPoint;
import io.codekaffee.schemas.TouristPointInput;
import io.codekaffee.services.TouristPointService;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;

import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class TouristPointResolver {

    private final TouristPointService service;

    @Inject
    public TouristPointResolver(TouristPointService service) {
        this.service = service;
    }

    @Query(value = "listAllTouristPoints")
    public List<TouristPoint> listAllTouristPoints() {
        return service.getAllTouristPoints();
    }

    @Mutation("createTouristPoint")
    public TouristPoint createTouristPoint(TouristPointInput input) {
        return service.createTouristPoint(input);
    }

    @Query( value = "getTouristPoint")
    public TouristPoint getTouristPoint(@Name("id") Long id) {
        return service.getById(id);
    }

    @Mutation("deleteTouristPointById")
    public TouristPoint deleteTouristPoint(@Name("id") Long id) {
        return service.deleteById(id);
    }

}
