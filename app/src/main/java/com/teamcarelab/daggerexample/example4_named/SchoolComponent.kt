package com.teamcarelab.daggerexample.example4_named


import dagger.Component

@Component(modules = [PersonModule::class])
interface SchoolComponent{
    fun injectStudent(student: Student)
    fun injectTeacher(teacher: Teacher)
}