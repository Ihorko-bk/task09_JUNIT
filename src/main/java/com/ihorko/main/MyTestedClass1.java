package com.ihorko.main;

public class MyTestedClass1 {
    Dich dich;

    public MyTestedClass1() {
    }

    public MyTestedClass1(Dich dich) {
        this.dich = dich;
    }

    public int sum(int i1, int i2) {
        return dich.sum(i1, i2);
    }
    public int div(int i1, int i2) {
        return dich.div(i1, i2);
    }
}

