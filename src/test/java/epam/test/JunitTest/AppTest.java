package epam.test.JunitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class AppTest
{
	public static App app;
	@BeforeAll
	static void setup() {
		app = new App();
	}
	@Test
    public void test1()
    {
    	assertEquals("BCD",app.removeAfromFirst2Char("ABCD"));
    }
	@Test
    public void test2() {
    	assertEquals("CD",app.removeAfromFirst2Char("AACD"));
    }
	@Test
    public void test3() {
    	assertEquals("BCD",app.removeAfromFirst2Char("BACD"));
    }
	@Test
    public void test4() {
    	assertEquals("BBAA",app.removeAfromFirst2Char("BBAA"));
    }
	@Test
    public void test5() {
    	assertEquals("BAA",app.removeAfromFirst2Char("AABAA"));
    }
}
