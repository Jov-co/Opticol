package com.MinTic.Opticol.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MinTic.Opticol.models.Citas;


    @Repository
    public interface CitaRepository extends MongoRepository<Citas, String> {
    }

