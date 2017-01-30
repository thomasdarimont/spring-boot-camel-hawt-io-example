package de.tdlabs.eai.examples.camel.routes;

import de.tdlabs.eai.examples.greetings.GreetingTransformer;
import lombok.RequiredArgsConstructor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
class ExampleRoutes extends RouteBuilder {

  private final GreetingTransformer greetingTransformer;

  @Override
  public void configure() throws Exception {

    from("timer:foo")
      .routeId("simpleTimer")
      .to("log:bar");

    from("direct:greetings")
      .routeId("greetings")
      .bean(greetingTransformer, "makeInformal").id("makeInformal")
      .bean(greetingTransformer, "makeFancy").id("makeFancy")
      .bean(greetingTransformer, "makeFancy").id("makeFancy2")
      .to("activemq:queue:example.greetings?jmsMessageType=Text")
       .id("greetingsQueue");

    from("activemq:queue:example.greetings?jmsMessageType=Text")
      .routeId("greetingsOutput")
      .to("log:greetings");
  }
}
