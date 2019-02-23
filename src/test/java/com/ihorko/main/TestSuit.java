package com.ihorko.main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {MyTestedClassTest.class, MyTestedClass1Test.class, MyTestedClassRunnerTest.class})
public class TestSuit {
}
