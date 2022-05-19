package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {
	@Test(enabled = true)
public void highschool() {
	System.out.println("it is high school");
}
	@Test(dependsOnMethods ="highschool")
public void highersecondary() {
	System.out.println("it is higher secondary");
}
	@Test(dependsOnMethods = "highersecondary")
public void engineering() {
	System.out.println("it is engineering");
}
}
