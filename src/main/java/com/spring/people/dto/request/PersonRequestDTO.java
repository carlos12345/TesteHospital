package com.spring.people.dto.request;

import java.time.LocalTime;
import java.util.Date;

import lombok.Getter;

@Getter
public class PersonRequestDTO {

    private String name;

    private Date dataNasc;

    private String cpf;


    private Integer age;
    
    private String rua;
    
    private Integer numero;
    
    private String complemento;
    
    private String bairro;
    
    private String estado;
    
    private String cidade;
    
    private String cep;

    private LocalTime hora;
    
    

	public void setName(String name) {
		this.name = name;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

    
}
