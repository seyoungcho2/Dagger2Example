package com.teamcarelab.daggerexample.example8_scopeO

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun providesApplication() = Application()
}