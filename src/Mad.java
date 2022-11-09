public class Mad
{
    //instance variables for each user prompt
    private String thing;
    private String place;
    private String adverb;

    //default constructor
    public Mad()
    {
        this.thing = "";
        this.place = "";
        this.adverb = "";
    }//end of default constructor

    public String getThing()
    {
        return thing;
    }//end of getThing

    public void setThing(String thing)
    {
        if(!thing.matches("[a-z]+"))
        {
            this.thing = "bugs";
        }//end of if
        else
        {
            this.thing = thing;
        }//end of else
    }//end of setThing

    public String getPlace()
    {
        return place;
    }//end of getPlace

    public void setPlace(String place)
    {
        if(!place.matches("[A-Z][a-z]*"))
        {
            this.place = "Narnia";
        }//end of if
        else
        {
            this.place = place;
        }//end of else
    }//end of setPlace

    public String getAdverb() {
        return adverb;
    }

    public void setAdverb(String adverb)
    {
        if(!adverb.matches("[a-z]*ly$"))
        {
            this.adverb = "charismatically";
        }
        else
        {
            this.adverb = adverb;
        }
    }


}//end of Mad class
