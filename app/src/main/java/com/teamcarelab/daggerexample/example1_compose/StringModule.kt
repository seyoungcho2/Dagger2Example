package com.teamcarelab.daggerexample.example1_compose

import dagger.Module
import dagger.Provides

@Module
class StringModule {
    @Provides
    fun providesString() = "StringA"
}