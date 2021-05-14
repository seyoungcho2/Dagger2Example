package com.teamcarelab.daggerexample.example5

import com.teamcarelab.daggerexample.example5.data.Person
import com.teamcarelab.daggerexample.example5.data.Student
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class PersonModule {
    @Binds
    abstract fun providesStudentWithName(student: Student): Person

    companion object {
        @Provides
        fun providesString() = "StudentA"
    }
}