package dev.innovation.marathon.bean;

import dev.innovation.marathon.models.Estudante;
import dev.innovation.marathon.models.enums.Sexo;
import dev.innovation.marathon.models.enums.Turno;
import lombok.Data;

import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import static java.util.Arrays.asList;

@Data
@Named
public class EstudanteCadastrarBean implements Serializable {

    private Estudante estudante = new Estudante("Jose", "Matias",
            26,700.00, Turno.MATUTINO, Sexo.MASCULINO);

    private String[] disciplinas = {"Matematica Aplicada", "Inteligecia Artificial", "Estatistica", "Probabilidade"};
    private List<String> livros = asList("Mateus", "Marcos", "Joao");

    public String primeiroElemento(){
        return this.disciplinas[0];
    }

    public String getLogin() {
        return "login";
    }
}
