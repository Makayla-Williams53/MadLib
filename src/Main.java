import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Mad queen = new Mad();
        String temp;
        Scanner scanner = new Scanner(System.in);

        //user input for the thing
        System.out.println("Please insert a thing (if a word using only letters all lowercase is not entered \"bug\" will be the default)");
        temp = scanner.next();
        queen.setThing(temp);

        //user input for the place
        System.out.println("Please insert a place (if a word(s) using only letters with an uppercase first letter is not entered \"Narnia\" will be the default)");
        temp = scanner.nextLine();
        queen.setPlace(temp);

        //user input for the adverb
        System.out.println("Please insert an adverb ending in \"ly\" (if a word using only letters with an ending of \"ly\" is not entered \"charismatically\" will be the default)");
        temp = scanner.next();
        queen.setAdverb(temp);

        //user input for the clothing
        System.out.println("Please insert a piece of clothing (if a word using only letters all lowercase is not entered \"monocle\" will be the default)");
        temp = scanner.nextLine();
        queen.setCloth(temp);

        //user input for the adjective
        System.out.println("Please insert an adjective (if a word using only lowercase letters without a \"ly\" ending is not entered \"menacing\" will be the default)");
        temp = scanner.next();
        queen.setAdjective(temp);

        System.out.println("Please insert things plural (if a word(s) using letters or numbers with an \"s\" ending is not entered \"pikachus\" will be the default)");
        temp = scanner.nextLine();
        queen.setThingsPlural(temp);

        System.out.println("Please insert a verb in the present tense (if a word using only lowercase letters without an \"ing\" ending is not entered \"skip\" will be the default)");
        temp = scanner.next();
        queen.setVerb(temp);

        System.out.println("Please insert an adjective (if a word using only lowercase letters without a \"ly\" ending is not entered \"whimsical\" will be the default)");
        temp = scanner.next();
        queen.setAdjective2(temp);

    }//end of main method
}//end of Main class