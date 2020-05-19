package src;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    MainClass main = new MainClass();
    @Test
    public void testGetLocalNumber()
    {
        Assert.assertEquals( "getLocalNumber doesn't return 14" ,main.getLocalNumber(), 14);
    }

    @Test
    public void testGetClassNumber() {
        boolean result = main.getLocalNumber() > 45;
        Assert.assertTrue("getClassNumber returns value wich less than 45", result);
    }
}
