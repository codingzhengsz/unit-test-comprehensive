package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProcessControllerTest {

    @Test
    void should_return_true_when_process_given_5_and_4A0B() {
        // given
        ProcessController controller = new ProcessController();
        int frequency = 5;
        String result = "4A0B";

        // when
        boolean isContinue = controller.processControl(frequency, result);

        // then
        assertTrue(isContinue);
    }
}
