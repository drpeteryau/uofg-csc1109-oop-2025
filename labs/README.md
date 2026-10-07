# Labs (Lab 01-05)

Package `com.example.*`. Run from the repository root.

| Lab | Class | Topic |
|---|---|---|
| 01 | `lab01.HelloWorld` | Compile and run a first program |
| 03 | `lab03.StringExample`, `DateExample`, `MathExample` | `String` (immutable), `Date` vs `java.time`, `Math` |
| 04 | `lab04.FileReaderExample`, `LineWordCounter` | `BufferedReader`, try-with-resources, `IOException` |
| 05 | `encapsulation.Person`, `Main`, `ImmutablePerson`; `utils.StringUtils` | Private fields, validated setters, packages, `final` classes |

## Learning objectives

- Explain why Java requires a public class name to match its file name, and compile/run a class in a package.
- Choose the right API for text, dates and maths, and know when an API is legacy.
- Read a file safely: always close resources, always handle `IOException`.
- Protect an object's invariants with encapsulation (reject bad input, do not silently ignore it).

## Common mistakes

| Mistake | Why it happens | Fix |
|---|---|---|
| `class X is public, should be declared in a file named X.java` | File name differs from the public class | Name the file after the class |
| Output of `"".split("\\s+").length` is `1` | Splitting an empty string yields one empty element | Check `isEmpty()` before counting words |
| `FileNotFoundException` | Relative paths resolve from the *working directory*, not the source folder | Run from the repository root, or pass an absolute path |
| `greeting.toUpperCase();` seems to do nothing | `String` is immutable; the result is discarded | Assign the result |
| `setAge(-5)` silently ignored | Hidden failure | Throw `IllegalArgumentException` |

## Extension exercises

1. Make `LineWordCounter` ignore lines that start with `#` and report how many were skipped.
2. Add a `Person.setEmail` with validation, then compare your version with `solutions/`.
3. Make `Person` immutable without copying `ImmutablePerson`: what has to change, and what do callers lose?
4. Write a JUnit test that proves `Person.setAge(0)` throws.
