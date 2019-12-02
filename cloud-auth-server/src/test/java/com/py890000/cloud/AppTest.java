package com.py890000.cloud;

import com.py890000.cloud.auth.OathServerApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Unit test for simple OathServerApp.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = OathServerApp.class)
public class AppTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders
                .webAppContextSetup(context)
                .build();

    }

    @Test
    public void shouldAnswerWithTrue() throws Exception {
        String url = "";
        String token = "";
        this.mockMvc
                .perform(post(url).header("Authorization", token))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.firstName").value("firstName2"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.lastName").value("lastName2"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.email").value("email2@mail.com"));
    }
}
