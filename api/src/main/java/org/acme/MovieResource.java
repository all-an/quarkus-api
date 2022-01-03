package org.acme;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/movies")
public class MovieResource {

    public static List<String> movies = new ArrayList<>();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getMovies(){
        return Response.ok(movies).build();
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/size")
    public Integer countMovies(){
        return movies.size();
    }

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public Response createMovie(String newMovie){
        movies.Add(newMovie);
        return Response.ok(movies).build();
    }

}
