package com.quarkus.services;

import com.quarkus.models.User;
import io.smallrye.mutiny.Uni;

public interface UserService {

    Uni<User> create(User user);

}
