package com.teamcarelab.daggerexample.example2_provision

import dagger.Component

@Component(modules = [PersonModule::class])
interface PersonComponent{
    fun getString() : String
    fun getStudent() : Student
}