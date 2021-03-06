package com.minskrotterdam.randomuser

import org.junit.jupiter.api.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
class RandomUserControllerIntegrationTests {
    @Autowired
    private val mvc: MockMvc? = null

    @Test
    fun getRandomUserIT() {
        mvc?.perform(get("/randomuser").contentType(MediaType.APPLICATION_JSON))
                ?.andExpect(status().isOk)
                ?.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                ?.andExpect(jsonPath("$.results[0].name").isNotEmpty)
    }

}
