package com.MinTic.Opticol.Services.Implements;

import com.MinTic.Opticol.Repository.CitaRepository;
import com.MinTic.Opticol.Services.CitaService;
import com.MinTic.Opticol.models.Citas;

import com.MinTic.Opticol.models.Pacientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CitaServiceImpl implements CitaService {


    @Autowired
    private CitaRepository citaRepository;
    @Override
    public List<Citas> listar() {
        return citaRepository.findAll();
    }



    @Override
    public ResponseEntity<Object> guardar(Citas cita, HttpHeaders headers ) {

        if(cita.getId()!=null) {
            return ResponseEntity.badRequest().build();
        }
        Citas result= citaRepository.save(cita);
        return ResponseEntity.ok(result);
    }


    //Buscar por id

    @Override
    public ResponseEntity<Citas> buscarPorId(String id) {
        Optional<Citas> citaopt =citaRepository.findById(id.toString());
        return citaopt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    //Modificar

    @Override
    public ResponseEntity<Citas> modificar(Citas cita, HttpHeaders headers) {
        if (cita.getId() ==null) {
            return ResponseEntity.badRequest().build();
        }
        if(!citaRepository.existsById(cita.getId())){
            return ResponseEntity.notFound().build();
        }
        Citas result = citaRepository.save(cita);
        return ResponseEntity.ok(result);

    }

    @Override
    public boolean existsById(String id) {
        return citaRepository.existsById(id);
    }


    //Eliminar
    @Override
    public ResponseEntity<Citas> eliminar(String id) {
        if(!citaRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        citaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }



}
