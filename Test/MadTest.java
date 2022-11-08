import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MadTest
{
    //Thing tests
    @Test
    void getQueenThingConstructorPass()
    {
        Mad queen = new Mad("pokemon");
        assertTrue(queen.getThing() == "pokemon");
    }

    @Test
    void getQueenThingDefaultPass()
    {
        Mad queen = new Mad();
        queen.setThing("pokemon");
        assertTrue(queen.getThing() == "pokemon");
    }

    //Fails
    @Test
    void getQueenThingConstructorFailNum()
    {
        Mad queen = new Mad("123");
        assertTrue(queen.getThing() == "bugs");
    }

    @Test
    void getQueenThingConstructorFailChar()
    {
        Mad queen = new Mad("*/?");
        assertTrue(queen.getThing() == "bugs");
    }


}