package com.ihorko.main;

import java.util.ArrayList;
import java.util.List;

public class MyTestedClass {

    int i = 0;

    public static int sum(int i1, int i2) {
        return i1+i2;
    }
    public static int div(int i1, int i2) {
        return i1/i2;
    }

    public static void getException() throws Exception {
        throw new Exception();
    }

    public static void getIndexOutOfBoundsException() {
        List<String> s = new ArrayList<String>();
        s.get(3);
    }

    public int getI() {
        return i;
    }
    public void incI() {
        i++;
    }
}
