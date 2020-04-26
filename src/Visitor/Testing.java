package Visitor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing {
	private TaxVisitor taxation = new TaxVisitor();
	private Liquor wine = new Liquor(1.00);
	private SugarFood soda = new SugarFood(2.00);
	private HealthyFood vegatables = new HealthyFood(3.00);
	@Test
	void testWine() {
		double wineAfterTax = wine.accept(taxation);
		assertEquals(wineAfterTax, 1.15);
	}
	
	@Test
	void testSoda() {
		double sodaAfterTax = soda.accept(taxation);
		assertEquals(sodaAfterTax, 2.24);
	}
	
	@Test
	void testvegatables() {
		double vegatablesAfterTax = vegatables.accept(taxation);
		assertEquals(vegatablesAfterTax, 3.00);
	}

}
