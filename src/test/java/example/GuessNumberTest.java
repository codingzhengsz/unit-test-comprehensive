package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberTest {

    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1, 2, 3, 4};
        int[] guessNumbers = {1, 2, 3, 4};
        // when
        String result = guessNumber.guess(answer, guessNumbers);

        // then
        assertEquals("4A0B", result);
    }

    @Test
    void should_return_0A0B_when_guess_given_answer_1234_and_input_guess_5678() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1, 2, 3, 4};
        int[] guessNumbers = {5, 6, 7, 8};

        // when
        String result = guessNumber.guess(answer, guessNumbers);

        // then
        assertEquals("0A0B", result);
    }

    @Test
    void should_return_0A2B_when_guess_given_answer_1234_and_input_guess_2156() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1, 2, 3, 4};
        int[] guessNumbers = {2, 1, 5, 6};

        // when
        String result = guessNumber.guess(answer, guessNumbers);

        // then
        assertEquals("0A2B", result);
    }

    @Test
    void should_return_0A4B_when_guess_given_answer_1234_and_input_guess_4321() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        int[] answer = {1, 2, 3, 4};
        int[] guessNumbers = {4, 3, 2, 1};

        // when
        String result = guessNumber.guess(answer, guessNumbers);

        // then
        assertEquals("0A4B", result);
    }
}
