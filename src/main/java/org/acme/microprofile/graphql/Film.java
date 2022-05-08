package org.acme.microprofile.graphql;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Film {

    private String title;
    private Integer episode;
    private String director;
    private LocalDate releaseDate;

    // public Film() {
    // }

    @JsonCreator
    public Film(
            @JsonProperty("title") final String title,
            @JsonProperty("episode") final int episode,
            @JsonProperty("director") final String director,
            @JsonProperty("releaseDate") final LocalDate releaseDate) {
        this.title = title;
        this.episode = episode;
        this.director = director;
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public Integer getEpisode() {
        return episode;
    }

    public String getDirector() {
        return director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    // public void setTitle(String title) {
    // this.title = title;
    // }

    // public void setEpisode(Integer episode) {
    // this.episode = episode;
    // }

    // public void setDirector(String director) {
    // this.director = director;
    // }

    // public void setReleaseDate(LocalDate releaseDate) {
    // this.releaseDate = releaseDate;
    // }
}