package com.MinTic.Opticol.Controllers;

import com.MinTic.Opticol.Services.PacienteService;
import com.MinTic.Opticol.models.Pacientes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class PacienteController {

    @Autowired

    PacienteService pacienteService;
     //Metodos


    //CRUD Pacientes

    //Listar todos los pacientes
    @GetMapping("/pacientes")
    public List<Pacientes> findAll(){
        return pacienteService.listar();
    }
    //Agregar un Paciente
    @PostMapping("/pacientes")
    public ResponseEntity<Object> create (@RequestBody Pacientes paciente,  HttpHeaders headers){
        return pacienteService.guardar(paciente, headers);
    }
    //Buscar Paciente por id
    @GetMapping("/pacientes/{id}")
    public ResponseEntity<Pacientes> findById(@PathVariable String id){
        return pacienteService.buscarPorId(id);
    }
    //Modificar Paciente por id
    @PutMapping("/pacientes")
    public ResponseEntity<Pacientes> update(@RequestBody Pacientes paciente, @RequestHeader HttpHeaders headers){
        return pacienteService.modificarPaciente(paciente, headers);
    }
    //Eliminar por id
    @DeleteMapping("/pacientes/{id}")
    public ResponseEntity<Pacientes> delete(@PathVariable String id){
        return pacienteService.eliminarPaciente(id);
    }

    
}
