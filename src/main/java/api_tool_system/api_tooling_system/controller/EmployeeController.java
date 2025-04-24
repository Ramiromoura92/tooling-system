package api_tool_system.api_tooling_system.controller;

import api_tool_system.api_tooling_system.colaborador.DadosCadastroEmployee;
import api_tool_system.api_tooling_system.colaborador.EmployeeRepository;
import api_tool_system.api_tooling_system.colaborador.Employees;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
}
