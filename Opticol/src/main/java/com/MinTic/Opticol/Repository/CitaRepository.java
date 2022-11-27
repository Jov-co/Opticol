package com.MinTic.Opticol.Repository;

import com.MinTic.Opticol.Entities.Citas;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


    @Repository
    public interface CitaRepository extends MongoRepository<Citas, String> {
    }

