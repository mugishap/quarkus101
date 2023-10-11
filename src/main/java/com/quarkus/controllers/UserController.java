package com.quarkus.controllers;

import com.quarkus.models.User;
import com.quarkus.payload.ApiResponse;
import com.quarkus.services.UserService;
import lombok.RequiredArgsConstructor;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;

@Path(("/user"))
@RequiredArgsConstructor
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserController {

    private final UserService userService;

    @POST
    @Path("/create")
    public ApiResponse create(

    ) {
        User user = new User();
        user.setNames("John Does");
        user.setEmail("johndoe@gmail.com");
        user.setTelephone("+250782307144");
        user.setPassword("{Test123}");

        return ApiResponse.success("User created successfully", this.userService.create(user));
    }


}
