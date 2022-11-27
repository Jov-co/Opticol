package com.MinTic.Opticol.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


    @Document(collection = "citas")
    @NoArgsConstructor
    @AllArgsConstructor
    @Setter
    @Getter
    public class Citas {

        //Atributos
        @Id
        private String id;
        private String fecha;
        private String hora;
        private String tipoCita;
        private String estadoCita;
        private Pacientes paciente;
        private Object profesionalMedico;

    }

