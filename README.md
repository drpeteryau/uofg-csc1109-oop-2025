# CSC1109 Object-Oriented Programming in Java

Teaching code for **CSC1109 Object-Oriented Programming**, School of Computing Science, University of Glasgow (Singapore). It covers the four pillars of OOP (encapsulation, inheritance, polymorphism, abstraction) through laboratory exercises, worked examples, a team project starter and a past test.

## Repository map

| Module | Contents | Read this first |
|---|---|---|
| [`labs/`](labs/README.md) | Lab 01-05 exercise code (Hello World, Strings/Date/Math, file I/O, encapsulation, packages) | [labs/README.md](labs/README.md) |
| [`solutions/`](solutions/README.md) | Reference answers for Lab 03-05 | [solutions/README.md](solutions/README.md) |
| [`examples/`](examples/README.md) | Abstract class vs interface, side by side | [examples/README.md](examples/README.md) |
| [`advanced/`](advanced/README.md) | Composition vs inheritance, `Cloneable`, immutability, reflection | [advanced/README.md](advanced/README.md) |
| [`projects/cli-sims/`](projects/cli-sims/README.md) | CLI Sims team project: starter code and a worked extension | [projects/cli-sims/README.md](projects/cli-sims/README.md) |
| [`assessments/`](assessments/README.md) | Test 02 (AY23/24) starter and reference solution | [assessments/README.md](assessments/README.md) |
| [`data/`](data) | Shared input files (`lab04_input.txt`) | |

`docs/MIGRATION.md` records where each file came from and what was corrected.

## Quick start

Requirements: **JDK 21** (for example [Eclipse Temurin](https://adoptium.net/)) and **Maven 3.9+**. [Visual Studio Code](https://code.visualstudio.com/) with the "Extension Pack for Java" is recommended.

```bash
git clone https://github.com/drpeteryau/uofg-csc1109-oop-2025.git
cd uofg-csc1109-oop-2025

mvn test                       # compile everything and run all tests
mvn -pl labs -am compile       # build a single module

# run any class from the repository root (so data/ paths resolve)
java -cp labs/target/classes com.example.lab04.LineWordCounter
java -cp projects/cli-sims/target/classes com.example.sims.Main
```

Every runnable class has a `main` method. Classes that read files accept an optional path argument and default to `data/lab04_input.txt`.

## OOP concepts at a glance

| Concept | In one sentence | Where to see it |
|---|---|---|
| **Encapsulation** | Hide state behind `private` fields and expose controlled access | `labs` (`Person`), `advanced` (`BankTransaction`) |
| **Inheritance** | A subclass reuses and specialises a superclass (IS-A) | `projects/cli-sims` (`WorkingSimCharacter`), `advanced` (`inheritance`) |
| **Polymorphism** | One reference type, many runtime behaviours | `examples` (`Main`), `solutions` (`Shape`) |
| **Abstraction** | Expose what, hide how: abstract classes and interfaces | `examples`, `solutions` (`Shape`) |
| **Composition** | Build behaviour from collaborating objects (HAS-A) | `advanced` (`composition`) |

## Contributing

Contributions are welcome: open a pull request or an issue for bugs and improvements. Run `mvn test` before submitting. For learning and teaching discussion, please use the Learning Management System (LMS).

## Acknowledgments

We thank the Microsoft MVP Program for providing Azure cloud resources that support learning and teaching. For more information, visit [mvp.microsoft.com](https://mvp.microsoft.com).

## Contacts

- Instructor: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
- Professional Officer: Dr Ariscahyadi Risdianto (ariscahyadi.risdianto@singaporetech.edu.sg)

## Warnings

Scan any files you use or share for viruses and malware before opening or distributing them. It is your responsibility as a computing professional to keep the files you handle safe.
