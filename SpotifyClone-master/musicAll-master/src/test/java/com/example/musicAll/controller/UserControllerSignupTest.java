package com.example.musicAll.controller;

import com.example.musicAll.Config.JwtUtil;
import com.example.musicAll.Controller.UserController;
import com.example.musicAll.Service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerSignupTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserServiceImpl userServiceImpl;

    @MockBean
    private JwtUtil jwtUtil;

    @Test
    public void signup_Success() throws Exception {
        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/user/signup")
                .contentType(MediaType.APPLICATION_JSON)
                .content(createNewUserInJson("testSignupUser", "testingSignup", "ROLE_USER"));

        when(userServiceImpl.createUser(any())).thenReturn("signupToken123");

        MvcResult result = mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().json("{\"token\" : \"signupToken123\"}"))
                .andReturn();


        System.out.println(result.getResponse().getContentAsString());
    }

    private static String createNewUserInJson(String name, String password, String role) {
        return "{  \"name\" : \"" + name + "\"," +
                "\"password\" : \"" + password + "\"}";
    }

}