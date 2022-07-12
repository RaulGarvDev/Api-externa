package com.example.principal.controladores;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.principal.entidades.JsonDatos;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ControladorJson {

    private final RestTemplate restTemplate;


    @Autowired
    public ControladorJson(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @GetMapping("/test")
        public JsonDatos getApi(){

            String url = "https://jsonplaceholder.typicode.com/todos/1";
            JsonDatos json = restTemplate.getForObject(url, JsonDatos.class);

            log.info("El objeto" + json);
            System.out.println("Holaaa ///");
            return json;

        }


        @GetMapping("/test/list")
        public List<JsonDatos> todosLosJson(){

            String url = "https://jsonplaceholder.typicode.com/todos";
            JsonDatos [] jsonTodos = restTemplate.getForObject(url, JsonDatos[].class);


            return Arrays.asList(jsonTodos);
            
        }
    

    
}
