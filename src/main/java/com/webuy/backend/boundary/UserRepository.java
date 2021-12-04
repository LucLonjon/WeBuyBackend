package com.webuy.backend.boundary;

import com.webuy.backend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}