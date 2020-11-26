package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.controllers.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectionController {
    private final GreetingService greetingService;

    public ConstructorInjectionController(
            @Qualifier("constructorInjectedGreetingService")GreetingService greetingService) {

        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
