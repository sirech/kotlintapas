# Operator overloading

Operator overloading used to be something that people would use to scare kids, usually in combination with some C++ monstrosity.

However, _Kotlin_ has very sensible policies about it. Certain operators can be overriden in order to make a much more readable experience.

## Official Docs

https://kotlinlang.org/docs/reference/operator-overloading.html

## Context

Have a look at the different possibilities in the `MyInt` and `MyMap` classes

## Problem

- We defined a `pipe` function, but it is not very readable. We would like to use infix syntax to make it nice and shiny
