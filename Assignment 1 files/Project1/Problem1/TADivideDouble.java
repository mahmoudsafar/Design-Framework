public class TADivideDouble extends TADivide implements TADoubleValue {

	TADoubleValue op1, op2;
	double value;
	
	
	public void evaluate()
	{
		//op1.evaluate();
		//op2.evaluate();
		value = op1.value()/op2.value();
		updateAll();
	}
	 
	 
	public void list()
	{
		if (name!= null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list("/", op1, op2);
		}
				
	}
	
	
	void printState()
	{
		System.out.print(value);
	}
	
	
	String type()
	{
		return "double";
	}
	
	
	public double value()
	{
		return value;
	}
	
	
	
	
	
	
	 TADivideDouble(TADoubleValue a, TADoubleValue b)
	{
		op1 = a;
		op2 = b;
		
		addOperands(a,b);
	}
	 
	
	 
	
	
	
}