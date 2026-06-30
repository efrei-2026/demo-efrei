package com.efrei.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    // Test DemoApplication
    @Test
    void contextLoads() {
        // Test de chargement du contexte Spring Boot
    }

    // Test HelloWorldController - endpoint GET /
    @Test
    void helloWorldReturnsCorrectMessage() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello, World!"));
    }

    // Test HelloWorldController - vérification du contenu
    @Test
    void helloWorldReturnsNotNull() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string(org.hamcrest.Matchers.notNullValue()));
    }
}