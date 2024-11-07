package com.spring.people.dto.response;


import java.time.LocalTime;
import java.util.Date;

import com.spring.people.entity.Person;
import lombok.Getter;

@Getter
public class PersonResponseDTO {

    private Long id;

    private String name;

    private Date dataNac;
    
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

    public PersonResponseDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.cpf = person.getCpf();
        this.age = person.getAge();
        this.dataNac = person.getDataNasc();
        this.rua = person.getRua();
        this.numero = person.getNumero();
        this.complemento = person.getComplemento();
        this.bairro = person.getBairro();
        this.cidade = person.getCidade();
        this.estado = person.getEstado();
        this.cep = person.getCep();
        this.hora = person.getHora();
        		
    }


}
