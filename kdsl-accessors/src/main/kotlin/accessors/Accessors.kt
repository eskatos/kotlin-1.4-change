package accessors

import api.SpecializedContainer

val specialized: SpecializedContainer
    get() = SpecializedContainer()

fun specialized(action: SpecializedContainer.() -> Unit): Unit =
    action(specialized)
