package org.jetbrains.kotlin.backend.konan

internal fun konanCleanup(context: Context) {
    context.config.resolvedLibraries.disposeAll()
}