package com.spring.people.entity;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_people")
@NoArgsConstructor
@Getter
@Setter
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "cpf", nullable = false, unique = true)
    private String cpf;

    @Column(name = "age", nullable = false)
    private Integer age;
    
    @Column(name = "dataNasc", nullable = false, unique = true)
    private Date dataNasc;

    @Column(name = "rua", nullable = false, unique = true)
    private String rua;
    
    @Column(name = "numero", nullable = false, unique = true)
	private Integer numero;
    
	@Column(name = "complemento")
	private String complemento;
	
	@Column(name = "bairro", nullable = false, unique = true)
	private String bairro;
	
	@Column(name = "cidade", nullable = false, unique = true)
	private String cidade;
	
    @Column(name = "estado", nullable = false, unique = true)
	private String estado;
    
	@Column(name = "cep", nullable = false, unique = true)
	private String cep;
	@Column(name = "hora")
	private LocalTime hora = LocalTime.now();
	
    
    @Builder
    public Person(String name, String cpf, Integer age, Date dataNasc,
    		String rua, Integer numero, String complemento, String bairro,
    		String cidade, String estado, String cep, LocalTime hora) {
        this.name = name;
        this.cpf = cpf;
        this.age = age;
        this.dataNasc = dataNasc;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.hora = hora;
    }

	public void setId(Long id) {
		this.id = id;
	}
    

}
