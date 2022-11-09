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

    }//end of main method
}//end of Main class