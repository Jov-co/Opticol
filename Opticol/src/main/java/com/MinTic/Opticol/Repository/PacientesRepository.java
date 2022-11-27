package com.MinTic.Opticol.Repository;

import com.MinTic.Opticol.Entities.Pacientes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacientesRepository extends MongoRepository<Pacientes, String> {
}
