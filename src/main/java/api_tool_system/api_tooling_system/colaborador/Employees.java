package api_tool_system.api_tooling_system.colaborador;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Employee")
@Entity(name = "Employee")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String matricula;
    @Enumerated(EnumType.STRING)
    private Position cargo;


    public Employees(DadosCadastroEmployee dadosCadastroEmployee){

        this.nome = dadosCadastroEmployee.nome();
        this.matricula = dadosCadastroEmployee.matricula();
        this.cargo = dadosCadastroEmployee.cargo();

    }


    public void dadosAtualizarEmployee(DadosAtualizarEmployee dados){

        if(dados.nome() != null){
            this.nome = dados.nome();
        }
        if(dados.cargo() != null){
            this.cargo = dados.cargo();
        }

    }

}
