package com.MinTic.Opticol.Services.Implements;

import com.MinTic.Opticol.Entities.Pacientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.MinTic.Opticol.Repository.PacientesRepository;
import com.MinTic.Opticol.Services.PacienteService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService {
    @Autowired
    private PacientesRepository pacienteRepository;


    //Listar todos los  Pacientes
    @Override
    @Transactional(readOnly = true)
    public List<Pacientes> listar() {
        return pacienteRepository.findAll();
    }

    //Agregar paciente nuevo
    @Override
    @Transactional(readOnly = false)

    public ResponseEntity<Object> guardar (Pacientes paciente){
        if(paciente.getId()!=null) {
            return ResponseEntity.badRequest().build();
        }
        Pacientes result= pacienteRepository.save(paciente);
        return ResponseEntity.ok(result);
    }

    //Buscar Paciente por Id
    @Override
    public ResponseEntity<Pacientes> buscarPorId(@PathVariable String id){
        Optional<Pacientes> pacienteopt =pacienteRepository.findById(id.toString());
        return pacienteopt.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public boolean existsById(String id) {
        return pacienteRepository.existsById(id);
    }

    //Eliminar Paciente por id
    @Override
    public ResponseEntity<Pacientes> eliminarPaciente(String id) {
        if(!pacienteRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        pacienteRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    //Modificar Paciente por
    @Override
    public ResponseEntity<Pacientes> modificarPaciente(Pacientes paciente, HttpHeaders headers) {

        if (paciente.getId() ==null) {
            return ResponseEntity.badRequest().build();
        }
        if(!pacienteRepository.existsById(paciente.getId())){
            return ResponseEntity.notFound().build();
        }
        Pacientes result = pacienteRepository.save(paciente);
        return ResponseEntity.ok(result);
    }




}