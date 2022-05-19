package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
	@Test
	@Parameters("name")
public void mynameis(String name) {
System.out.println("my name is"+name);	
}
}
