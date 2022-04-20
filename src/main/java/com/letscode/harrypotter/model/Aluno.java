package com.letscode.harrypotter.model;

import lombok.Data;
import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String serie;
    private UUID chaveCasa;
}
