package com.MinTic.Opticol.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "horarios")
public class Horario {

    private String id;
    private LocalDateTime fechaHora;
    private Pacientes pacientes;
    private Empleados empleados;
}
