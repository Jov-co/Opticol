package com.MinTic.Opticol.Controllers;

import com.MinTic.Opticol.Entities.Citas;
import com.MinTic.Opticol.Services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/api")
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




    }

