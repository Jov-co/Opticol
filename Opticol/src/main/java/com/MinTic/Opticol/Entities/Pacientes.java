package com.MinTic.Opticol.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "pacientes")
public class Pacientes {

    private String id;
    private String nombre;
    private String telefono;
    private String correo;
    private ArrayList<Horario> horarios;

}
