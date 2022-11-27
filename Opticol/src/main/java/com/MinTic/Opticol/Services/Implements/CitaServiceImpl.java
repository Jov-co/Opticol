package com.MinTic.Opticol.Services.Implements;

import com.MinTic.Opticol.Entities.Citas;
import com.MinTic.Opticol.Repository.CitaRepository;
import com.MinTic.Opticol.Services.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {


    @Autowired
    private CitaRepository citaRepository;
    @Override
    public List<Citas> listar() {
        return citaRepository.findAll();
    }

    @Override
    public ResponseEntity<Object> guardar(Citas cita, HttpHeaders headers) {
        return null;
    }
}
