package com.kekyazilim.dagger2mvpexample.splash

import com.kekyazilim.dagger2mvpexample.app.AppModule
import com.kekyazilim.dagger2mvpexample.util.intentProcess.IntentModule
import dagger.Component
import javax.inject.Singleton

@Component(
    modules = [
        (AppModule::class),
        (IntentModule::class),
        (SplashActivityModule::class)
    ]
)
interface SplashActivityComponent {

    fun inject(activity: SplashActivity)
}