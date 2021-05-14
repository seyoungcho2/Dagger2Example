package com.teamcarelab.daggerexample.example1

import dagger.Component

@Component(modules = [StringModule::class])
interface StringComponent{
    fun injectString(student: Student)
}