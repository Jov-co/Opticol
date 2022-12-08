package com.MinTic.Opticol.Controllers;

import com.MinTic.Opticol.Services.CitaService;
import com.MinTic.Opticol.models.Citas;

import com.MinTic.Opticol.models.Pacientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api")
    @CrossOrigin(origins = "http://localhost:4200")
    public  class CitaController {


        //Instanciar Cita Services
        @Autowired
        private CitaService citaService;
        
        //Listar todos los pacientes
        @GetMapping("/citas")
        public List<Citas> findAll(){
            return citaService.listar();
        }

        //Agregar cita
        @PostMapping("/citas")
        public ResponseEntity<Object> create(@RequestBody Citas cita, @RequestHeader HttpHeaders headers){
            return citaService.guardar(cita, headers);
        }

        //Buscar cita por id
        @GetMapping("/citas/{id}")
        public ResponseEntity<Citas> findById(@PathVariable String id){
            return citaService.buscarPorId(id);
        }

        //Modificar Paciente por id
        @PutMapping("/citas")
        public ResponseEntity<Citas> update(@RequestBody Citas cita, @RequestHeader HttpHeaders headers){
            return citaService.modificar(cita, headers);
        }

        //Eliminar por id
        @DeleteMapping("/citas/{id}")
        public ResponseEntity<Citas> delete(@PathVariable String id){
            return citaService.eliminar(id);
        }



    }

