package com.kekyazilim.dagger2mvpexample.mainactivity

import com.kekyazilim.dagger2mvpexample.app.AppModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface MainActivityComponent {

    fun inject(activity: MainActivity)

}