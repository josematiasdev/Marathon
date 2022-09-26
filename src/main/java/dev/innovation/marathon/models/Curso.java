package dev.innovation.marathon.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class Curso {
    String nome;
    String ementa;
    String descricao;
    List<Disciplina> grade;
}
