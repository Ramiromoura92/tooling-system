package api_tool_system.api_tooling_system.ferramenta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizarTool(

                                 @NotNull
                                 Long id,

                                 @NotBlank
                                 String num_peca,

                                 @NotBlank
                                 String descricao,

                                 @NotBlank
                                 String quantidade,

                                 @NotBlank
                                 @Pattern(regexp = "\\d{4,6}")
                                 String locacao
)
{

}
