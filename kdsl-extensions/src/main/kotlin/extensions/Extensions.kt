package extensions

import api.Container

class ContainerScope<T : Any>(private val container: Container<T>) : Container<T> by container {
    fun scopeFunction() = Unit
}

inline operator fun <T : Any, C : Container<T>> C.invoke(action: ContainerScope<T>.() -> Unit): C =
    apply { action(ContainerScope(this)) }
