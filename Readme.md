## Problem Solving menggunakan java

1. Berapa kali string `Hello` dicetak setelah pemanggilan `rusak(1000)` ?

```java
public static void rusak(int n) {
    if (n == 0) {
        return;
    }

    for (int i = 0; i < n; i++) {
        System.out.println("Hello");
    }

    rusak((int) n / 2);
}
```

- dapat dilakukan dengan melakukan perhitungan manual dengan cara:

```markdown
setiap hasil dari iterasi merupakan representasi berapa banyak string hello dicetak

- iterasi-1: 1000
- iterasi-2: 1000 + 500
- iterasi-3: 1000 + 500 + 250
- iterasi-4: 1000 + 500 + 250 + 125
- iterasi-5: 1000 + 500 + 250 + 125 + 62
- iterasi-6: 1000 + 500 + 250 + 125 + 62 + 31
- iterasi-7: 1000 + 500 + 250 + 125 + 62 + 31 + 15
- iterasi-8: 1000 + 500 + 250 + 125 + 62 + 31 + 15 + 7
- iterasi-9: 1000 + 500 + 250 + 125 + 62 + 31 + 15 + 7 + 3
- iterasi-10: 1000 + 500 + 250 + 125 + 62 + 31 + 15 + 7 + 3 + 1
- iterasi-11: 1000 + 500 + 250 + 125 + 62 + 31 + 15 + 7 + 3 + 1 + 0

jadi hasil akhir string hello yang dicetak adalah 1994
```

---

2. Berapakah return value dari pemanggilan `roger(8,8)`?

```java
public static int roger(int k, int b) {
    if (b == 1) return 1;
    else if (k % b == 0) return 1 + roger(k, --b);
    else return 0 + roger(k, --b);
}
```

- dapat dijawab dengan melakukan perhitungan manual dengan cara:

```markdown
hasil dari iterasi merupakan representasi berapa hasil yang dikembalikan oleh fungsi

- iterasi-1: 1
- iterasi-2: 1 + 0
- iterasi-3: 1 + 0 + 0
- iterasi-4: 1 + 0 + 0 + 0 + 1
- iterasi-5: 1 + 0 + 0 + 0 + 1
- iterasi-6: 1 + 0 + 0 + 0 + 1 + 0
- iterasi-7: 1 + 0 + 0 + 0 + 1 + 0 + 1
- iterasi-8: 1 + 0 + 0 + 0 + 1 + 0 + 1 + 1

jadi hasil akhir pemanggilan fungsi roger(8, 8) adalah 4
```

---

3. Buatkan program yang akan menghitung jumlah uppercase, lowercase, angka dan symbol lainnya dalam suatu string.

   #### Input

    ```bash
    pemrogramanDasarJava1
    ```

   #### Output

    ```bash
    uppercase : 2
    lowecase : 18
    angka : 1
    symbol : 0
    ```

    #### dijawab di dalam [code ini](src/IdentifierCount.java)
   ```java
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
   ```
   #### berikut code dalam Main.java

   ```java
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
   ```
   - dalam code tersebut diharuskan untuk input string yang akan dihitung berapa jumlah character uppercase, lowercase, number, dan symbolnya menggunakan regex
   - hasil dari code yang dibuat:
     
   ![hasil output](/Screenshot%20from%202024-06-13%2013-43-18.png)
