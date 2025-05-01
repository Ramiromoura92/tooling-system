package api_tool_system.api_tooling_system.colaborador;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizarEmployee(
        @NotNull
        Long id,

        @NotNull
        String nome,

        @NotNull
        Position cargo) {
}
