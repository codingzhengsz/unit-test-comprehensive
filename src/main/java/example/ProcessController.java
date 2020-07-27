package example;

import java.util.Scanner;
import java.util.stream.Stream;

public class ProcessController {

  public static final String CORRECT_ANSWER = "4A0B";
  private Validator validator;
  private GuessNumber guessNumber;

  public ProcessController(Validator validator, GuessNumber guessNumber) {
    this.validator = validator;
    this.guessNumber = guessNumber;
  }

  public String processControl(int[] answer) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 6; i++) {
      int[] guessAnswerArray = getGuessAnswerArray(scanner);
      if (validator.validation(guessAnswerArray)) {
        String result = guessNumber.guess(answer, guessAnswerArray);
        if (CORRECT_ANSWER.equals(result)) {
          return CORRECT_ANSWER;
        } else {
          System.out.print(result + "\n");
        }
      } else {
        System.out.print("Wrong Input,Input again\n");
      }
    }
    return "You are Fail";
  }

  private int[] getGuessAnswerArray(Scanner scanner) {
    String guessAnswer = scanner.next();
    return Stream.of(guessAnswer.split("")).mapToInt(Integer::parseInt).toArray();
  }
}
