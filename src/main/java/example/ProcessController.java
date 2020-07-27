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
      if (subProcess(answer, scanner)) return CORRECT_ANSWER;
    }
    return "You are Fail";
  }

  private boolean subProcess(int[] answer, Scanner scanner) {
    int[] guessAnswerArray = getGuessAnswerArray(scanner);
    if (validator.validation(guessAnswerArray)) {
      String result = guessNumber.guess(answer, guessAnswerArray);
      System.out.print(result + "\n");
      if (result.equals(CORRECT_ANSWER)) {
        return true;
      }
    } else {
      System.out.print("Wrong Input,Input again\n");
    }
    return false;
  }

  private int[] getGuessAnswerArray(Scanner scanner) {
    String guessAnswer = scanner.next();
    return Stream.of(guessAnswer.split("")).mapToInt(Integer::parseInt).toArray();
  }
}
