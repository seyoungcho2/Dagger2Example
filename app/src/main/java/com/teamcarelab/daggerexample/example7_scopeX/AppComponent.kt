package com.teamcarelab.daggerexample.example7_scopeX

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun getApplication() : Application
}