package com.MinTic.Opticol.Services;

import org.springframework.stereotype.Service;

@Service
public interface PacienteService  {

    public List<Pacientes> listar();
    public ResponseEntity<Object> guardar (Pacientes paciente, HttpHeaders headers);

    public ResponseEntity<Pacientes> buscarPorId (String id);

    public ResponseEntity<Pacientes> modificarPaciente(Pacientes paciente, HttpHeaders headers);
    public boolean existsById (String id);

    public ResponseEntity<Pacientes>eliminarPaciente(String id);
}
