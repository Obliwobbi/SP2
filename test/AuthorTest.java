import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void calculateTotalPay() {
        //Arrange
        Author a1 = new Author("Jan Erik");
        a1.addTitle(new PrintedBook("Bog1","SKØN",140,166));
        a1.addTitle(new AudioBook("bog2","SKØN",140,192));
        float expectedTest = 4213.6445F;

        //Act
        float actualTest = a1.calculateTotalPay();

        //Assert
        assertEquals(expectedTest,actualTest);
    }
}