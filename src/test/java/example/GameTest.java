package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GameTest {

    @Test
    public void should_return_Wrong_Input_when_play_given_1123() {
        // given
        AnswerGenerator answerGenerator = new AnswerGenerator();
        GuessNumber guessNumber = new GuessNumber();
        ProcessController processController = new ProcessController();
        Validator validator = new Validator();

        Game game = new Game(answerGenerator, guessNumber, validator, processController);
        int[] input = {1, 1, 2, 3};

        // when
        String result = game.play(input);

        // then
        assertEquals("Wrong Input, Input again", result);
    }

    @Test
    public void should_return_Wrong_Input_when_play_given_12() {
        // given
        AnswerGenerator answerGenerator = new AnswerGenerator();
        GuessNumber guessNumber = new GuessNumber();
        ProcessController processController = new ProcessController();
        Validator validator = new Validator();

        Game game = new Game(answerGenerator, guessNumber, validator, processController);
        int[] input = {1, 2};

        // when
        String result = game.play(input);

        // then
        assertEquals("Wrong Input, Input again", result);
    }

    @Test
    public void should_return_Fail_when_play_given_answer_1234_and_guess_input_4567() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        ProcessController processController = new ProcessController();
        Validator validator = new Validator();
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn(new int[]{1,2,3,4});

        Game game = new Game(answerGenerator, guessNumber, validator, processController);
        // when
        String result = "";
        for (int i = 0; i < 7; i++) {
            result = game.play(new int[]{4, 5, 6, 7});
        }

        // then
        assertEquals("Fail", result);
    }

    @Test
    public void should_return_4A0B_when_play_given_answer_1234_and_guess_input_1234() {
        // given
        GuessNumber guessNumber = new GuessNumber();
        ProcessController processController = new ProcessController();
        Validator validator = new Validator();
        AnswerGenerator answerGenerator = Mockito.mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn(new int[]{1,2,3,4});

        Game game = new Game(answerGenerator, guessNumber, validator, processController);
        // when
        String result = game.play(new int[]{1,2,3,4});

        // then
        assertEquals("4A0B", result);
    }
}
