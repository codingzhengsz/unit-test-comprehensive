package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
