package testNG;

import org.testng.annotations.Test;

public class GroupingExample {
	@Test(groups = "carrot")
public void carrot() {
	System.out.println("it is carrot");
}
	@Test(groups = "beans")
public void beans() {
	System.out.println("it is beans");
}
	@Test(groups = "pumkin")
public void pumkin() {
	System.out.println("it is pumkin");
	
}
	@Test(groups = "mango")
public void mango() {
	System.out.println("it is mango");
}
}
