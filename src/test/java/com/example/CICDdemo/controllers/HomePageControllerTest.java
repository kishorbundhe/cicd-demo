package com.example.CICDdemo.controllers;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HomePageController.class)
public class HomePageControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void showHelloWorldWhenHelloWorldEndPointIsHit() throws Exception {

        ResultActions resultActions = mockMvc.perform(get("/helloworld")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        String response;
        response = resultActions.andReturn()
                .getResponse()
                .getContentAsString();
        String helloKishor = "Hello Kishor";
        assertEquals(response, helloKishor);
    }
}
