public class Mad
{
    private String thing;
    private String place;

    public Mad()
    {
        this.thing = "";
        this.place = "";
    }

    public String getThing()
    {
        return thing;
    }

    public void setThing(String thing)
    {
        if(!thing.matches("[a-z]+"))
        {
            this.thing = "bugs";
        }
        else
        {
            this.thing = thing;
        }
    }

    public String getPlace()
    {
        return place;
    }

    public void setPlace(String place)
    {
        this.place = place;
    }

}
