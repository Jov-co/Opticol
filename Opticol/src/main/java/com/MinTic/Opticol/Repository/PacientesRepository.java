package com.MinTic.Opticol.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MinTic.Opticol.models.Pacientes;

@Repository
public interface PacientesRepository extends MongoRepository<Pacientes, String> {
}
