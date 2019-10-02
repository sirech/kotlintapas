# Kotlintapas

This repository is a collection of small problems to illustrate all the cool shit that you can do with [Kotlin](https://kotlinlang.org)


## Requirements

- [IntelliJ](https://www.jetbrains.com/idea/) with the [Kotlin plugin installed](https://plugins.jetbrains.com/plugin/6954-kotlin)
- A configured _JVM_. It can be installed using `brew`:

```
brew cask install java11
```

## Structure of the repository

Each folder in the source contains an exercise, with a README file describing what to do.

### Running the tests

Tests can be run from _IntelliJ_ or in the console by using:

```
./go test
```

### Solutions

Switch to the `solutions` branch if you want to see the solutions for the exercises as well.

### List of exercises

#### Classes

- [dataclasses](./src/main/kotlin/com/hceris/kotlintapas/dataclasses/README.md): Get to know data classes, the alternative to [Lombok](https://projectlombok.org/)
- [destructuring](./src/main/kotlin/com/hceris/kotlintapas/destructuring/README.md): Destructuring, a way of accessing multiple attributes at the same time
- [inheritance](./src/main/kotlin/com/hceris/kotlintapas/inheritance/README.md): How does inheritance look like in _Kotlin_?

#### Functions

- [Higher-order functions](./src/main/kotlin/com/hceris/kotlintapas/higherorderfunctions/README.md): Functions that receive or return functions

#### Collections

- [ranges](./src/main/kotlin/com/hceris/kotlintapas/ranges/README.md): How to manipulate ranges

#### Other

- [scopes](./src/main/kotlin/com/hceris/kotlintapas/scopes/README.md): Less verbosity with scopes

