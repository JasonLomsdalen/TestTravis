
public class OperationDecider {
	public Operation getOperation(String operationType)
	{
		if (operationType == null)
		{
			return null;
		}
		if(operationType.equalsIgnoreCase("+"))
		{
			return new Add();
		}
		if(operationType.equalsIgnoreCase("-"))
		{
			return new Subtract();
		}
		if(operationType.equalsIgnoreCase("*"))
		{
			return new Multiply();
		}
		if(operationType.equalsIgnoreCase("/"))
		{
			return new Divide();
		}
		
		return null;
	}
}
