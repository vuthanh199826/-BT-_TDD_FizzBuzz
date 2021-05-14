import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @org.junit.jupiter.api.Test
    void testTraslate() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.traslate(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void testTraslate1() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.traslate(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void testTraslate2() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.traslate(number);
        assertEquals(expected,result);
    }
    @org.junit.jupiter.api.Test
    void testTraslate3() {
        int number = 4;
        String expected = "4";
        String result = FizzBuzzTranslate.traslate(number);
        assertEquals(expected,result);
    }
}