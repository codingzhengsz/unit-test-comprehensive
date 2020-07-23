package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {

    @Test
    void should_return_true_when_validate_given_1_2_3_4() {
        // given
        Validator validator = new Validator();
        int[] input = {1,2,3,4};

        // when
        boolean result = validator.validation(input);

        // then
        assertTrue(result);
    }

    @Test
    void should_return_false_when_validate_given_2_2_3_5() {
        // given
        Validator validator = new Validator();
        int[] input = {2,2,3,5};

        // when
        boolean result = validator.validation(input);

        // then
        assertFalse(result);
    }

    @Test
    void should_return_false_when_validate_given_10_1_2_3() {
        // given
        Validator validator = new Validator();
        int[] input = {10, 1, 2, 3};

        // when
        boolean result = validator.validation(input);

        // then
        assertFalse(result);
    }
}
