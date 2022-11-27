package com.MinTic.Opticol.Repository;


import com.Unab.Opticol.models.Pacientes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends MongoRepository<Pacientes, String> {
}
