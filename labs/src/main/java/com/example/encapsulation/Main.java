/**
 * CSC1109 Object-Oriented Programming
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.encapsulation;

import com.example.utils.StringUtils;

/** Lab 05 Exercises 1(b) and 2(b): use {@link Person} and {@link StringUtils}. */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);

        String name = person.getName();
        System.out.println("Name: " + name);
        System.out.println("Age: " + person.getAge());
        System.out.println("Number of vowels in name: " + StringUtils.countVowels(name));
    }
}
