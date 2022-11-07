public class Mad
{
    String  thing;

    public Mad()
    {
        thing = "";
    }

    public String getThing()
    {
        return thing;
    }

    public void setThing(String thing)
    {
        if(!thing.matches("[a-zA-z][a-z]*"))
        {
            this.thing = "bugs";
        }
        else
        {
            this.thing = thing;
        }
    }
}
