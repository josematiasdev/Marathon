package dev.innovation.marathon.bean;

import dev.innovation.marathon.models.Estudante;
import dev.innovation.marathon.models.enums.Sexo;
import dev.innovation.marathon.models.enums.Turno;
import lombok.Data;

import javax.inject.Named;
import java.io.Serializable;

@Data
@Named
public class EstudanteCadastrarBean implements Serializable {
    Estudante estudante = new Estudante("Jose", "Matias",
            26,700.00, Turno.MATUTINO, Sexo.MASCULINO);


}
