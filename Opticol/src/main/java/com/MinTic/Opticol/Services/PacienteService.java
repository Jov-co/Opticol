package com.MinTic.Opticol.Services;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.MinTic.Opticol.models.Pacientes;

import java.util.List;

@Service
public interface PacienteService  {

    public List<Pacientes> listar();
    public ResponseEntity<Object> guardar (Pacientes paciente,  HttpHeaders headers);

    public ResponseEntity<Pacientes> buscarPorId (String id);

    public ResponseEntity<Pacientes> modificarPaciente(Pacientes paciente, HttpHeaders headers);
    public boolean existsById (String id);

    public ResponseEntity<Pacientes>eliminarPaciente(String id);
}
