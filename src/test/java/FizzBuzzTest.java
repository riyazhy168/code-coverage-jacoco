import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Petri Kainulainen
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOfThree_ShouldReturnFizz() {
        assertThat(fizzBuzz.getFizzBuzzWord(3), is("Fizz"));
    }

    @Test
    public void getFizzBuzzWord_NumberIsMultipleOf5() {
        assertThat(fizzBuzz.getFizzBuzzWord(15), is("FizzBuzz"));
    }
    @Test
    public void testOne(){
        assertThat(fizzBuzz.returnOne(), is(1));
    }

    @Test
    public void test2(){
        assertThat(fizzBuzz.return2(), is(2));
    }


}
