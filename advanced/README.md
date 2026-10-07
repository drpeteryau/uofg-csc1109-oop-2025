# Advanced topics

Package `com.example.advanced.*`. Each topic uses its own package, so the repeated `BankAccount` name does not clash.

| Package | Topic | Key point |
|---|---|---|
| `inheritance` | IS-A design | A `LoanAccount` inherits `deposit` that makes no sense for a loan |
| `composition` | HAS-A design | Behaviour lives in injected services; only relevant methods are exposed |
| `cloning` | `Cloneable` | `super.clone()` is **shallow**; mutable fields must be copied by hand |
| `immutability` | Immutable value objects | `final` class, `private final` fields, no setters, validate in the constructor |
| `reflection` | Annotations + reflection | `RetentionPolicy.RUNTIME` is required for runtime discovery |

## Learning objectives

- Choose between inheritance and composition and justify the choice.
- Explain shallow vs deep copy and demonstrate the bug when a mutable field is shared.
- Build an immutable class, including the defensive-copy rule for mutable fields.
- Read annotations at runtime, and know that `getDeclaredMethods()` order is unspecified.

## Common mistakes

- Using inheritance for code reuse alone (it should model IS-A).
- Forgetting that a shallow clone shares the same `List`. Remove the copy line in `cloning.BankAccount.clone()` and run the test to see it fail.
- Exposing a mutable field from an "immutable" class through a getter.

## Extension exercises

1. Replace `Cloneable` with a copy constructor. Which is easier to get right?
2. Turn `BankTransaction` into a Java `record`. What do you gain and what validation must you keep?
3. Add a `@Deprecated`-style annotation of your own and list annotated methods with reflection.
