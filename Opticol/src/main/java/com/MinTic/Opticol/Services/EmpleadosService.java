package com.MinTic.Opticol.Services;


import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.MinTic.Opticol.models.Empleados;

import java.util.List;

public interface EmpleadosService {

    public Empleados crearEmpleado(Empleados empleado);

    public ResponseEntity<Empleados> buscarEmpleado(String id);

    public ResponseEntity<List<Empleados>> listarEmpleados();

    public ResponseEntity<Empleados> EliminarEmpleado(String id);

    public ResponseEntity<Empleados> actualizarEmpleado(Empleados empleado);

   }
