package com.MinTic.Opticol.Services.Implements;

import com.MinTic.Opticol.Entities.Empleados;
import com.MinTic.Opticol.Repository.EmpleadosRepository;
import com.MinTic.Opticol.Services.EmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadosServiceImpl implements EmpleadosService {

    @Autowired
    EmpleadosRepository empleadosRepository;

    @Override
    public Empleados crearEmpleado(Empleados empleado) {
        return empleadosRepository.save(empleado);

    }

    @Override
    public ResponseEntity<Empleados> buscarEmpleado(String id) {
        Optional<Empleados> empleados = empleadosRepository.findById(id);
        return empleados.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<List<Empleados>> listarEmpleados() {
        Optional<List<Empleados>> empleados = Optional.of(empleadosRepository.findAll());
        return empleados.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @Override
    public ResponseEntity<Empleados> EliminarEmpleado(String id) {
        Empleados obj = empleadosRepository.findById(id).orElse(null);
        if (obj != null) {
            empleadosRepository.deleteById(id);
        } else {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(obj);
    }

    @Override
    public ResponseEntity<Empleados> actualizarEmpleado(Empleados empleado) {
        Empleados obj = empleadosRepository.findById(empleado.getId()).orElse(null);
        if (obj != null) {
            empleadosRepository.deleteById(empleado.getId());
            empleadosRepository.save(empleado);
        } else {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(empleado);

    }

    @Service
    public static class CitaServicesImpl implements CitaService {

        //instanciar repository

        @Autowired
        private CitaRepository citaRepository;

        //Listar todas las citas
        @Override
        @Transactional(readOnly =true)
        public List<Citas> listar() {
            return citaRepository.findAll();
        }
        //Agregar cita

        @Override
        public ResponseEntity<Object> guardar(Citas cita, HttpHeaders headers) {
            if(cita.getId()!=null) {
                return ResponseEntity.badRequest().build();
            }
            Citas result= citaRepository.save(cita);
            return ResponseEntity.ok(result);
        }

    }
}
