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
    public void setQueenThingUpperFail()
    {
        Mad queen = new Mad();
        queen.setThing("AHHH");
        assertTrue(queen.getThing().matches("bugs"));
    }
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

    //Places Tests
    //places passes
    @Test
    public void getQueenPlacePass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getPlace().matches(""));
    }

    public void setQueenPlaceFirstUpPass()
    {
        Mad queen = new Mad();
        queen.setPlace("Bali");
        assertTrue(queen.getPlace().matches("Bali"));
    }

    //places fail
    @Test
    public void setQueenPlaceNoUpFail()
    {
        Mad queen = new Mad();
        queen.setPlace("bali");
        assertTrue(queen.getPlace().matches("Narnia"));
    }
}