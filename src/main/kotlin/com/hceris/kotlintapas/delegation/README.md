# Delegation

Delegation is the mark of true leadership. _Kotlin_, wanting to be a leader in the space, cannot afford not to have delegates.

Delegates also are a way to implement [composition over inheritance](https://medium.com/@rufuszh90/effective-java-item-16-favour-composition-over-inheritance-ed82e482fd1a)

## Official Docs

https://kotlinlang.org/docs/reference/delegation.html

## Problem

- Our `ForwardingCounter` is just there to provide a safe way of extending `Counter`, yet it has a lot of boilerplate. Can we reduce it by using delegates?
