package com.MinTic.Opticol.Services;


import com.MinTic.Opticol.Entities.Empleados;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpleadosService {

    public Empleados crearEmpleado(Empleados empleado);

    public ResponseEntity<Empleados> buscarEmpleado(String id);

    public ResponseEntity<List<Empleados>> listarEmpleados();

    public ResponseEntity<Empleados> EliminarEmpleado(String id);

    public ResponseEntity<Empleados> actualizarEmpleado(Empleados empleado);

    @Service
    interface PacienteService  {

        public List<Pacientes> listar();
        public ResponseEntity<Object> guardar (Pacientes paciente, HttpHeaders headers);

        public ResponseEntity<Pacientes> buscarPorId (String id);

        public ResponseEntity<Pacientes> modificarPaciente(Pacientes paciente, HttpHeaders headers);
        public boolean existsById (String id);

        public ResponseEntity<Pacientes>eliminarPaciente(String id);
    }
}
