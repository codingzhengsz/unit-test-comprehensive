package example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnswerGeneratorTest {

  @Test
  public void should_return_array_with_a_capacity_of_four_when_generate_answer() {
    // given
    AnswerGenerator generator = new AnswerGenerator();

    // when
    int[] answer = generator.generateAnswer();

    // then
    assertEquals(4, answer.length);
  }

  @Test
  void should_return_array_without_repeated_numbers_when_generate_answer() {
    // given
    AnswerGenerator generator = new AnswerGenerator();
    HashMap<Integer, Integer> numberMap = new HashMap<>();

    // when
    int[] answer = generator.generateAnswer();

    // then
    for (int grid : answer) {
      numberMap.put(grid, numberMap.get(grid));
    }

    assertEquals(4, numberMap.size());
  }

  @Test
  void should_all_numbers_between_0_and_9_when_generate_answer() {
    // given
    AnswerGenerator generator = new AnswerGenerator();

    // when
    int[] answer = generator.generateAnswer();

    // then
    for (int grid : answer) {
      assertTrue(0 <= grid && grid <= 9);
    }
  }
}
