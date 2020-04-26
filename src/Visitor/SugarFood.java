package Visitor;

public class SugarFood implements Visitable{

	
	private double price;
	
	SugarFood(double newPrice){
		price = newPrice;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public double accept(Visitor visitor) {
		
		return visitor.visit(this);
	}
}
