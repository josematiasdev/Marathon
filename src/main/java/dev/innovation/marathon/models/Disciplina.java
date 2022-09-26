package dev.innovation.marathon.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Timer;

@Data
@AllArgsConstructor
public class Disciplina {
    private String nome;
    private String ementa;
    private String descricao;
    private Disciplina dependente;
    private Timer cargaHoraria;
}
