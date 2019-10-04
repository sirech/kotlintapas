package com.hceris.kotlintapas.operators

infix fun <A, B, C> Function1<A, B>.pipe(f2: (B) -> C) = { a: A -> f2(invoke(a)) }
