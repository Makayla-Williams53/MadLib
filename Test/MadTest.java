import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MadTest
{
    @Test
    void getThing()
    {
        Mad queen = new Mad();
        assertTrue(queen.getThing() == "bugs");
    }

    @Test
    void getQueenThingPass()
    {
        Mad queen = new Mad();
        queen.setThing("pokemon");
        assertTrue(queen.getThing() == "pokemon");
    }

}