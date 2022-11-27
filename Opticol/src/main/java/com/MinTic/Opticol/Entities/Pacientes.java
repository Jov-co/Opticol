package com.MinTic.Opticol.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document(collection = "pacientes")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Pacientes {

    //Atributos

    @Id
    private String id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private String telefono;

}
