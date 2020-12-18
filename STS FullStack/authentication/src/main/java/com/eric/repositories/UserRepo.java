package com.eric.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eric.model.User;
@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByEmail(String email);
}