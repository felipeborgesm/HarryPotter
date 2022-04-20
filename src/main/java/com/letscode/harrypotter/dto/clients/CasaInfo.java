package com.letscode.harrypotter.dto.clients;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.List;
import java.util.UUID;

@Data
public class CasaInfo {
    private UUID id;
    @JsonProperty("name")
    private String nome;
    private String animal;
    @JsonProperty("founder")
    private String fundador;
    @JsonProperty("values")
    private List<Value> valores;
}
