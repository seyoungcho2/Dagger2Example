package com.teamcarelab.daggerexample.example2

import com.teamcarelab.daggerexample.example2.PersonModule
import com.teamcarelab.daggerexample.example2.Student
import dagger.Component

@Component(modules = [PersonModule::class])
interface PersonComponent{
    fun getString() : String
    fun getStudent() : Student
}