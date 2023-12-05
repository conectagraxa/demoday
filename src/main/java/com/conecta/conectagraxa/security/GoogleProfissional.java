package com.conecta.conectagraxa.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "google_profissional")
@Data
@NoArgsConstructor

public class GoogleProfissional {

	@Id
	private Integer id;
	private String email;
	private String name;
	private Boolean logado;



}
