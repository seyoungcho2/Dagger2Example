package com.teamcarelab.daggerexample.example1

import dagger.Module
import dagger.Provides

@Module
class StringModule {
    @Provides
    fun providesString() = "StringA"
}