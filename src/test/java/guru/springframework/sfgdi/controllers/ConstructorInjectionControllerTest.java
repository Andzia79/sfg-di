package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.controllers.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectionControllerTest {

    ConstructorInjectionController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectionController(new ConstructorInjectedGreetingService());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}