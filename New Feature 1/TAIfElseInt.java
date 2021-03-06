class TAIfElseInt extends TAIfElse implements TAIntValue
{
		
	//Three arguments, first one is the condition to be evaluated
	//The two other are the possible choices
	TABoolValue e1;
	TAIntValue e2;
	TAIntValue e3;
	
	int value; //The value to which the if condition evaluates to

	
	 //List functionality
	public void list()
	{
		ListStrategy.list("", e1, "?", e2, ":", e3);
	}
	
	
	public void evaluate()
	{
		e1.evaluate();
		if (e1.value())
		{
			value = e2.value();
		}
		else
		{
			value = e3.value();
		}
		
	}
	
	
	public int value()
	{
		return value;
	}
	
	void printstate()
	{
		System.out.print(value);
	}
	
	
	TAIfElseInt(TABoolValue e1, TAIntValue e2, TAIntValue e3) {
		
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}
	
	
}