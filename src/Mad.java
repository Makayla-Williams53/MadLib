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
    private String adjective2;
    private String place2;
    private String phrase;

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
        this.adjective2 = "";
        this.place2 = "";
        this.phrase = "";
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
        if(!place.matches("[A-Z][a-zA-z\s]*"))
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
        return verb;
    }//end getVerb

    public void setVerb(String verb)
    {
        if(verb.matches("[a-z]+ing$") || !verb.matches("[a-z]+"))
        {
            this.verb = "skip";
        }//end if
        else
        {
            this.verb = verb;
        }//end else
    }//end setVerb

    public String getAdjective2()
    {
        return adjective2;
    }//end getAdjective2

    public void setAdjective2(String adjective2)
    {
        if(adjective2.matches("[A-Za-z]*ly$") || !adjective2.matches("[a-z]+"))
        {
            this.adjective2 = "glamorous";
        }//end if
        else
        {
            this.adjective2 = adjective2;
        }//end else
    }//end setAdjective2

    public String getPlace2()
    {
        return place2;
    }//end getPlace2

    public void setPlace2(String place2)
    {
        if(!place2.matches("[A-Z][a-zA-z\s]*"))
        {
            this.place2 = "Aquarium of the Pacific";
        }//end of if
        else
        {
            this.place2 = place2;
        }//end of else
    }//end setPlace2

    public String getPhrase()
    {
        return phrase;
    }//end getPhrase

    public void setPhrase(String phrase)
    {
        this.phrase = phrase;
    }

}//end of Mad class
