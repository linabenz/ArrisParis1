package com.projet.arrisparis.repository;

import com.projet.arrisparis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Override
    List<User> findAll();

    @Override
    <S extends User> S save(S s);

    User findByEmail(String email);
}
