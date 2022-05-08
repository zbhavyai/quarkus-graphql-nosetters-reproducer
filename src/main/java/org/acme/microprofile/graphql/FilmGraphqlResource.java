package org.acme.microprofile.graphql;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

import io.smallrye.mutiny.Uni;

@GraphQLApi
@ApplicationScoped
public class FilmGraphqlResource {

    @Inject
    FilmService service;

    @Query("allFilms")
    public Uni<List<Film>> getFilms() {
        return service.getFilms();
    }

    @Mutation
    public Uni<Boolean> addFilm(final Film f) {
        return service.addFilm(f);
    }

    @Mutation
    public Uni<Boolean> deleteFilm(int id) {
        return service.deleteFilm(id);
    }
}
