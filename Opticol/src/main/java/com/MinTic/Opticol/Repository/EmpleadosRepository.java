package com.MinTic.Opticol.Repository;

import com.MinTic.Opticol.Entities.Empleados;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadosRepository extends MongoRepository<Empleados, String> {
}
