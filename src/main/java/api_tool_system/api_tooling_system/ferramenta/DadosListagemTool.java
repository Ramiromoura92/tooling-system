package api_tool_system.api_tooling_system.ferramenta;

import jakarta.validation.constraints.Pattern;

public record DadosListagemTool(

                                    String num_ativo,
                                    String num_peca,
                                    String num_equipamento,
                                    String descricao,
                                    String quantidade,

                                    @Pattern(regexp = "\\d{4,6}")
                                    String locacao
                                ){

    public DadosListagemTool(Tool tool){

    this(
            tool.getNum_ativo(),
            tool.getNum_peca(),
            tool.getNum_equipamento(),
            tool.getDescricao(),
            tool.getQuantidade(),
            tool.getLocacao());


    }

}

