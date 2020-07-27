package example;

public class Game {

  private AnswerGenerator answerGenerator;
  private ProcessController processController;

  public Game(AnswerGenerator answerGenerator, ProcessController processController) {
    this.answerGenerator = answerGenerator;
    this.processController = processController;
  }

  public void play() {

    //    while (true) {
    System.out.println("A new Round to play game!\nAnd then you can input your answer:");
    int[] answer = this.answerGenerator.generateAnswer();
    String result = processController.processControl(answer);
    if (result.equals("A40B")) {
      System.out.println("You are Success!");
    } else {
      System.out.println(result);
      //      }
    }
  }
}
