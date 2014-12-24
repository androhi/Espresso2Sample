package androhi.com.espresso2sample;

import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@RunWith(AndroidJUnit4.class)
public class SampleTest {

    @Test
    public void sample() throws Exception {
        assertThat("sample", is("sample"));
    }
}
