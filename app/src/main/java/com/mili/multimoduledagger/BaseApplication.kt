package com.mili.multimoduledagger

import android.app.Application
import android.util.Log
import com.mili.core.CoreComponent
import com.mili.core.CoreComponentProvider
import com.mili.core.DaggerCoreComponent
import com.mili.multimoduledagger.di.DaggerAppComponent
import retrofit2.Retrofit
import javax.inject.Inject

class BaseApplication(): Application(), CoreComponentProvider  {
    private val TAG = "BaseApplication"
    private lateinit var coreComponent: CoreComponent

    /**
     * there is no need to inject retrofit here this is just to show that application class can also be injected
     */
    @Inject
    lateinit var retrofit: Retrofit

    override fun onCreate() {
        super.onCreate()
        coreComponent = DaggerCoreComponent.factory().create(this)
        DaggerAppComponent.factory().create(coreComponent).inject(this)
        Log.d(TAG, "onCreate: $retrofit")
    }

    override fun provideCoreComponent(): CoreComponent {
        return coreComponent
    }
}