# Reference solutions (Lab 03-05)

Package `com.example.solutions.*`. Try each lab yourself first, then compare.

| Lab | Question | Class |
|---|---|---|
| 03 | Q1 count vowels | `lab03.StringVowelCounter` |
| 03 | Q2 date plus 7 days | `lab03.DateManipulationExample` (legacy `Calendar` and `java.time`) |
| 03 | Q3 (x^2 + y^2)^(1/2) | `lab03.MathCalculationExample` |
| 04 | Q1 print a file in reverse | `lab04.ReverseFileReader` |
| 04 | Q2 count "Glasgow" | `lab04.WordCountGlasgow` |
| 04 | Q3 skip `#` comments | `lab04.SkipCommentsFileReader` |
| 05 | Q2 `Person` with email | `lab05.Person` |
| 05 | Q3 date utility | `lab05.DateUtils`, `lab05.Main` |
| 05 | Q4 abstract `Shape` | `lab05.Shape`, `Circle`, `ShapeTest` |

## Why Lab 04 Q2 changed

Splitting a line on whitespace and comparing each token with `"Glasgow"` misses occurrences that touch punctuation. On `data/lab04_input.txt` it finds **6**; the correct answer is **7**. The solution uses a word-boundary regex (`\bGlasgow\b`, case-insensitive). A unit test pins the value.

## Discussion points

- Q1: why `Character.toLowerCase` once per character rather than listing ten vowel characters?
- Q2: why is `java.time` preferred over `Calendar`? (immutability, thread safety, clearer API)
- Q3: when would `Math.hypot` beat `Math.sqrt(Math.pow(..) + Math.pow(..))`?
- Q4: what is the benefit of declaring the variable as `Shape` rather than `Circle`?
