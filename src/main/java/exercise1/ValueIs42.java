package exercise1;

import java.lang.RuntimeException;

public class ValueIs42 extends RuntimeException {
	int value;
	//try{
	public ValueIs42()
	{
		System.out.println("ok ça a marché mon exeption ?!");
	}
	//}catch(value==42)
}
