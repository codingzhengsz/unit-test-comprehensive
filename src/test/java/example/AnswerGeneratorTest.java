package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnswerGeneratorTest {

    // TODO: How to name a method when without parameter
    @Test
    public void should_return_array_with_a_capacity_of_four_when_generate_answer() {
        // given
        AnswerGenerator generator = new AnswerGenerator();

        // when
        int[] answer = generator.generateAnswer();

        // then
        assertEquals(4, answer.length);
    }
}
