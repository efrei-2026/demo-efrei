package com.efrei.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // Test de chargement du contexte Spring Boot
    }

    @Test
    void helloControllerReturnsHelloWorld() {
        HelloWorldController controller = new HelloWorldController();
        String result = controller.sayHello();
        assertEquals("Hello, World!", result);
    }
}