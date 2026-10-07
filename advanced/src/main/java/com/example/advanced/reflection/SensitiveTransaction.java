/**
 * CSC1109 Object-Oriented Programming (Advanced)
 * Author: Dr Peter Yau (PeterCY.Yau@glasgow.ac.uk)
 * School of Computing Science, University of Glasgow
 */

package com.example.advanced.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Marks a method as a sensitive transaction that must be logged. */
@Retention(RetentionPolicy.RUNTIME) // without RUNTIME retention, reflection cannot see it
@Target(ElementType.METHOD)
public @interface SensitiveTransaction {
}
