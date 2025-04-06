package api_tool_system.api_tooling_system.ferramenta;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroTool(

                                @NotBlank
                                @Pattern(regexp = "\\d{6,10}")
                                String num_ativo,

                                @NotBlank
                                @Pattern(regexp = "\\d{6,10}")
                                String num_peca,

                                @NotBlank
                                @Pattern(regexp = "\\d{6,10}")
                                String num_equipamento,

                                @NotBlank
                                String descricao,

                                @NotBlank
                                String quantidade,

                                @NotBlank
                                @Pattern(regexp = "\\d{4,6}")
                                String locacao) {
}
