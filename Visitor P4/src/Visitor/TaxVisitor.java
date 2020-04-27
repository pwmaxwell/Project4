package Visitor;

public class TaxVisitor implements Visitor {

	public TaxVisitor() {
		
	}
	@Override
	public double visit(Liquor liquorItem) {
		System.out.println("This is a Liquor item and therefore gets taxed at 15%"); 
		return (liquorItem.getPrice() * .15) + liquorItem.getPrice();
	}

	@Override
	public double visit(HealthyFood healthFoodItem) {
		System.out.println("This is a healthy food item and therefore is not taxed"); 
		return healthFoodItem.getPrice();
	}

	@Override
	public double visit(SugarFood sugarFoodItem) {
		System.out.println("This is a sugary food item and therefore gets taxed at 12%"); 
		return (sugarFoodItem.getPrice() * .12) + sugarFoodItem.getPrice();
	}
	
}
