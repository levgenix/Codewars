import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Multiply class testing Example")
class MultiplyTest {

    @Test
    void multiply() {
        assertEquals(12, Multiply.multiply(4.0, 3d));
    }

    @Nested
    @DisplayName("Tests on null arguments")
    class WhenNull {
        @Test
        void whenAnyArgumentIsNull_ThenException() {
            assertThrows(IllegalArgumentException.class, () -> Multiply.multiply(null, 3d), "Null argument a expected");
            assertThrows(IllegalArgumentException.class, () -> Multiply.multiply(7.2, null), "Null argument b expected");
        }
        @Test
        void whenBothArgumentsIsNull_ThenException() {
            assertThrows(IllegalArgumentException.class, () -> Multiply.multiply(null, null), "Both arguments null expected");
        }
    }
}