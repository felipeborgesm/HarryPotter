package com.letscode.harrypotter.dto.clients;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.UUID;

@Data
public class CasaSeletoraChave {
    @JsonProperty("sorting-hat-choice")
    private UUID chave;
}
