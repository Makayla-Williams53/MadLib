public class Mad
{
    String  thing;

    public Mad(String thing)
    {
        setThing(thing);
    }

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
        if(thing.matches("[a-zA-z][a-z]*"))
        {
            this.thing = thing;
        }
        else
        {
            this.thing = "bugs";
        }
    }
}
