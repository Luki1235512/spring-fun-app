package com.example.springfunapp.repositories;

import com.example.springfunapp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
