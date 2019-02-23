package com.ihorko.main;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MyTestedClass1Test {

    @Before
    public void mockitoInitialization() {
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    Dich dich;

    @InjectMocks
    MyTestedClass1 myTestedClass1 = new MyTestedClass1();

    @Test
    public void sum() {
        when(dich.sum(2, 2)).thenReturn(4);
        assertEquals(myTestedClass1.sum(2,2), 4);
        verify(dich).sum(2, 2);
    }

    @Test
    public void sum1() {
        Dich dich = mock(Dich.class);
        MyTestedClass1 myTestedClass1 = new MyTestedClass1(dich);

        when(dich.sum(4, 4)).thenReturn(8);
        assertEquals(myTestedClass1.sum(4, 4), 8);
    }

    @Test
    public void div() {
        when(dich.div(2, 2)).thenReturn(1);
        assertEquals(myTestedClass1.div(2,2), 1);
    }

    @Test
    public void div1() {
        Dich dich = mock(Dich.class);
        MyTestedClass1 myTestedClass1 = new MyTestedClass1(dich);

        when(dich.div(8, 2)).thenReturn(4);
        assertEquals(myTestedClass1.div(8, 2), 4);
    }
}