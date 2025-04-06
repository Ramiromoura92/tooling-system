package api_tool_system.api_tooling_system.ferramenta;


import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Tools")
@Entity(name = "Tool")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Tool {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String num_ativo;
    private String num_peca;
    private String num_equipamento;
    private String descricao;
    private String quantidade;
    private String locacao;


    public Tool(DadosCadastroTool dados) {

        this.num_ativo = dados.num_ativo();
        this.num_peca = dados.num_peca();
        this.num_equipamento = dados.num_equipamento();
        this.descricao = dados.descricao();
        this.quantidade = dados.quantidade();
        this.locacao = dados.locacao();
    }

    public void atualizarInformacoes(@Valid DadosAtualizarTool dados) {

        if(dados.num_peca() != null){
            this.num_peca = dados.num_peca();
        }
        if(dados.descricao() != null) {
            this.descricao = dados.descricao();
        }
        if(dados.quantidade() != null) {
            this.quantidade = dados.quantidade();
        }
        if(dados.locacao() != null){
            this.locacao = dados.locacao();
        }

    }


    public void excluir() {




    }
}
