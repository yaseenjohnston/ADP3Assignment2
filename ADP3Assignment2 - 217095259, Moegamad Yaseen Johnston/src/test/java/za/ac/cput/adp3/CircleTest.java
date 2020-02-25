package za.ac.cput.adp3;

import static org.junit.Assert.*;

import za.ac.cput.adp3.Circle;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CircleTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void equalsTest()
    {
        Circle c = new Circle(12.5);
        double expectedRadius = 12.5;
        assertEquals(expectedRadius, c.getRadius(), 45.0);
    }

    @Test
    public void objIdentityTest()
    {
        Circle c1 = new Circle(45);
        assertSame("Should be the same.", c1, c1);

        Circle c2 = new Circle(90);
        assertNotSame("Should not be the same.", c1, c2);
    }

    @Test
    public void failTest(){
        Circle c3 = new Circle(12.5);
        double expectedRadius = 12.99;
        assertEquals(expectedRadius, c3.getRadius(), 45.0);
    }

    @Test(timeout = 1000)
    public void testWithTimeout()
    {
        Circle c4 = new Circle(12.99);
        double expectedRadius = 12.99;
        assertEquals(expectedRadius, c4.getRadius(), 45.0);
    }

    @Ignore
    @Test
    public void testSame()
    {
        Circle c5 = new Circle(1);
        assertSame("Should have same value", c5,1 );
    }
}
