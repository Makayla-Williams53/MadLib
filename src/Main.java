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
        temp = scanner.nextLine();
        queen.setThing(temp);

        //user input for the place
        System.out.println("Please insert a place (if a word(s) using only letters with an uppercase first letter is not entered \"Narnia\" will be the default)");
        temp = scanner.nextLine();
        queen.setPlace(temp);

        //user input for the adverb
        System.out.println("Please insert an adverb ending in \"ly\" (if a word using only letters with an ending of \"ly\" is not entered \"charismatically\" will be the default)");
        temp = scanner.nextLine();
        queen.setAdverb(temp);

        //user input for the clothing
        System.out.println("Please insert a piece of clothing (if a word using only letters all lowercase is not entered \"monocle\" will be the default)");
        temp = scanner.nextLine();
        queen.setCloth(temp);

        //user input for the adjective
        System.out.println("Please insert an adjective (if a word using only lowercase letters without a \"ly\" ending is not entered \"menacing\" will be the default)");
        temp = scanner.nextLine();
        queen.setAdjective(temp);

        //user input for the things
        System.out.println("Please insert things plural (if a word(s) using letters or numbers with an \"s\" ending is not entered \"pikachus\" will be the default)");
        temp = scanner.nextLine();
        queen.setThingsPlural(temp);

        //user input for the verb
        System.out.println("Please insert a verb in the present tense (if a word using only lowercase letters without an \"ing\" ending is not entered \"skip\" will be the default)");
        temp = scanner.nextLine();
        queen.setVerb(temp);

        //user input for the second adjective
        System.out.println("Please insert an adjective (if a word using only lowercase letters without a \"ly\" ending is not entered \"whimsical\" will be the default)");
        temp = scanner.nextLine();
        queen.setAdjective2(temp);

        //user input for the second place
        System.out.println("Please insert a place (if a word(s) using only letters with an uppercase first letter is not entered \"Aquarium of the Pacific\" will be the default)");
        temp = scanner.nextLine();
        queen.setPlace2(temp);

        //user input for the phrase
        System.out.println("Please insert a phrase (if a word(s) using at least one letter or number is not entered \"an eye for an eye buckaroo\" will be the default)");
        temp = scanner.nextLine();
        queen.setPhrase(temp);

        System.out.println("\nToday I met the Queen of " + queen.getPlace2() + " during a quick trip to " + queen.getPlace() + ". I had left the house because I really needed to pick up a dozen \n" +
                queen.getThingsPlural() + " in order to repair my " + queen.getThing() + ". I wasn't planning on meeting her or I probably wouldn't have worm my " + queen.getAdjective2() + "\n" +
                queen.getCloth() + ". I know most people would have bowed, but I forgot and decided to " + queen.getVerb() + " " + queen.getAdverb() + " instead. She smiled politely and then \n" +
                "said, '" + queen.getPhrase() + ".'");

    }//end of main method
}//end of Main class