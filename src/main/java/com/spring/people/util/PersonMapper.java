package com.spring.people.util;

import com.spring.people.dto.request.PersonRequestDTO;
import com.spring.people.dto.response.PersonResponseDTO;
import com.spring.people.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public Person toPerson(PersonRequestDTO personDTO) {

        return Person.builder()
                .name(personDTO.getName())
                .cpf(personDTO.getCpf())
                .age(personDTO.getAge())
                .dataNasc(personDTO.getDataNasc())
                .rua(personDTO.getRua())
                .numero(personDTO.getNumero())
                .complemento(personDTO.getComplemento())
                .bairro(personDTO.getBairro())
                .cidade(personDTO.getCidade())
                .estado(personDTO.getEstado())
                .cep(personDTO.getCep())
                .hora(personDTO.getHora())
                .build();

    }

    public PersonResponseDTO toPersonDTO(Person person) {
        return new PersonResponseDTO(person);
    }

    public List<PersonResponseDTO> toPeopleDTO(List<Person> peopleList) {
        return peopleList.stream().map(PersonResponseDTO::new).collect(Collectors.toList());
    }

    public void updatePersonData(Person person, PersonRequestDTO personDTO) {

        person.setName(personDTO.getName());
        person.setCpf(personDTO.getCpf());
        person.setAge(personDTO.getAge());
        person.setDataNasc(personDTO.getDataNasc());
        person.setRua(personDTO.getRua());
        person.setNumero(personDTO.getNumero());
        person.setBairro(personDTO.getBairro());
        person.setComplemento(personDTO.getComplemento());
        person.setCidade(personDTO.getCidade());
        person.setEstado(personDTO.getEstado());
        person.setCep(personDTO.getCep());
        person.setHora(personDTO.getHora());

    }

}
