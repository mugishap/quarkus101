package com.quarkus.models;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;


/**
 * Example JPA entity.
 * <p>
 * To use it, get access to a JPA EntityManager via injection.
 * <p>
 * {@code
 *
 * @Inject EntityManager em;
 * <p>
 * public void doSomething() {
 * MyEntity entity1 = new MyEntity();
 * entity1.field = "field-1";
 * em.persist(entity1);
 * <p>
 * List<MyEntity> entities = em.createQuery("from MyEntity", MyEntity.class).getResultList();
 * }
 * }
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String names;
    private String email;
    private String telephone;
    private String password;

}
