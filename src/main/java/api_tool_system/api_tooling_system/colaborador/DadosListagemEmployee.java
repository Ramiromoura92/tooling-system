package api_tool_system.api_tooling_system.colaborador;


public record DadosListagemEmployee(

        String nome,
        String matricula,
        Position cargo
)

{

    public DadosListagemEmployee(Employees employee){

        this(

                employee.getNome(),
                employee.getMatricula(),
                employee.getCargo()

        );



    }
    
}
