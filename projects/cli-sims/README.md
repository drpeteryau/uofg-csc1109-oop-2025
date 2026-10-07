# CLI Sims – Object-Oriented Programming Project (CSC1109)

## Overview

This project is a **command-line (CLI) life simulation game** inspired by *The Sims*.  
You will design and implement a modular simulation system using **Java and object-oriented programming (OOP)** principles.

The focus of this project is **software design**, not graphics.

---

## Learning Objectives

By completing this project, you will:

- Apply **object-oriented programming concepts** in a non-trivial system
- Design and integrate **independent modules** using black-box principles
- Practice **team-based software development**
- Experience **realistic system integration challenges**

---

## Project Structure

This project is completed in **two phases**:

### Phase 1 – Module Development
- Each programming team develops **one simulation module**
- The module must interact with the provided `SimCharacter` class
- A report and Javadoc must be produced

### Phase 2 – System Integration
- Teams integrate modules into a **single playable CLI game**
- External modules from other groups will be incorporated
- Emphasis is placed on **interoperability and design quality**

---


## Folder Structure (Recommended)

```
projects/cli-sims/
├── pom.xml
└── src/
    ├── main/java/com/example/sims/
    │   ├── SimCharacter.java         # lecturer-provided, do not change public signatures
    │   ├── Main.java                 # lecturer-provided entry point and menu loop
    │   ├── WorkingSimCharacter.java  # worked example: extend, never modify, SimCharacter
    │   └── WorkingSimMain.java       # menu loop that uses the extension
    └── test/java/com/example/sims/   # unit tests
```

A team module should live in its own package (for example `com.example.sims.<yourmodule>`) and interact with the game only through `SimCharacter`'s public methods.

## Run

```bash
mvn -pl projects/cli-sims -am compile
java -cp projects/cli-sims/target/classes com.example.sims.Main
java -cp projects/cli-sims/target/classes com.example.sims.WorkingSimMain
```

## Worked example: extending a Sim

`WorkingSimCharacter extends SimCharacter` and demonstrates:

- **Inheritance**: reuse `name`, `age`, `hunger`, `energy` through `super(...)` and the public getters/setters (the fields stay `private` in the parent).
- **Overriding**: `sleep()` restores less energy; `displayStatus()` calls `super.displayStatus()` and then adds career lines.
- **Polymorphism**: the menu loop only needs a `SimCharacter`; only `work()` needs the subtype.
- **Black-box integration**: nothing in `SimCharacter` changed, so modules from other teams still work.

## Module design checklist

- [ ] Keeps every public `SimCharacter` signature unchanged.
- [ ] Clamps values through the existing setters (they enforce 0-100).
- [ ] Never crashes on bad input; see `Main.readChoice`.
- [ ] Javadoc on every public class and method.
- [ ] At least one unit test per behaviour (see `SimsTest`).
- [ ] No hidden coupling to another team's classes: depend on an interface you both agree on.
