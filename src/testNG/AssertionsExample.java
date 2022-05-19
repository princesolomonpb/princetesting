package testNG;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {
	String name="prince";
	boolean value=false;
	@Test
	public void checkname() {
	Assert.assertFalse(value, "prince");
	}
}
