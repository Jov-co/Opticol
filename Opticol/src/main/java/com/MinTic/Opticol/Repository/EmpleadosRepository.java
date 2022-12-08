package com.MinTic.Opticol.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.MinTic.Opticol.models.Empleados;

@Repository
public interface EmpleadosRepository extends MongoRepository<Empleados, String> {
}
