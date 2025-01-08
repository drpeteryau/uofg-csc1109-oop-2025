/**
 * Author: Dr. Peter Yau
 * Email: PeterCY.Yau@glasgow.ac.uk
 * 
 * Copyright 2025
 * School of Computing Science, University of Glasgow
 *  
 * Disclaimer:
 * Programmers should ensure the environment and settings are correct.
 * This code does not confirm 100% accuracy. Remember to change the filename and 
 * class name to match your specific implementation.
 */

package com.example.encapsulation;

import com.example.utils.StringUtils;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);
        
        String name = person.getName();
        System.out.println("Name: " + name);
        System.out.println("Age: " + person.getAge());

        int vowelCount = StringUtils.countVowels(name);
        System.out.println("Number of vowels in name: " + vowelCount);
    }
}