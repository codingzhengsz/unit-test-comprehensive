package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
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

    @Test
    void should_return_false_when_process_control_given_7_and_A40B() {
        // given
        ProcessController controller = new ProcessController();
        int frequency = 7;
        String result = "4A0B";

        // when
        boolean isContinue = controller.processControl(frequency, result);

        // then
        assertFalse(isContinue);
    }

}
