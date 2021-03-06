package com.example.springfunapp;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.springfunapp.models.User;
import com.example.springfunapp.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

//    @Autowired
//    private TestEntityManager entityManager;
//
//    @Autowired
//    private UserRepository repo;

//    @Test
//    public void testCreateUser() {
//        User user = new User();
//        user.setUsername("email@email.com");
//        user.setPassword("123");
//        user.setFirstName("Luki");
//        user.setLastName("1235512");
//
//        User savedUser = repo.save(user);
//
//        User existUser = entityManager.find(User.class, savedUser.getId());
//
//        assertThat(user.getUsername()).isEqualTo(existUser.getUsername());
//    }

}
