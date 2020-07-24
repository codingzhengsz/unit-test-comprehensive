package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessControllerTest {

    @Test
    void should_return_Success_when_process_given_5_and_4A0B() {
        // given
        ProcessController controller = new ProcessController();
        int frequency = 5;
        String result = "4A0B";

        // when
        String isContinue = controller.processControl(frequency, result);

        // then
        assertEquals("Success", isContinue);
    }

    @Test
    void should_return_Fail_when_process_control_given_7_and_4A0B() {
        // given
        ProcessController controller = new ProcessController();
        int frequency = 7;
        String result = "4A0B";

        // when
        String isContinue = controller.processControl(frequency, result);

        // then
        assertEquals("Fail", isContinue);
    }

    @Test
    void should_return_2A2B_when_process_control_given_3_and_2A2B() {
        // given
        ProcessController controller = new ProcessController();
        int frequency = 3;
        String result = "2A2B";

        // when
        String isContinue = controller.processControl(frequency, result);

        // then
        assertEquals("2A2B", isContinue);
    }

}
