package br.com.tokiomarine.seguradora.avaliacao.entidade;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
public class Estudante  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
     
    @NotBlank(message = "Nome é obrigatório")
    private String nome;
     
    @NotBlank(message = "Email é obrigatório")
    private String email;

    private String telefone;

    @NotBlank(message = "Matrícula é obrigatória")
    private String matricula;

    private String curso;

}
