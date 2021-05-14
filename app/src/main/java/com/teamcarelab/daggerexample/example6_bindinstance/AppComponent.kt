package com.teamcarelab.daggerexample.example6_bindinstance

import dagger.BindsInstance
import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {

    fun getApplication() : Application

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun name(name: String) : Builder
        fun build(): AppComponent
    }
}