package Visitor;

public class HealthyFood implements Visitable {

	private double price;
	
	HealthyFood(double newPrice){
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
