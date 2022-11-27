package com.MinTic.Opticol.Services;

import com.MinTic.Opticol.Entities.Pacientes;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PacienteService  {

    public List<Pacientes> listar();
    public ResponseEntity<Object> guardar (Pacientes paciente);

    public ResponseEntity<Pacientes> buscarPorId (String id);

    public ResponseEntity<Pacientes> modificarPaciente(Pacientes paciente, HttpHeaders headers);
    public boolean existsById (String id);

    public ResponseEntity<Pacientes>eliminarPaciente(String id);
}
