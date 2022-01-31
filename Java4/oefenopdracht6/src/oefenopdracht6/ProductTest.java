package oefenopdracht6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testProduct() {
		double expectedprijs = 12.1;
		// Assert
		Product product = new Product("Toeter", "Een kleine toeter als je je familie wilt irriteren", expectedprijs);

		// Assert
		assertEquals(expectedprijs, product.getPrijs());

	}

}
