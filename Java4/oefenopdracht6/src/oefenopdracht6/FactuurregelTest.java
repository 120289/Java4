package oefenopdracht6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class FactuurregelTest {

	@Test
	void testFactuurGetters() {
		int btwprijs = 21;
		double expectedPrice = 10;
		int aantalverwachting = 12;
		Product product = new Product("naam", "omschrijving", expectedPrice);

		// Arrange
		Factuurregel factuurregel = new Factuurregel(product, btwprijs, aantalverwachting);

		assertEquals(btwprijs, factuurregel.getBtw());
		assertEquals(aantalverwachting, factuurregel.getAantal());
		assertEquals(product, factuurregel.getProduct());

	}

	@Test
	void testFactuurTotaalPrijs() {
		int btwprijs = 21;
		double expectedPrice = 10;
		int aantalverwachting = 12;

		// Arrange
		Product product = new Product("naam", "omschrijving", expectedPrice);

		Factuurregel factuurregel = new Factuurregel(product, btwprijs, aantalverwachting);

		// Test
		assertEquals(145.20, factuurregel.getTotalPrice());

		// Arrange
		expectedPrice = 0.99;
		aantalverwachting = 1;
		product = new Product("naam", "omschrijving", expectedPrice);

		// Test
		factuurregel = new Factuurregel(product, btwprijs, aantalverwachting);

		assertEquals(1.20, factuurregel.getTotalPrice());

	}
}