package com.MinTic.Opticol.Services;

import com.MinTic.Opticol.Entities.Citas;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


    @Service
    public interface CitaService  {
        public List<Citas> listar();

        public ResponseEntity<Object> guardar (Citas cita, HttpHeaders headers);

      //  public ResponseEntity<Citas> buscarPorId (String id);

        //public ResponseEntity<Citas> modificar(Citas cita, HttpHeaders headers);
       // public boolean existsById (String id);

       // public ResponseEntity<Citas>eliminar(String id);
    }

