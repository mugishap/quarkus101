package com.quarkus;

import com.quarkus.payload.ApiResponse;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ApiResponse hello() {
        return ApiResponse.success("Hi Mom! I'll make you proud!") ;
    }

}
