package com.teamcarelab.daggerexample.example9_custom_scope

import com.teamcarelab.daggerexample.example9_custom_scope.scope.CustomScope
import dagger.Component

@CustomScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getApplication() : Application
}