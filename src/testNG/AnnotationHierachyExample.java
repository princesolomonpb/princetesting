package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationHierachyExample {
  @Test
  public void test() {
	  System.out.println("i am a test");
  }
  @Test
  public void test1() {
	  System.out.println("i am a test1");
  }
  @Test
  public void test2() {
	  System.out.println("i am a test2");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("i am a before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("i am a after method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am a before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am a after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("i am a before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("i am a after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("i am a before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("i am a after suite");
  }
  
}
