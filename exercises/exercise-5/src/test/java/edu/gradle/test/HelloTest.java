package edu.gradle.test;

import edu.gradle.HelloWorld;
import org.junit.Assert;
import org.junit.Test;

public class HelloTest {

    private HelloWorld testedClass = new HelloWorld();

    @Test
    public void testMsg() {
        Assert.assertSame("Message is different than expected",
                HelloWorld.HELLO_MSG,
                testedClass.sayHello());
    }
}
