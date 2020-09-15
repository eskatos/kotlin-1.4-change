package com.example

import extensions.ContainerScope
import extensions.invoke
import accessors.specialized

fun main() {

    specialized {
        specialFunction()
        // scopeFunction()
    }

    println("It works!")
}
