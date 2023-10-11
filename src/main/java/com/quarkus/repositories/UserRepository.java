package com.quarkus.repositories;

import com.quarkus.models.User;
import io.quarkus.hibernate.reactive.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<User, UUID> {
}
