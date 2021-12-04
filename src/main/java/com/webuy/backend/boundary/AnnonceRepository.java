package com.webuy.backend.boundary;

import com.webuy.backend.entity.Annonce;
import com.webuy.backend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnnonceRepository extends CrudRepository<Annonce, Long> {
}
