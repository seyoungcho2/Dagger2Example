package com.teamcarelab.daggerexample.example1_compose

import dagger.Component

@Component(modules = [StringModule::class])
interface StringComponent{
    fun injectString(student: Student)
}