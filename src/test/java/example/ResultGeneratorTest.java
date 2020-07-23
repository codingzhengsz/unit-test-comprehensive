package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultGeneratorTest {

    @Test
    void should_return_4A0B_when_guess_given_answer_1234_and_input_guess_1234() {
        // given
        ResultGenerator resultGenerator = new ResultGenerator();
        int[] answer = {1, 2, 3, 4};
        int[] guessNumber = {1, 2, 3, 4};
        // when
        String result = resultGenerator.generateResult(answer, guessNumber);

        // then
        assertEquals("4A0B", result);
    }


}
