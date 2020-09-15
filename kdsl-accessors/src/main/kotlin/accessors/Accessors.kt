package accessors

import api.Action
import api.SpecializedContainer

val specialized: SpecializedContainer
    get() = SpecializedContainer()

fun specialized(action: Action<SpecializedContainer>): Unit =
    action.execute(specialized)
