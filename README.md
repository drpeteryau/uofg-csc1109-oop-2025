# Object Oriented Programming in Java

Welcome to the CSC1109 Object Oriented Programming!

This repository contains sample source code we use in the laboratory and tutorial sessions, to help you understand and implement the core concepts of Object-Oriented Programming (OOP) using the Java programming language.

We recommend using Microsoft Visual Studio Code as your Integrated Development Environment (IDE) for the best experience.

## Table of Contents

- [Object Oriented Programming in Java](#object-oriented-programming-in-java)
  - [Table of Contents](#table-of-contents)
  - [Introduction](#introduction)
  - [Installation](#installation)
  - [Concepts Covered](#concepts-covered)
    - [1. Encapsulation](#1-encapsulation)
    - [2. Inheritance](#2-inheritance)
    - [3. Polymorphism](#3-polymorphism)
    - [4. Abstraction](#4-abstraction)
  - [Usage](#usage)
  - [Contributing](#contributing)
  - [Acknowledgments](#acknowledgments)
  - [Contacts](#contacts)

## Introduction

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects" that group data and methods. This repository serves as a practical introduction to OOP in Java, featuring examples and explanations of the key principles: Encapsulation, Inheritance, Polymorphism, and Abstraction.

## Installation

1. **Clone the Repository**
   ```bash
   git clone git@github.com:drpeteryau/uofg-csc1109-oop-2025.git
   cd uofg-csc1109-oop-2025
   ```

2. **Open in Visual Studio Code**
   - Open Visual Studio Code.
   - Click on "File" > "Open Folder" and select the cloned repository folder.

3. **Ensure Java Development Kit (JDK) is Installed**
   - We recommend downloading the latest version of the JDK [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

## Concepts Covered

The following OOP concepts are illustrated in this repository with detailed examples:

### 1. Encapsulation

Encapsulation is the bundling of data and methods that operate on the data within a single unit, like a class. It restricts direct access to some of the object's components, which is a good practice for maintaining internal object integrity.

**Example:**
```java
public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
```

### 2. Inheritance

Inheritance is a mechanism where one class acquires the properties and behaviors of a parent class, promoting code reusability.

**Example:**
```java
public class ElectricCar extends Car {
    private int batteryLife;

    public ElectricCar(String model, int year, int batteryLife) {
        super(model, year);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}
```

### 3. Polymorphism

Polymorphism allows methods to do different things based on the object it is acting upon, even though they share the same name.

**Example:**
```java
public class Car {
    public void startEngine() {
        System.out.println("Car engine started");
    }
}

public class ElectricCar extends Car {
    @Override
    public void startEngine() {
        System.out.println("Electric car started silently");
    }
}
```

### 4. Abstraction

Abstraction is the concept of hiding the complex reality and exposing only the necessary parts.

**Example:**
```java
abstract class Vehicle {
    abstract void start();
}

public class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck starting logic...");
    }
}
```

## Usage

- Navigate to each respective Java file to explore the implementation of OOP concepts.
- Modify and run the examples to better understand how each OOP concept works in practice.
- Experiment by creating your own classes and applying the concepts.

## Contributing

Contributions are welcome! Please submit a pull request or create an issue for any bugs, feature requests, or improvements.

For learning and teaching related academic discussion, please go to the the Learning Management System (LMS).

## Acknowledgments

We would like to extend our gratitude to the support from Microsoft MVP Program for providing Azure cloud resources that facilitate learning and teaching. Their support has been invaluable to this project.

<img src="https://lh5.googleusercontent.com/mPMAI0PUGh0Arhx-lSnR829JuYqafCDOa0BZr-3yJ2Fx-EhZDG2Wb_KXw-fyOBrbcEZhtPsgdvTfmenSLPyOd-bfIKcKemGjLJAFo4Osf8N-3P8Wy9NB7nKUvWj_eug_CA=w1280" alt="drawing" style="width:200px;"/>

For more information on the Microsoft MVP Program, visit [here](https://mvp.microsoft.com).

## Contacts

Instructor: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)

Professional Officer: Dr Ariscahyadi Risdianto (ariscahyadi.risdianto@singaporetech.edu.sg)

---

Thank you for visiting our repository! We hope this resource proves valuable in your journey to mastering Object-Oriented Programming with Java.


