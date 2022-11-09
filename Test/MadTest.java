import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MadTest
{
    //Thing tests
    //thing passes
    @Test
    public void getQueenThingPass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getThing().matches(""));
    }
    @Test
    public void setQueenThingPass()
    {
        Mad queen = new Mad();
        queen.setThing("pokemon");
        assertTrue(queen.getThing().matches("pokemon"));
    }

    //thing fails
    @Test
    public void setQueenThingNumFail()
    {
        Mad queen = new Mad();
        queen.setThing("123");
        assertTrue(queen.getThing().matches("bugs"));
    }
    @Test
    public void setQueenThingBlankFail()
    {
        Mad queen = new Mad();
        queen.setThing("");
        assertTrue(queen.getThing().matches("bugs"));
    }
    @Test
    public void setQueenThingSpecCharFail()
    {
        Mad queen = new Mad();
        queen.setThing("*/?");
        assertTrue(queen.getThing().matches("bugs"));
    }

}