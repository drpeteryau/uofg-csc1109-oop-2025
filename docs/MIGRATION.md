# Consolidation record

This repository consolidates eight earlier repositories. Original commit history stays in those repositories.

## Source to destination

| Source repository | Now lives in |
|---|---|
| `drpeteryau/uofg-csc1109-oop-2025` | `labs/`, `data/`, root `README.md` |
| `drpeteryau/uofg-csc1109-oop-2025-ans` | `solutions/` |
| `drpeteryau/uofg-csc1109-oop-advance-2025` | `advanced/` |
| `drpeteryau/csc1109-example-abstract-interface` | `examples/` |
| `drpeteryau/csc1109-the-sims` | `projects/cli-sims/` |
| `drpeteryau-uofg/ay2324-csc1109-test02` | `assessments/` |
| `drpeteryau-uofg/ay2324-csc1109-oop-project-final-components` | **Not migrated** (student submissions) |
| `drpeteryau-uofg/ay2324-csc1109-pj-components-01` | **Not migrated** (student submissions) |

The last two repositories contain about 65 zip files and compiled classes submitted by AY23/24 student groups, including a student's email address. They were left out deliberately; keep them private or delete them.

## Corrections

| Area | Problem | Fix |
|---|---|---|
| All labs and solutions | Files were named `labNN_*.java` but declared public classes with other names, so `javac` rejected them. Two files declared the same public class `FileReaderExample`. | One class per file, named after the class, in packages |
| Lab 04 | Programs read `sample.txt`, but the data file was `lab04_input.txt` | Path argument, default `data/lab04_input.txt` |
| Lab 04 Ex 2 | Blank lines counted as one word (`"".split("\\s+")` gives one element) | Skip empty lines when counting words |
| Lab 04 Q2 | Whitespace split missed "Glasgow" next to punctuation: 6 found, 7 correct | Word-boundary regex, unit-tested |
| Lab 05 | `Person` snippets were incomplete (`// Getter and Setter methods same as before`) and could not compile; the `final` exercise was an empty class | Complete `Person`, `ImmutablePerson` |
| Lab 05 | `setAge` ignored bad values silently; `setEmail(null)` threw `NullPointerException`; email check accepted nonsense such as `@.` and `.@` | Throw `IllegalArgumentException`; stricter check |
| Lab 05 Q4 | `Circle` was package-private inside `Shape.java` | Separate public class, radius validation |
| Advanced | Four files defined their own `BankAccount` and could not share a folder | One package per topic |
| Advanced | Clone shared mutable state; composition `withdraw` printed "Withdrawn" then re-checked the balance separately | Deep copy of the list; `withdraw` returns a boolean that the account honours |
| Advanced | Immutable class accepted blank ids and `NaN` | Constructor validation |
| Advanced | Reflection output relied on `getDeclaredMethods()` order | Sorted result |
| Abstract/interface | `receipt` override lacked `@Override` and had package-private access; `a.audit()` was commented out | Fixed; added `CashPayment` to show the interface is opt-in |
| CLI Sims | `scanner.nextInt()` crashed on non-numeric input; `setSaving(int)` actually *added* to savings; a second `Main.java.workingSim` copy of the menu; empty "Folder Structure" in the README | Defensive `readChoice`; `earn(int)`; `WorkingSimMain`; README completed. `SimCharacter` public signatures are unchanged |
| Test 02 | Only compiled classes and Javadoc for `StudentRecord` and `StudentRecordGenerator` were available | Sources reconstructed from bytecode (`javap`), plus a reference solution |
| Build | No build tooling; README linked to a JDK 11 download | Maven (JDK 21), JUnit 5 tests, GitHub Actions CI |

## Not carried over

- Generated Javadoc HTML for `StudentRecord` (regenerate with `mvn javadoc:javadoc`).
- `*.output` files from the advanced samples: timestamps made them non-reproducible; behaviour is now covered by tests.
- Compiled `.class` files.

## Decision for the maintainer

`solutions/` is in the same repository as the exercises, so students can read it. If answers must stay hidden, move that module (and `assessments/.../solution`) to a private repository before making this one public.
