package com.letscode.harrypotter.dto;

import com.letscode.harrypotter.model.Aluno;
import com.letscode.harrypotter.dto.clients.CasaInfo;
import lombok.Data;

@Data
public class GetAlunoResponse {

  private Long id;
  private String nome;
  private String serie;
  private CasaInfo casa;

  public GetAlunoResponse(Aluno aluno) {
    this.id = aluno.getId();
    this.nome = aluno.getNome();
    this.serie = aluno.getSerie();

  }
}
