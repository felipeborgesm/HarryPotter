package com.letscode.harrypotter.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class AlunoRequest {
    @NotBlank
    private String nome;
    @NotBlank
    private String serie;
}
