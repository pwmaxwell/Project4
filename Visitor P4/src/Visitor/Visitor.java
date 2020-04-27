package Visitor;

public interface Visitor {
	public double visit(Liquor liquorItem);
	public double visit(HealthyFood healthFoodItem);
	public double visit(SugarFood sugarFoodItem);
}
