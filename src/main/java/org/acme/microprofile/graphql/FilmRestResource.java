package org.acme.microprofile.graphql;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.jboss.resteasy.reactive.RestPath;

import io.smallrye.mutiny.Uni;

@Path("rest")
@ApplicationScoped
public class FilmRestResource {

    @Inject
    FilmService service;

    @GET
    @Path("allFilms")
    public Uni<List<Film>> getFilms() {
        return service.getFilms();
    }

    @POST
    public Uni<Boolean> addFilm(final Film f) {
        return service.addFilm(f);
    }

    @DELETE
    @Path("{id}")
    public Uni<Boolean> deleteFilm(@RestPath int id) {
        return service.deleteFilm(id);
    }
}
