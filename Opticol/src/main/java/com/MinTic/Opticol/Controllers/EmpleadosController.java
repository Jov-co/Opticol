package com.MinTic.Opticol.Controllers;

import com.MinTic.Opticol.Entities.Empleados;
import com.MinTic.Opticol.Services.EmpleadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/empleado")
public class EmpleadosController {

    @Autowired
    EmpleadosService empleadosService;

    @PostMapping(value = "/save")
    public ResponseEntity<Empleados> save(@RequestBody Empleados empleado) {
        Empleados obj = empleadosService.crearEmpleado(empleado);
        if (obj != null) {
            return ResponseEntity.ok(obj);
        } else {
            return ResponseEntity.notFound().build();
        }

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Empleados> delete(@PathVariable String id) {
        return empleadosService.EliminarEmpleado(id);
    }

    @GetMapping("/list/{id}")
    public ResponseEntity<Empleados> findById(@PathVariable String id) {
        return empleadosService.buscarEmpleado(id);
    }

    @GetMapping("/list")
    public ResponseEntity<List<Empleados>> findAll() {
        return empleadosService.listarEmpleados();
    }

    @PutMapping("/update")
    public ResponseEntity<Empleados> update(@RequestBody Empleados empleado) {
        return empleadosService.actualizarEmpleado(empleado);
    }
}
