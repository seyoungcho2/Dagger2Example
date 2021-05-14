package com.teamcarelab.daggerexample.example5

import com.teamcarelab.daggerexample.example5.data.Person
import dagger.Component

@Component(modules = [PersonModule::class])
interface SchoolComponent {
    fun getStudent(): Person
}