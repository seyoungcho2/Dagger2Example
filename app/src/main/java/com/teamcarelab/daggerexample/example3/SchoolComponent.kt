package com.teamcarelab.daggerexample.example3

import dagger.Component

@Component(modules = [PersonModule::class])
interface SchoolComponent{
    fun injectStudent(student: Student)
    fun injectTeacher(teacher: Teacher)
}