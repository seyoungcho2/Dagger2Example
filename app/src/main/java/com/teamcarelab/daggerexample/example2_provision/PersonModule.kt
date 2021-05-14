package com.teamcarelab.daggerexample.example2_provision

import dagger.Module
import dagger.Provides

@Module
class PersonModule {
    @Provides
    fun providesString() = "Example2 Student"
}