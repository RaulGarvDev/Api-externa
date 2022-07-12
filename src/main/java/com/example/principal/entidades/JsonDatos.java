package com.example.principal.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class JsonDatos {

    private Long userId;
    private Long id;
    private String title;
    private Boolean completed;

    public JsonDatos(){}

    
}
