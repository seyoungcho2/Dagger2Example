package com.teamcarelab.daggerexample.example2

import dagger.Module
import dagger.Provides

@Module
class PersonModule {
    @Provides
    fun providesString() = "Example2 Student"
}