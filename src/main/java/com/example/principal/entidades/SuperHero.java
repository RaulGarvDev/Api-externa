package com.example.principal.entidades;


import java.io.Serializable;


import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="superheroe")
public class SuperHero implements Serializable{


	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private String image;
	
	public SuperHero(){}

    public SuperHero(String name, String img){
            this.name = name;
            this.image = img;
    }
	

   



}