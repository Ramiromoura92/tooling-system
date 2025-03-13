package api_tool_system.api_tooling_system.controller;


import api_tool_system.api_tooling_system.ferramenta.DadosCadastroTool;
import api_tool_system.api_tooling_system.ferramenta.DadosListagemTool;
import api_tool_system.api_tooling_system.ferramenta.Tool;
import api_tool_system.api_tooling_system.ferramenta.ToolRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tool")
public class ToolController {

    @Autowired
    ToolRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroTool dados){

        repository.save(new Tool(dados));

    }

    @GetMapping
    public Page<DadosListagemTool> listar(Pageable paginacao){

        return repository.findAll(paginacao).map(DadosListagemTool::new);

    }

}
