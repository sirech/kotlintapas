# Sealed classes

Sealed classes are used for representing restricted class hierarchies, when a value can have one of the types from a limited set, but cannot have any other type. 
Sealed classes are, in a sense like enums.
The idiomatic way is to use `when` as an expression, not as a statement.

## Official Docs

https://kotlinlang.org/docs/reference/sealed-classes.html

## Problem

- When using enums, each enum value only exists as a single instance, whereas a subclass of a sealed class can have multiple instances which can contain state.
- The abstract base class can only be extended by classes which must be declared in the same file as the sealed class itself.
- The key benefit of using sealed classes comes into play when you use them in a `when` expression.
