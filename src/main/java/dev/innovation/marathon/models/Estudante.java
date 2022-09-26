package dev.innovation.marathon.models;

import dev.innovation.marathon.models.enums.Turno;
import dev.innovation.marathon.models.enums.Sexo;

import lombok.Data;

@Data
public class Estudante {
    private String nome;
    private String sobrenome;
    private Integer idade;
    private Double salario;
    private Turno turno;
    private Sexo sexo;

    public Estudante(){}

    public Estudante(String nome,
                     String sobrenome,
                     int idade,
                     double salario,
                     Turno turno,
                     Sexo sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.salario = salario;
        this.turno = turno;
        this.sexo = sexo;
    }
}