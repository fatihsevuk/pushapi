package com.iotrack.pushapi.repository;

import com.iotrack.pushapi.domain.Body;
import com.iotrack.pushapi.domain.Deneme;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DenemeRepository extends MongoRepository<Deneme, String>{
}
