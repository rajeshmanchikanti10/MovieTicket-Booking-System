package org.example.dtos;

import lombok.Data;

@Data
public class MovieDTO {
    private String movieName;
    private String genre;
    private int duration;
    private String lang;
    private Long id;
}
// /movie POST params(MovieDTO)
// /movie UPDATE params(MovieDTO)
// /movie GET params(movieId)

// movie GET all movies of  a particular location
// /movie/list/ POST location in body,  fetch all sql join b/w theatre table and show table
 // select distinct m.*
 //   from movie as m
//JOIN Show as s ON m.id = s.movie_id
//Join theatre as t ON s.theatreId = t.id
// where t.location = :location