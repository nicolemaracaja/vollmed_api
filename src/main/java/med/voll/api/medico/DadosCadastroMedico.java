package med.voll.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

//Record é uma classe imutável, contendo apenas atributos, construtor e métodos de leitura
public record DadosCadastroMedico(

        @NotBlank //verifica se não é nulo e nem vazio
        String nome,

        @NotBlank
        @Email //formato de um email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //uma expressão regular de 4 a 6 dígitos
        String crm,

        @NotNull //notBlank é só para strings
        Especialidade especialidade,

        @NotNull @Valid DadosEndereco endereco) {
}
