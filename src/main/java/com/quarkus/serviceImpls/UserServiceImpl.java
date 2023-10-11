package com.quarkus.serviceImpls;

import com.quarkus.models.User;
import com.quarkus.repositories.UserRepository;
import com.quarkus.services.UserService;
import io.smallrye.mutiny.Uni;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public Uni<User> create(User user) {
        return this.userRepository.persist(user);
    }
}
