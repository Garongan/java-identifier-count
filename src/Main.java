import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // getting input from terminal by text
        Scanner scanner = new Scanner(System.in);

        // assign input from terminal to variable
        System.out.print("Please input the text to check!: ");
        String input = scanner.nextLine();

        // instance class identifier count to access the method or attribute
        IdentifierCount identifierCount = new IdentifierCount(input);

        // call the method to count same char from instance
        identifierCount.countSameChar();

        // print the result
        System.out.println(identifierCount.toString());
    }
}