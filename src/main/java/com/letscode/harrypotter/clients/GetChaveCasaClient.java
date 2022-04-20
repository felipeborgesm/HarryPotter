package com.letscode.harrypotter.clients;

import com.letscode.harrypotter.dto.clients.CasaSeletoraChave;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetChaveCasaClient {
  public CasaSeletoraChave execute() {
    RestTemplate restTemplate = new RestTemplate();

    HttpHeaders headers = new HttpHeaders();
    headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

    HttpEntity<?> entity = new HttpEntity<>(headers);

    ResponseEntity<CasaSeletoraChave> casaInfoResponseEntity =
        restTemplate.exchange(
            "https://api-harrypotter.herokuapp.com/sortinghat",
            HttpMethod.GET,
            entity,
            CasaSeletoraChave.class
        );

    return casaInfoResponseEntity.getBody();
  }
}
