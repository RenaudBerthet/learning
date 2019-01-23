package be.rbe.learning.codewars;

import be.rbe.learning.codewars.Conversion;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversionTest {

    private Conversion conversion = new Conversion();

//    @Test
//    public void shouldConvertToRoman() {
//        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
//        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
//        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
//        assertEquals("solution(2008) should equal to MCMXC", "MCMXC", conversion.solution(2008));
//        assertEquals("solution(1666) should equal to MDCLXVI", "MDCLXVI", conversion.solution(1666));
//    }

    @ParameterizedTest
    @CsvSource({"0, 1000, 0", "3, 5, 0", "3, 1, 3"})
    public void getMultiplier(int number, int symbolValue, int occurences) {
//        symbol = Conversion.RomanSymbol.
//        assertEquals(occurences, Conversion.getMultiplier(number, symbol));

    }

}