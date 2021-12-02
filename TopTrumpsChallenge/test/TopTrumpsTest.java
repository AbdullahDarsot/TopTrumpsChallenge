import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TopTrumpsTest {

	Audi A3 = new Audi("Audi", "A3", 2f, 130, 140, 6.6f, 24375);
	Audi A4 = new Audi("Audi", "A4", 3f, 141, 150, 5.2f, 29505);
	BMW Series7 = new BMW("BMW", "7 Series", 3f, 155, 390, 5.7f, 69510);
	BMW Series8 = new BMW("BMW", "8 Series", 4.4f, 155, 400, 3.8f, 69225);
	Mercedes EClass = new Mercedes("Mercedes", "EClass", 2f, 156, 385, 5.6f, 69999);
	Mercedes SClass = new Mercedes("Mercedes", "SClass", 3f, 159, 399, 3.9f, 71000);
	
	@Test
	void test() {
		assert(A3.model.equals("A3"));
	}
	
	@Test
	void test2() {
		assert(A4.model.equals("A4"));
	}
	
	@Test
	void test3() {
		assert(Series7.acceleration > Series8.acceleration);
	}
	
	

}
