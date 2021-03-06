
public class TAAnd extends TAObject implements TABoolValue {

 /*
	 * The AND operator is a binary operator 
	 * which takes as input two boolean values
	 * and outputs a boolean value
	 */
	

	TABoolValue op1,op2;
	boolean value;

	
	public String type()
	{
		return "boolean";
	}
	
	public void evaluate()
	{
	
		value= op1.value() && op2.value();
		updateAll();
	}
	
	public boolean value()
	{
		return value;
	}
	
	TAAnd(TABoolValue a, TABoolValue b) 
	{
			op1 = a;
			op2 = b;
			
			addOperands(a,b);
	}
	
	
	
	public void list()
	{
		if (name!= null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list("&", op1, op2);
		}
				
	}
	
	

	


		

}
