package de.tdlabs.eai.examples.greetings;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

@Component
public class GreetingTransformer {

  public String makeInformal(String payload){
    return payload.replace("Hello", "Hi");
  }

  public String makeFancy(String payload){

//    LockSupport.parkNanos(TimeUnit.SECONDS.toNanos(5));

    return payload + " <3 \\o/";
  }
}
