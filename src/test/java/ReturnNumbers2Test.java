import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReturnNumbers2Test extends TestCase {
    private  ReturnNumbers2 returnNumbers2;

    @Before
    public void setUp() {
        returnNumbers2 = new ReturnNumbers2();
    }
    @Test
    public void testReturnOne() {
        assertThat(returnNumbers2.returnOne(), is(1));
    }
    @Test
    public void testReturn2() {
        assertThat(returnNumbers2.return2(), is(2));
    }
    @Test
    public void testReturn3() {
        assertThat(returnNumbers2.return3(), is(3));
    }
    @Test
    public void testReturn4() {
        assertThat(returnNumbers2.return4(), is(4));
    }
    @Test
    public void testReturn5() {
        assertThat(returnNumbers2.return5(), is(5));
    }
}