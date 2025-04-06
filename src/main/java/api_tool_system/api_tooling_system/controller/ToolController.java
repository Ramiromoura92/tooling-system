package api_tool_system.api_tooling_system.controller;


import api_tool_system.api_tooling_system.ferramenta.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tool")
public class ToolController {

    @Autowired
    ToolRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTool dados){

        repository.save(new Tool(dados));

    }


    @GetMapping
    public Page<DadosListagemTool> listar(Pageable paginacao){

        return repository.findAll(paginacao).map(DadosListagemTool::new);

    }


    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarTool dados){

        var tool = repository.getReferenceById(dados.id());
        tool.atualizarInformacoes(dados);

    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){

        repository.deleteById(id);

    }

}
