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
}
