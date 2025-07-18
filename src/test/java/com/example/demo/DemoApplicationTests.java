package com.example.demo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Disabled("Disabled until Docker DB is running")
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
