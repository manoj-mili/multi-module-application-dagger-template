package com.mili.core

import android.app.Application

/**
 * this class helps get the application wide instance of core component using application component
 * and initialized once in application class
 */
object ComponentProvider {

    fun getCoreComponent(application: Application): CoreComponent {
        return if (application is CoreComponentProvider) {
            application.provideCoreComponent()
        } else {
            throw IllegalStateException("$application should implement CoreComponentProvider")
        }
    }
}