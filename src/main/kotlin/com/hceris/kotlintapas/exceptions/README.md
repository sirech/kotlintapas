# Exceptions

Exceptions are bad. There, I said it.

They are a hidden goto that can blow up your program when you least expect it. To make it better, _Java_ forces you to carry them all over the signature of your methods.

_Kotlin_ only has unchecked exceptions. Also, its try/catch block is, like the if block, an expression. Which leads to more compact code. We like that.

## Official Docs

https://kotlinlang.org/docs/reference/exceptions.html


## Problem

- `moodyOperation` is known to throw exceptions every now and then. Let's modify the code so that our `bad` method returns the expectedv alue despite this.
- *BONUS*: You can use a single line method for this.
