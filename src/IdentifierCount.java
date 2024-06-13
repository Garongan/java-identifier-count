import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifierCount {
    // declaration attribute of class
    private final String string;
    private Integer uppercaseCount;
    private Integer lowercaseCount;
    private Integer numberCount;
    private Integer symbolCount;

    // declare the constructor
    public IdentifierCount(String string) {
        this.string = string;
        this.uppercaseCount = 0;
        this.lowercaseCount = 0;
        this.numberCount = 0;
        this.symbolCount = 0;
    }

    // function to set the value of attribute uppercaseCount, lowercaseCount, numberCount, and symbolCount
    public void countSameChar() {
        // call the function to count string if matches regex argument
        this.uppercaseCount = calculateMatchPattern("[A-Z]");
        this.lowercaseCount = calculateMatchPattern("[a-z]");
        this.numberCount = calculateMatchPattern("[0-9]");
        this.symbolCount = calculateMatchPattern("[[^a-z]&&[^A-Z]&&[^0-9]&&[^ ]]");
    }

    // function to calculate pattern if match from regex parameter
    private int calculateMatchPattern(String regex) {
        int count = 0;
        Pattern compile = Pattern.compile(regex);
        Matcher matcher = compile.matcher(string);
        while (matcher.find()) {
            ++count;
        }
        return count;
    }

    // override toString function from object to print the result
    @Override
    public String toString() {
        return String.format("uppercase: %s \nlowercase: %s \nangka : %s \nsymbol : %s", uppercaseCount, lowercaseCount, numberCount, symbolCount);
    }
}
