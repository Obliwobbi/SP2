import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EBookTest {

    @Test
    void calculateIllustratedPages() {

        EBook eb = new EBook("Bog1","LYRIK",20,60,50,100000,true);
        double expected = 83.11111111111111;

        double actual = eb.calculatePages();

        assertEquals(expected,actual);
    }

    @Test
    void calculateNotIllustratedPages() {

        EBook eb = new EBook("Bog1","LYRIK",20,60,50,100000,false);
        double expected = 75.55555555555556;

        double actual = eb.calculatePages();

        assertEquals(expected,actual);
    }
}