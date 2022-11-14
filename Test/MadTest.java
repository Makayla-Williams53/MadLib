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
        assertTrue(queen.getThing().matches("bug"));
    }//end of setQueenThingUpperFail
    @Test
    public void setQueenThingNumFail()
    {
        Mad queen = new Mad();
        queen.setThing("123");
        assertTrue(queen.getThing().matches("bug"));
    }//end of setQueenThingNumFail
    @Test
    public void setQueenThingBlankFail()
    {
        Mad queen = new Mad();
        queen.setThing("");
        assertTrue(queen.getThing().matches("bug"));
    }//end of setQueenThingBlankFail
    @Test
    public void setQueenThingSpecCharFail()
    {
        Mad queen = new Mad();
        queen.setThing("*/?");
        assertTrue(queen.getThing().matches("bug"));
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
    @Test
    public void setQueenPlaceTwoWordsPass()
    {
        Mad queen = new Mad();
        queen.setPlace("Aquarium of the Pacific");
        assertTrue(queen.getPlace().matches("Aquarium of the Pacific"));
    }//end setQueenPLaceTwoWordsPass

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
    }//end setQueenPlaceBlankFail

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
    @Test
    public void setQueenClothTwoWordsPass()
    {
        Mad queen = new Mad();
        queen.setCloth("pinstripe suit");
        assertTrue(queen.getCloth().matches("pinstripe suit"));
    }

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

    //adjective tests
    //passes
    @Test
    public void getQueenAdjectivePass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getAdjective().matches(""));
    }//end getQueenAdjectivePass

    @Test
    public void setQueenAdjectivePass()
    {
        Mad queen = new Mad();
        queen.setAdjective("wonderful");
        assertTrue(queen.getAdjective().matches("wonderful"));
    }//end setQueenAdjectivePass

    //fails
    @Test
    public void setQueenAdjectiveLyFail()
    {
        Mad queen = new Mad();
        queen.setAdjective("wonderfully");
        assertTrue(queen.getAdjective().matches("menacing"));
    }//end setQueenAdjectiveLyFail
    @Test
    public void setQueenAdjectiveUpperFail()
    {
        Mad queen = new Mad();
        queen.setAdjective("Wonderful");
        assertTrue(queen.getAdjective().matches("menacing"));
    }//end setQueenAdjectiveUpperFail
    @Test
    public void setQueenAdjectiveBlankFail()
    {
        Mad queen = new Mad();
        queen.setAdjective("");
        assertTrue(queen.getAdjective().matches("menacing"));
    }//end setQueenAdjectiveBlankFail
    @Test
    public void setQueenAdjectiveNumFail()
    {
        Mad queen = new Mad();
        queen.setAdjective("123");
        assertTrue(queen.getAdjective().matches("menacing"));
    }//end setQueenAdjectiveNumFail
    @Test
    public void setQueenAdjectiveSpecCharFail()
    {
        Mad queen = new Mad();
        queen.setAdjective("!?~\\");
        assertTrue(queen.getAdjective().matches("menacing"));
    }//end setQueenAdjectiveSpecCharFail

    //Thing plural test
    //passes
    @Test
    public void getQueenThingsPluralPass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getThingsPlural().matches(""));
    }//end test getQueenThingPluralPass
    @Test
    public void setQueenThingsPluralPass()
    {
        Mad queen = new Mad();
        queen.setThingsPlural("donkeys");
        assertTrue(queen.getThingsPlural().matches("donkeys"));
    }//end setQueenThingsPluralPass
    @Test
    public void setQueenThingsPluralNumPass()
    {
        Mad queen = new Mad();
        queen.setThingsPlural("1s");
        assertTrue(queen.getThingsPlural().matches("1s"));
    }//end setQueenThingsPluralNumPass
    @Test
    public void setQueenThingsPluralTwoWordsPass()
    {
        Mad queen = new Mad();
        queen.setThingsPlural("question marks");
        assertTrue(queen.getThingsPlural().matches("question marks"));
    }

    //fails
    @Test
    public void setQueenThingsPluralNoSFail()
    {
        Mad queen = new Mad();
        queen.setThingsPlural("donkey");
        assertTrue(queen.getThingsPlural().matches("pikachus"));
    }//end setQueenThingsPluralNoSFail
    @Test
    public void setQueenThingsPluralUpperFail()
    {
        Mad queen = new Mad();
        queen.setThingsPlural("Donkeys");
        assertTrue(queen.getThingsPlural().matches("pikachus"));
    }//end setQueenThingsPluralUpperFail
    @Test
    public void setQueenThingsPluralBlankFail()
    {
        Mad queen = new Mad();
        queen.setThingsPlural("");
        assertTrue(queen.getThingsPlural().matches("pikachus"));
    }//end setQueenThingsPluralBlankFail
    @Test
    public void setQueenThingsPluralSpecCharFail()
    {
        Mad queen = new Mad();
        queen.setThingsPlural("!s");
        assertTrue(queen.getThingsPlural().matches("pikachus"));
    }//end setQueenThingsPluralSpecCharFail
    @Test
    public void setQueenThingsPluralJustSFail()
    {
        Mad queen = new Mad();
        queen.setThingsPlural("s");
        assertTrue(queen.getThingsPlural().matches("pikachus"));
    }//end setQueenThingsPluralJustSFail

    //Verb tests
    //passes
    @Test
    public void getQueenVerbPass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getVerb().matches(""));
    }//end getQueenVerbPass
    @Test
    public void setQueenVerbPass()
    {
        Mad queen = new Mad();
        queen.setVerb("run");
        assertTrue(queen.getVerb().matches("run"));
    }//end setQueenVerbPass

    //fails
    @Test
    public void setQueenVerbIngFail()
    {
        Mad queen = new Mad();
        queen.setVerb("running");
        assertTrue(queen.getVerb().matches("skip"));
    }//end setQueenVerbIngFail
    @Test
    public void setQueenVerbUpperFail()
    {
        Mad queen = new Mad();
        queen.setVerb("Run");
        assertTrue(queen.getVerb().matches("skip"));
    }//end setQueenVerbUpperFail
    @Test
    public void setQueenVerbBlankFail()
    {
        Mad queen = new Mad();
        queen.setVerb("");
        assertTrue(queen.getVerb().matches("skip"));
    }//end setQueenVerbBlankFail
    @Test
    public void setQueenVerbNumFail()
    {
        Mad queen = new Mad();
        queen.setVerb("123");
        assertTrue(queen.getVerb().matches("skip"));
    }//end setQueenVerbNumFail
    @Test
    public void setQueenVerbSpecCharFail()
    {
        Mad queen = new Mad();
        queen.setVerb("~!@\\");
        assertTrue(queen.getVerb().matches("skip"));
    }//end setQueenVerbSpecCharFail

    //Adjective2 tests
    //passes
    @Test
    public void getQueenAdjective2Pass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getAdjective2().matches(""));
    }//end getQueenAdjective2Pass
    @Test
    public void setQueenAdjective2Pass()
    {
        Mad queen = new Mad();
        queen.setAdjective2("whimsical");
        assertTrue(queen.getAdjective2().matches("whimsical"));
    }//end setQueenAdjective2Pass

    //fails
    @Test
    public void setQueenAdjective2LyFail()
    {
        Mad queen = new Mad();
        queen.setAdjective2("whimsically");
        assertTrue(queen.getAdjective2().matches("glamorous"));
    }//end setQueenAdjective2LyFail
    @Test
    public void setQueenAdjective2UpperFail()
    {
        Mad queen = new Mad();
        queen.setAdjective2("Whimsical");
        assertTrue(queen.getAdjective2().matches("glamorous"));
    }//end setQueenAdjective2UpperFail
    @Test
    public void setQueenAdjective2BlankFail()
    {
        Mad queen = new Mad();
        queen.setAdjective2("");
        assertTrue(queen.getAdjective2().matches("glamorous"));
    }//end setQueenAdjective2BlankFail
    @Test
    public void setQueenAdjective2NumFail()
    {
        Mad queen = new Mad();
        queen.setAdjective2("123");
        assertTrue(queen.getAdjective2().matches("glamorous"));
    }// end setQueenAdjective2NumFail
    @Test
    public void setQueenAdjective2SpecCharFail()
    {
        Mad queen = new Mad();
        queen.setAdjective2("123");
        assertTrue(queen.getAdjective2().matches("glamorous"));
    }// end setQueenAdjective2SpecCharFail

    //Place2 test
    //passes
    @Test
    public void getQueenPlace2Pass()
    {
        Mad queen = new Mad();
        assertTrue(queen.getPlace2().matches(""));
    }//end getQueenPlace2Pass
    @Test
    public void setQueenPlace2Pass()
    {
        Mad queen = new Mad();
        queen.setPlace2("Canada");
        assertTrue(queen.getPlace2().matches("Canada"));
    }//end setQueenPlace2Pass
    @Test
    public void setQueenPlace2TwoWordPass()
    {
        Mad queen = new Mad();
        queen.setPlace2("Chuck E Cheese");
        assertTrue(queen.getPlace2().matches("Chuck E Cheese"));
    }//end setQueenPlace2TwoWordPass

    //fails
    @Test
    public void setQueenPlace2NoUpperFail()
    {
        Mad queen = new Mad();
        queen.setPlace2("canada");
        assertTrue(queen.getPlace2().matches("Aquarium of the Pacific"));
    }//end setQueenPlace2NoUpperFail
    @Test
    public void setQueenPlace2BlankFail()
    {
        Mad queen = new Mad();
        queen.setPlace2("");
        assertTrue(queen.getPlace2().matches("Aquarium of the Pacific"));
    }//end setQueenPlace2BlankFail
    @Test
    public void setQueenPlace2NumFail()
    {
        Mad queen = new Mad();
        queen.setPlace2("123");
        assertTrue(queen.getPlace2().matches("Aquarium of the Pacific"));
    }//end setQueenPlace2NumFail
    @Test
    public void setQueenPlace2SpecCharFail()
    {
        Mad queen = new Mad();
        queen.setPlace2("!@~`");
        assertTrue(queen.getPlace2().matches("Aquarium of the Pacific"));
    }//end setQueenPlace2SpecCharFail

}//end class MadTest