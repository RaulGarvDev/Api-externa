package com.example.principal.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.principal.entidades.SuperHero;
import com.example.principal.repositorios.Repositorio;

@Service
public class ServicioSuper2 implements ServicioSuper{


@Autowired
private Repositorio repo;


    @Override
    public List<SuperHero> getTask() {

        return  (List<SuperHero>) repo.findAll();
    }


    @Override
    public SuperHero superHeroCreate(SuperHero a) {
       return repo.save(a);   
    }

  
    
}
