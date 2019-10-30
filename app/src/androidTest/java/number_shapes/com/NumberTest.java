package number_shapes.com;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void isTriangularTest(){
        //given
        int userNumberTest = 21;
        Number  number = new Number(userNumberTest);
        //when
        boolean isTriangular = number.isTriangular();
        //then
        assertTrue(isTriangular);
    }

}