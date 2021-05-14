package com.teamcarelab.daggerexample.example3_member_injection

import dagger.Component

@Component(modules = [PersonModule::class])
interface SchoolComponent{
    fun injectStudent(student: Student)
    fun injectTeacher(teacher: Teacher)
}