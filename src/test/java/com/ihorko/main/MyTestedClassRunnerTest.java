package com.ihorko.main;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@RunWith(Parameterized.class)
public class MyTestedClassRunnerTest {

    @Parameterized.Parameter(0)
    public int i1;
    @Parameterized.Parameter(1)
    public int i2;
    @Parameterized.Parameter(2)
    public int resultSum;
    @Parameterized.Parameter(3)
    public int resultDiv;

    @Test
    public void sum() {
        assertEquals(MyTestedClass.sum(i1, i2), resultSum);
    }
    @Test
    public void div() {
        assertEquals(MyTestedClass.div(i1, i2), resultDiv);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getTestData(){
        return Arrays.asList(new Object[][]{
                {2,2,4,1},{6,3,9,2},{20,5,25,4},{15,5,20,3}
        });
    }

}
