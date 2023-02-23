package com.actions;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class actionsControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    void actions_Test() throws Exception {
        //given
        String test = "github actions test";
        //then
        mockMvc.perform(post("/controller/test").contentType(MediaType.ALL)) //MockMvc를 통해 /hello 주소로 GET 요청
                //mvc.perform()의 결과를 검증
                .andExpect(content().string(test)); //응답 본문의 내용을 검증
    }
}
