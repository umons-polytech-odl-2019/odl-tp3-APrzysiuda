package exercise1;

public class ExceptionThrower {
	void throwACustomExceptionWhenValueIs42(int value) throws ValueIs42 {
		if (value==42){
			throw new ValueIs42();
		}
	}
	public ExceptionThrower()
	{
		System.out.println("dis moi que c'est bon stp");
	}
}
