package api_tool_system.api_tooling_system.controller;

import api_tool_system.api_tooling_system.colaborador.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository repository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroEmployee dadosCadastroEmployee) {

        repository.save(new Employees(dadosCadastroEmployee));

    }

    @GetMapping
    public List<DadosListagemEmployee> listar() {
        return repository.findAll().stream().map(DadosListagemEmployee::new).toList();
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarEmployee dados){

        var employee = repository.getReferenceById(dados.id());
        employee.dadosAtualizarEmployee(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){

        repository.deleteById(id);

    }
}
