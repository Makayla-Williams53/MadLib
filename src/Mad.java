public class Mad
{
    private String thing;

    public Mad()
    {
        this.thing = "";
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

}
