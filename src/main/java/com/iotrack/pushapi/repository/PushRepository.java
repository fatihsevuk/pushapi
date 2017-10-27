package com.iotrack.pushapi.repository;

import com.iotrack.pushapi.domain.Body;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PushRepository extends MongoRepository<Body, String>{
}
