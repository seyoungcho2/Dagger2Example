package com.teamcarelab.daggerexample.example7_scopeX

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun providesApplication() = Application()
}