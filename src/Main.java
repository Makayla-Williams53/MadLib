import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Mad queen = new Mad();
        String temp;
        Scanner scanner = new Scanner(System.in);

        //user input the thing
        System.out.println("Please insert a thing (if a word using only letters all lowercase is not entered \"bugs\" will be the default)");
        temp = scanner.next();
        queen.setThing(temp);
        //get rid of this line later
        System.out.println(queen.getThing());

        //user input the place
        System.out.println("Please insert a place (if a word using only letters with an uppercase first letter is not entered \"Narnia\" will be the default");
        temp = scanner.next();
        queen.setPlace(temp);
        //get rid of this line later
        System.out.println(queen.getPlace());

        //user input the adverb
        System.out.println("Please insert and adverb ending in \"ly\" (if a word using only letters with an ending of \"ly\" is not entered \"charismatically\" will be the default");
        temp = scanner.next();
        queen.setAdverb(temp);
        //delete line later
        System.out.println(queen.getAdverb());

    }//end of main method
}//end of Main class