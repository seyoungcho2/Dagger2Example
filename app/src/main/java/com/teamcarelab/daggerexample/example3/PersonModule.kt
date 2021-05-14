package com.teamcarelab.daggerexample.example3

import dagger.Module
import dagger.Provides

@Module
class PersonModule {
    @Provides
    fun providesString() = "Example2 Student"
}