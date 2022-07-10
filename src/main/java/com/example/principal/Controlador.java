package com.example.principal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/toDoList")
public class Controlador {

  @Autowired
  private ServicioSuper servicio;

  @GetMapping("/tasks")
	
   public List <SuperHero> getTask() {

    return servicio.getTask();
   }


   @PostMapping("/post")
   public SuperHero superHeroCreate(@RequestParam String name, @RequestParam String img) {
        SuperHero a = new SuperHero(name,img);
       return servicio.superHeroCreate(a);
       
   }






	}


