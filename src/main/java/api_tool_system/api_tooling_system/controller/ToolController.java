package api_tool_system.api_tooling_system.controller;


import api_tool_system.api_tooling_system.ferramenta.DadosCadastroTool;
import api_tool_system.api_tooling_system.ferramenta.Tool;
import api_tool_system.api_tooling_system.ferramenta.ToolRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tool")
public class ToolController {

    @Autowired
    ToolRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosCadastroTool dados){

        repository.save(new Tool(dados));

    }



}
