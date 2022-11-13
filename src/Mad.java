public class Mad
{
    //instance variables for each user prompt
    private String thing;
    private String place;
    private String adverb;
    private String cloth;
    private String adjective;
    private String thingsPlural;
    private String verb;

    //default constructor
    public Mad()
    {
        this.thing = "";
        this.place = "";
        this.adverb = "";
        this.cloth = "";
        this.adjective = "";
        this.thingsPlural = "";
        this.verb = "";
    }//end of default constructor

    public String getThing()
    {
        return thing;
    }//end of getThing

    public void setThing(String thing)
    {
        if(!thing.matches("[a-z]+"))
        {
            this.thing = "bug";
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

    public String getAdverb()
    {
        return adverb;
    }//end getAdverb

    public void setAdverb(String adverb)
    {
        if(!adverb.matches("[a-z]*ly$"))
        {
            this.adverb = "charismatically";
        }//end if
        else
        {
            this.adverb = adverb;
        }//end else
    }//end setAdverb

    public String getCloth()
    {
        return cloth;
    }//end getCloth

    public void setCloth(String cloth)
    {
        if(!cloth.matches("[a-z\s]+"))
        {
            this.cloth = "monocle";
        }//end if
        else
        {
            this.cloth = cloth;
        }//end else
    }//end setCloth

    public String getAdjective()
    {
        return adjective;
    }//end getAdjective

    public void setAdjective(String adjective)
    {
        if(adjective.matches("[A-Za-z]*ly$") || !adjective.matches("[a-z]+"))
        {
            this.adjective = "menacing";
        }//end if
        else
        {
            this.adjective = adjective;
        }//end else
    }//end setAdjective

    public String getThingsPlural()
    {
        return thingsPlural;
    }//end getThingPlural

    public void setThingsPlural(String thingsPlural)
    {
        if(!thingsPlural.matches("[a-z0-9\s]+s$"))
        {
            this.thingsPlural = "pikachus";
        }//end if
        else
        {
            this.thingsPlural = thingsPlural;
        }//end else
    }//end setThingsPlural

    public String getVerb()
    {
        return "";
    }//end getVerb

}//end of Mad class
