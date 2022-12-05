package com.MinTic.Opticol.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "empleados")
public class Empleados {

    private String id;
    private String rol;
    private String nombre;
    private String especialidad;
    private String telefono;
    private String correo;
    //private ArrayList<Horario> horarios;




}
