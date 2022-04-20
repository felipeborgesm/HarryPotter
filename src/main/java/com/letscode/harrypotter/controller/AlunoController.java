package com.letscode.harrypotter.controller;

import com.letscode.harrypotter.dto.GetAlunoResponse;
import com.letscode.harrypotter.dto.AlunoRequest;
import com.letscode.harrypotter.dto.PostAlunoResponse;
import com.letscode.harrypotter.services.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.websocket.server.PathParam;

@RestController
@RequiredArgsConstructor
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public PostAlunoResponse createAluno(@Valid @RequestBody AlunoRequest alunoRequest) {
        return alunoService.create(alunoRequest);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public GetAlunoResponse findById(@PathParam("id") Long Id) {
        return alunoService.findById(Id);
    }
}
