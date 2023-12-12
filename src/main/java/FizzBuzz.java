/**
 * @author Petri Kainulainen
 */
public class FizzBuzz {

    public String getFizzBuzzWord(int number) {
        StringBuilder fizzBuzzWord = new StringBuilder();

        if (number % 3 == 0) {
            fizzBuzzWord.append("Fizz");
        }

        if (number % 5 == 0) {
            fizzBuzzWord.append("Buzz");
        }

        return (fizzBuzzWord.length() == 0) ? null : fizzBuzzWord.toString();
    }

    public Integer returnOne() {
        return 1;
    }

    public Integer return2() {
        return 2;
    }

    public Integer return3() {
        return 3;
    }

    public Integer return4() {
        return 4;
    }

    public Integer return5() {
        return 5;
    }
}
