package com.MinTic.Opticol.Repository;

import com.MinTic.Opticol.Entities.Horario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HorariosRepository extends MongoRepository<Horario, String> {
}
