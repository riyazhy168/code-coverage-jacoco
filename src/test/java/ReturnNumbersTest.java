import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ReturnNumbersTest extends TestCase {
    private  ReturnNumbers returnNumbers;

    @Before
    public void setUp() {
        returnNumbers = new ReturnNumbers();
    }
    @Test
    public void testReturnOne() {
        assertThat(returnNumbers.returnOne(), is(1));
    }
    @Test
    public void testReturn2() {
        assertThat(returnNumbers.return2(), is(2));
    }
    @Test
    public void testReturn3() {
        assertThat(returnNumbers.return3(), is(3));
    }
    @Test
    public void testReturn4() {
        assertThat(returnNumbers.return4(), is(4));
    }
    @Test
    public void testReturn5() {
        assertThat(returnNumbers.return5(), is(5));
    }
}