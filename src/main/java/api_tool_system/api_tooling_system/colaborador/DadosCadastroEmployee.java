package api_tool_system.api_tooling_system.colaborador;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroEmployee(

        @NotBlank
        String nome,

        @NotBlank
        @Pattern(regexp = "\\d{6}")
        String matricula,

        @NotNull
        Position cargo
)
{ }
