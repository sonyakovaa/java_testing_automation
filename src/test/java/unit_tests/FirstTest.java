package unit_tests;

import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void checkSomething() {
        System.out.println("Hello");
    }

    @Test
    public void checkSome() {
        System.out.println("I am the test method");
    }
}
