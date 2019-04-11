package com.kekyazilim.dagger2mvpexample.splash

import com.kekyazilim.dagger2mvpexample.util.handlerProcess.HandlerProcessManagement
import dagger.Module
import dagger.Provides


@Module
class SplashActivityModule {

    @Provides
    fun provideHandlerProcessManagement(): HandlerProcessManagement {
        return HandlerProcessManagement()
    }
}