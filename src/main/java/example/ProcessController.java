package example;

import java.util.Scanner;
import java.util.stream.Stream;

public class ProcessController {

  private Validator validator;
  private GuessNumber guessNumber;

  public ProcessController(Validator validator, GuessNumber guessNumber) {
    this.validator = validator;
    this.guessNumber = guessNumber;
  }

  public String processControl(int[] answer) {
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 6; i++) {
      String guessAnswer = scanner.next();
      int[] guessAnswerArray =
          Stream.of(guessAnswer.split("")).mapToInt(Integer::parseInt).toArray();
      boolean isPass = validator.validation(guessAnswerArray);
      if (isPass) {
        String result = guessNumber.guess(answer, guessAnswerArray);
        if ("4A0B".equals(result)) {
          return "4A0B";
        } else {
          System.out.print(result + "\n");
        }
      } else {
        System.out.print("Wrong Input,Input again\n");
      }
    }
    return "You are Fail";
  }
}
