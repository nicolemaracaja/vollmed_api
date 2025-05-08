package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.endereco.DadosEndereco;

//Record é uma classe imutável, contendo apenas atributos, construtor e métodos de leitura
public record DadosCadastroMedico(

        @NotBlank(message = "{nome.obrigatorio}")//verifica se não é nulo e nem vazio
        String nome,

        @NotBlank(message = "{email.obrigatorio}")
        @Email (message = "{email.invalido}")//formato de um email
        String email,

        @NotBlank(message = "{telefone.obrigatorio}")
        String telefone,

        @NotBlank(message = "{crm.obrigatorio}")
        @Pattern(regexp = "\\d{4,6}", message = "{crm.invalido}")//uma expressão regular de 4 a 6 dígitos
        String crm,

        @NotNull(message = "{especialidade,obrigatoria}")//notBlank é só para strings
        Especialidade especialidade,

        @NotNull(message = "{endereco.obrigatorio}")
        @Valid DadosEndereco endereco) {
}
