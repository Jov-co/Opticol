package com.MinTic.Opticol.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pacientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pacientes {

    @Id
    private String id;
    private String nombre;
    private String telefono;
    private String correo;

}
