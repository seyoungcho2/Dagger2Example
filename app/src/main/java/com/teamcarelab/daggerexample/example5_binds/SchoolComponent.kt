package com.teamcarelab.daggerexample.example5_binds

import com.teamcarelab.daggerexample.example5_binds.data.Person
import dagger.Component

@Component(modules = [PersonModule::class])
interface SchoolComponent {
    fun getStudent(): Person
}