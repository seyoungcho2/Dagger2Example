package com.teamcarelab.daggerexample.example9_custom_scope

import com.teamcarelab.daggerexample.example9_custom_scope.scope.CustomScope
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @CustomScope
    @Provides
    fun providesApplication() = Application()
}