package tacos;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(HomeController.class)
/*
WebMvcTest is an annotation provided by String to run a test in the context of Spring application. In our case
it registers HomeController in order to us throw requests.
 */
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMcv; // Object for test

    @Test
    public void testHomePage() throws Exception{
        /*
        Method that define te test we aim to run.
         */
        mockMcv.perform(get("/")) // Object mockMcv perform a get request
                .andExpect(status().isOk()) // AND expected result is 200(OK)
                .andExpect(view().name("home")) // AND view should have a name 'home'
                .andExpect(content().string(containsString("Welcome to..."))); //AND render the string "WWelcome to..."
    }
}
