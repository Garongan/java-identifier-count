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
   - dalam code tersebut diharuskan untuk input string yang akan dihitung berapa jumlah character uppercase, lowercase, number, dan symbolnya menggunakan regex
   - hasil dari code yang dibuat:
   ![hasil output](/Screenshot%20from%202024-06-13%2013-43-18.png)