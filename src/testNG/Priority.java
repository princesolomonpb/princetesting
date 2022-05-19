package testNG;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 1)
public void StartToDriveAbike() {
	System.out.println("start to driver a bike");
}
	@Test(priority = 2)
public void Putakey() {
	System.out.println("put a key");
}
	@Test(priority = 3)
public void Startabike() {
	System.out.println("start a bike");
}
	@Test(priority = 4)
public void putafirstgear() {
	System.out.println("put a first gear");
}
	@Test(priority = 5)
public void putasecondgear() {
	System.out.println("put a second gear");
}
	@Test(priority = 6)
public void putathirdgear() {
	System.out.println("put a third gear");
}
	@Test(priority = 7)
public void putafourthgear() {
	System.out.println("put a fourth gear");
}
	@Test(priority = 8)
public void putafifthgear() {
	System.out.println("put a fifth gear");
}
}
