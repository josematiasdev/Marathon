package dev.innovation.marathon.models;

import dev.innovation.marathon.models.enums.Turno;
import dev.innovation.marathon.models.enums.Sexo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Estudante {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private Double salario;
    private Turno turno;
    private Sexo sexo;

}