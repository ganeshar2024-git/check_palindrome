import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberProgramTest {
    @Test void checksNumberPalindrome() {
        assertTrue(PalindromeNumberProgram.isPalindrome(1221));
        assertFalse(PalindromeNumberProgram.isPalindrome(1234));
        assertFalse(PalindromeNumberProgram.isPalindrome(-121));
        assertTrue(PalindromeNumberProgram.isPalindrome(757));
    }
}
