package com.teamcarelab.daggerexample.example4_named

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class PersonModule {
    @Provides
    @Named("Student")
    fun providesStudentName() = "StudentA"

    @Provides
    @Named("Teacher")
    fun providesTeacherName() = "TeacherB"
}