package example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessControllerTest {

  @Test
  void should_return_4A0B_when_process_three_times_and_given_correct_answer() {
    // given
    Validator validator = new Validator();
    GuessNumber guessNumber = new GuessNumber();
    ProcessController controller = new ProcessController(validator, guessNumber);
    String input = "1324\n1521\n1234";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    int[] answer = new int[] {1, 2, 3, 4};
    // when
    String result = "";
    result = controller.processControl(answer);

    // then
    assertEquals("4A0B", result);
  }

  @Test
  void should_return_2A0B_when_process_six_times_and_given_guess_number_1258_and_answer_1234() {
    // given
    Validator validator = new Validator();
    GuessNumber guessNumber = new GuessNumber();
    ProcessController controller = new ProcessController(validator, guessNumber);
    String input = "1258\n1258\n1258\n1258\n1258\n1258";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setIn(in);
    System.setOut(new PrintStream(outContent));

    int[] answer = new int[] {1, 2, 3, 4};
    // when
    String result = controller.processControl(answer);

    // then
    assertEquals("2A0B\n2A0B\n2A0B\n2A0B\n2A0B\n2A0B\n", outContent.toString());
    assertEquals("You are Fail", result);
  }

  @Test
  void
      should_return_WrongInput_when_process_six_times_and_given_guess_number_1258_five_times_and_12_once_and_answer_1234() {
    // given
    Validator validator = new Validator();
    GuessNumber guessNumber = new GuessNumber();
    ProcessController controller = new ProcessController(validator, guessNumber);
    String input = "1258\n1258\n1258\n1258\n1258\n12";
    ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    System.setIn(in);
    System.setOut(new PrintStream(outContent));

    int[] answer = new int[] {1, 2, 3, 4};
    // when
    controller.processControl(answer);

    // then
    assertEquals("2A0B\n2A0B\n2A0B\n2A0B\n2A0B\nWrong Input,Input again\n", outContent.toString());
  }
}
