package com.thomson.reuters.sonar;
import org.junit.Assert;
import org.junit.Test;

public class FirstClassTest {

    
    @Test
    public void firstMethodTest(){
        FirstClass fc = new FirstClassImpl();
        String ret = fc.firstMethod();        
        Assert.assertEquals("Hello World", ret);
    }
    
    @Test
    public void secondMethodTest(){
    	FirstClass fc = new FirstClassImpl();
    	String ret = fc.secondMethod();        
    	Assert.assertEquals("Hello Universe", ret);
    }
    
}
