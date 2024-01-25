package org.launchcode.enumerableplanets;

import org.junit.jupiter.api.Test;
import org.launchcode.enumerableplanets.data.Planets;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EnumerableplanetsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void enumsAreWorking(){
		assertEquals(Planets.values().length, 8);
	}

	@Test
	void enumsValueTest(){
		assertEquals(Planets.EARTH.getName(), "Earth");
	}

}
