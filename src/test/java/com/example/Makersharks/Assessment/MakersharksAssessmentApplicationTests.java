package com.example.Makersharks.Assessment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.web.bind.annotation.PostMapping;

@SpringBootTest
@AutoConfigureMockMvc
class MakersharksAssessmentApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testSuppliers() throws Exception{
		mockMvc.perform(post("/api/supplier/query")
				.param("location", "India")
				.param("natureOfBusiness", "small_scale")
				.param("manufacturingProcess", "coating")
				.param("page", "0")
				.param("size", "10")

		)
				.andExpect(status().isOk())
				.andExpect(jsonPath("$.content", hasSize(lessThanOrEqualTo(10))));

	}

}
