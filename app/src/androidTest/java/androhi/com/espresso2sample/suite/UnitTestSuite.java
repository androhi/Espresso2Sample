package androhi.com.espresso2sample.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import androhi.com.espresso2sample.SampleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({SampleTest.class})
public class UnitTestSuite {
}
