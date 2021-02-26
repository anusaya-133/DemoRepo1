import static org.testng.Assert.fail;

import org.testng.annotations.Test;

public class ClassFour 
{
	@Test
	public void methodF()
	{
		System.out.println("Inside methodF of class Four");
		assert.fail();
	}

}
