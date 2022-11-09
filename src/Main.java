import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Mad queen = new Mad();
        String temp;

        System.out.println("Please insert a thing (if a word using only letters all lowercase is not entered \"bugs\" will be the default)");
        Scanner scanner = new Scanner(System.in);
        temp = scanner.next();
        queen.setThing(temp);
        System.out.println(queen.getThing());
    }
}