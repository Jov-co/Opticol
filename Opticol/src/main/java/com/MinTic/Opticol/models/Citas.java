package com.MinTic.Opticol.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


    @Document(collection = "citas")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    public class Citas {

        //Atributos
        @Id
        private String id;
        private String fecha;
        private String hora;
        private String nombre;
        private String telefono;
        private String tipoCita;
        private String estadoCita;

        //private Object profesionalMedico;

    }

