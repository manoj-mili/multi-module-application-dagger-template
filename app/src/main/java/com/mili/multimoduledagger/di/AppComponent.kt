package com.mili.multimoduledagger.di

import com.mili.core.CoreComponent
import com.mili.multimoduledagger.BaseApplication
import dagger.Component

/**
 * this component is required as we want to inject in our BaseApplication class
 */
@AppScope
@Component(
    dependencies = [CoreComponent::class]
)
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(app: BaseApplication) // this is the reason

}