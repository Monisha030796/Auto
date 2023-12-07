package org.junitpractice;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({DemoJunit.class,Junitexe.class})
public class TestSuiteJunit {
public static void main(String[] args) {
	Result r=JUnitCore.runClasses(DemoJunit.class,Junitexe.class);
}
	
}

