package com.teamcarelab.daggerexample.example3_member_injection

import dagger.Module
import dagger.Provides

@Module
class PersonModule {
    @Provides
    fun providesString() = "Example2 Student"
}