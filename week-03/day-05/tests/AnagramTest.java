import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    public void isAnagram() {
        Anagram anagram = new Anagram();
        assertEquals(true, anagram.isAnagram("evil", "vile"));
        assertEquals(false, anagram.isAnagram("izé", "mákoslecsó"));
    }
}