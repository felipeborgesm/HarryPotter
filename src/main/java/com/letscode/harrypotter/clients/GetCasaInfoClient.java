package com.letscode.harrypotter.clients;

import com.letscode.harrypotter.dto.clients.CasaInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.UUID;

@Service
public class GetCasaInfoClient {

  public CasaInfo execute(UUID chave) {
    RestTemplate restTemplate = new RestTemplate();

    HttpHeaders headers = new HttpHeaders();
    headers.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);

    HttpEntity<?> entity = new HttpEntity<>(headers);

    ResponseEntity<CasaInfo> casaInfoResponseEntity =
        restTemplate.exchange(
            "https://api-harrypotter.herokuapp.com/house/{chave}",
            HttpMethod.GET,
            entity,
            CasaInfo.class,
            chave
        );

    return casaInfoResponseEntity.getBody();
  }
}
