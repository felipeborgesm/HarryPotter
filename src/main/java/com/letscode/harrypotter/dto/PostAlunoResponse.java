package com.letscode.harrypotter.dto;

import com.letscode.harrypotter.dto.clients.CasaInfo;
import com.letscode.harrypotter.model.Aluno;
import lombok.Data;

import java.util.UUID;

@Data
public class PostAlunoResponse {
    private Long id;
    private String nome;
    private String serie;
    private UUID casa;

    public PostAlunoResponse(Aluno aluno) {
        this.id = aluno.getId();
        this.nome = aluno.getNome();
        this.serie = aluno.getSerie();
        this.casa = aluno.getChaveCasa();
    }
}
