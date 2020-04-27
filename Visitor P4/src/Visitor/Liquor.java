package Visitor;

public class Liquor implements Visitable {

	private double price;
	
	Liquor(double newPrice){
		price = newPrice;
	}
	
	public double getPrice() {
		return price;
	}

	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}
}
