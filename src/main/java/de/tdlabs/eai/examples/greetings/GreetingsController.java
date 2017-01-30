package de.tdlabs.eai.examples.greetings;

import lombok.RequiredArgsConstructor;
import org.apache.camel.ProducerTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
class GreetingsController {

  private final ProducerTemplate producerTemplate;

  @GetMapping("/api/greet")
  String greet(@RequestParam(defaultValue = "World") String name){

    //send to kafka ...

    String greeting = "Hello " + name + " " + LocalDateTime.now();

    producerTemplate.sendBody("direct:greetings", greeting);

    return greeting;
  }
}
