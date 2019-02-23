package com.ihorko.main;

import org.junit.*;

import static org.junit.Assert.*;

public class MyTestedClassTest {

//    @BeforeClass
//    public static void beforeClass() {
//        System.out.println("Before class");
//    }
//    @Before
//    public void beforeEach() {
//        System.out.println("  Before");
//    }
//    @AfterClass
//    public static void afterClass() {
//        System.out.println("After class");
//    }
//    @After
//    public void afterEach() {
//        System.out.println("  After");
//    }


//    @Ignore("ignored")
    @Test
    public void sum() {
//        System.out.println("    testing sum");
        int sum = MyTestedClass.sum(2, 2);
        assertNotEquals(sum, 5);
    }

    @Test
    public void sum1() {
//        System.out.println("    testing sum1");
        int sum = MyTestedClass.sum(2, 3);
        assertEquals(sum, 5);
    }
    @Test
    public void sum2() {
        int sum = MyTestedClass.sum(3, 3);
        assertTrue(sum > 5 && sum < 7);
    }

    @Test (expected = Exception.class)
    public void getException() {
//        MyTestedClass.getException();
        MyTestedClass.getIndexOutOfBoundsException();
    }


    @Test
    public void incI() {
        MyTestedClass myTestedClass = new MyTestedClass();
        myTestedClass.incI();
        assertNotEquals(myTestedClass.getI(), 2);
    }
}