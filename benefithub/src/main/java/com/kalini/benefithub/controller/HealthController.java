package com.kalini.benefithub.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kalini.benefithub.dto.HealthResponse;

/*O Postman faz uma requisição GET, o DispatcherServlet recebe e encontra o método 
  do Controller através do @GetMapping. O método retorna um ResponseEntity com status 
  200 e um HealthResponse no corpo, e o Jackson transforma esse objeto em JSON." */

/*Controller é a camada responsável por receber as requisições 
  HTTP e direcioná-las para o código que deve processá-las e gerar a resposta.*/
@RestController
@RequestMapping("/api")
public class HealthController {

    @GetMapping("/health")
    //"Esse método vai devolver uma resposta HTTP cujo corpo será um HealthResponse."//
    public ResponseEntity<HealthResponse> health() {
      //"Monte uma resposta HTTP 200(.ok) OK e coloque esse HealthResponse no corpo dela."//
      return ResponseEntity.ok(new HealthResponse("benefithub", "1.0.0", "UP"));
    }
}
