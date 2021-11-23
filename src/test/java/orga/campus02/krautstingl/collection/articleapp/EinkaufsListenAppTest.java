package orga.campus02.krautstingl.collection.articleapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EinkaufsListenAppTest {

    @BeforeEach
    void setUp() {

        double a = 1.79;
        String s = "Milch";
    }

    @Test
    void assertTrue(){
        String expected = "Milch";
        String lowerCase = this.s.toLowerCase();
        assertTrue(expected.equals(lowerCase));
        assertTrue(a > 0);
    }
    }



}