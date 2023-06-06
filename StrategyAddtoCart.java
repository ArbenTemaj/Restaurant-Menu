public class StrategyAddtoCart implements Strategy{
	
		public double totalCost;
	
		public double totalCostt(){ return totalCost; }
	
		public double doOP(Beverage d) 
		{
			double x = d.costCalc();
			double y=totalCost +=x;
			return y;
		}
}