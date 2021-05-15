package com.teamcarelab.daggerexample.example8_scopeO

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getApplication() : Application
}