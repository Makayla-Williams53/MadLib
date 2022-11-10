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
    }//end of getQueenThingPass
    @Test
    public void setQueenThingPass()
    {
        Mad queen = new Mad();
        queen.setThing("pokemon");
        assertTrue(queen.getThing().matches("pokemon"));
    }//end of setQueenThingPass

    //thing fails
    @Test
    public void setQueenThingUpperFail()
    {
        Mad queen = new Mad();
        queen.setThing("Pokemon");
        assertTrue(queen.getThing().matches("bugs"));
    }//end of setQueenThingUpperFail
    @Test
    public void setQueenThingNumFail()
    {
        Mad queen = new Mad();
        queen.setThing("123");
        assertTrue(queen.getThing().matches("bugs"));
    }//end of setQueenThingNumFail
    @Test
    public void setQueenThingBlankFail()
    {
        Mad queen = new Mad();
        queen.setThing("");
        assertTrue(queen.getThing().matches("bugs"));
    }//end of setQueenThingBlankFail
    @Test
    public void setQueenThingSpecCharFail()
    {
        Mad queen = new Mad();
        queen.setThing("*/?");
        assertTrue(queen.getThing().matches("bugs"));
    }//end of setQueenThingSpecCharFail

    //Places Tests
    //places passes
    @Test
    public void getQueenPlacePass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getPlace().matches(""));
    }//end of getQueenPlacePass

    @Test
    public void setQueenPlacePass()
    {
        Mad queen = new Mad();
        queen.setPlace("Bali");
        assertTrue(queen.getPlace().matches("Bali"));
    }//end of setQueenPlacePass

    //places fail
    @Test
    public void setQueenPlaceNoUpFail()
    {
        Mad queen = new Mad();
        queen.setPlace("bali");
        assertTrue(queen.getPlace().matches("Narnia"));
    }//end of setQueenPlaceNoUpFail
    @Test
    public void setQueenPlaceNumFail()
    {
        Mad queen = new Mad();
        queen.setPlace("1234");
        assertTrue(queen.getPlace().matches("Narnia"));
    }//end of setQueenPlaceNumFail
    @Test
    public void setQueenPlaceSpecCharFail()
    {
        Mad queen = new Mad();
        queen.setPlace("?*/~");
        assertTrue(queen.getPlace().matches("Narnia"));
    }//end of setQueenPlaceSpecCharFail
    @Test
    public void setQueenPlaceBlankFail()
    {
        Mad queen = new Mad();
        queen.setPlace("");
        assertTrue(queen.getPlace().matches("Narnia"));
    }

    //adverb tests
    //passes
    @Test
    public void getQueenAdverbPass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getAdverb().matches(""));
    }//end getQueenAdverbPass
    @Test
    public void setQueenAdverbPass()
    {
        Mad queen = new Mad();
        queen.setAdverb("magically");
        assertTrue(queen.getAdverb().matches("magically"));
    }//end setQueenAdverbPass

    //fails
    @Test
    public void setQueenAdverbNoLyFail()
    {
        Mad queen = new Mad();
        queen.setAdverb("cool");
        assertTrue(queen.getAdverb().matches("charismatically"));
    }//end setQueenAdverbNoLyFail
    @Test
    public void setQueenAdverbUpperFail()
    {
        Mad queen = new Mad();
        queen.setAdverb("Cool");
        assertTrue(queen.getAdverb().matches("charismatically"));
    }//end setQueenAdverbUpperFail
    @Test
    public void setQueenAdverbBlankFail()
    {
        Mad queen = new Mad();
        queen.setAdverb("");
        assertTrue(queen.getAdverb().matches("charismatically"));
    }//end setQueenAdverbBlankFail
    @Test
    public void setQueenAdverbNumFail()
    {
        Mad queen = new Mad();
        queen.setAdverb("123");
        assertTrue(queen.getAdverb().matches("charismatically"));
    }//end setQueenAdverbNumFail
    @Test
    public void setQueenAdverbSpecCharFail()
    {
        Mad queen = new Mad();
        queen.setAdverb("~/?");
        assertTrue(queen.getAdverb().matches("charismatically"));
    }//end setQueenAdverbSpecCharFail

    //clothing tests
    @Test
    public void getQueenClothPass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getCloth().matches(""));
    }//end getQueenClothPass
    @Test
    public void setQueenClothPass()
    {
        Mad queen = new Mad();
        queen.setCloth("trousers");
        assertTrue(queen.getCloth().matches("trousers"));
    }//end setQueenClothPass

    //tests fail
    @Test
    public void setQueenClothUpperFail()
    {
        Mad queen = new Mad();
        queen.setCloth("Trousers");
        assertTrue(queen.getCloth().matches("monocle"));
    }//end setQueenClothUpperFail
    @Test
    public void setQueenClothBlankFail()
    {
        Mad queen = new Mad();
        queen.setCloth("");
        assertTrue(queen.getCloth().matches("monocle"));
    }//end setQueenClothBlankFail
    @Test
    public void setQueenClothNumFail()
    {
        Mad queen = new Mad();
        queen.setCloth("123");
        assertTrue(queen.getCloth().matches("monocle"));
    }//end setQueenClothNumFail
    @Test
    public void setQueenClothSpecCharFail()
    {
        Mad queen = new Mad();
        queen.setCloth("~/?\\");
        assertTrue(queen.getCloth().matches("monocle"));
    }//end setQueenClothSpecCharFail

    //phrase tests
    //passes
    @Test
    public void getQueenPhrasePass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getPhrase().matches(""));
    }//end getQueenPhrasePass
    @Test
    public void setQueenPhrasePass()
    {
        Mad queen = new Mad();
        queen.setPhrase("\"what goes around comes around\"");
        assertTrue(queen.getPhrase().matches("\"what goes around comes around\""));
    }//end setQueenPhrasePass
    @Test
    public void setQueenPhraseNumPass()
    {
        Mad queen = new Mad();
        queen.setPhrase("\"123\"");
        assertTrue(queen.getPhrase().matches("\"123\""));
    }//end setQueenPhraseNumpass
    @Test
    public void setQueenPhraseSpecCharPass()
    {
        Mad queen = new Mad();
        queen.setPhrase("\" %&@ \"");
        assertTrue(queen.getPhrase().matches("\" %&@ \""));
    }

    //fails
    @Test
    public void setQueenPhraseNoQuoteFail()
    {
        Mad queen = new Mad();
        queen.setPhrase("what goes around comes around");
        assertTrue(queen.getPhrase().matches("\"an eye for an eye buckaroo\""));
    }
    @Test
    public void setQueenPhraseBlankFail()
    {
        Mad queen = new Mad();
        queen.setPhrase("");
        assertTrue(queen.getPhrase().matches("\"an eye for an eye buckaroo\""));
    }//end setQueenPhraseBlankFail
    @Test
    public void setQueenPhraseSpecCharNoQuoteFail()
    {
        Mad queen = new Mad();
        queen.setPhrase("~?\\");
        assertTrue(queen.getPhrase().matches("\"an eye for an eye buckaroo\""));
    }//end setQueenPhraseSpecCharNoQuoteFail
    @Test
    public void setQueenPhraseNumNoQuoteFail()
    {
        Mad queen = new Mad();
        queen.setPhrase("123");
        assertTrue(queen.getPhrase().matches("\"an eye for an eye buckaroo\""));
    }//end setQueenPhraseNumNoQuoteFail

}