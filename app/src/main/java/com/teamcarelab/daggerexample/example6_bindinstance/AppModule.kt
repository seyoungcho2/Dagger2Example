package com.teamcarelab.daggerexample.example6_bindinstance

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AppModule {
    @Provides
    fun providesApplication(name : String) = Application(name)
}