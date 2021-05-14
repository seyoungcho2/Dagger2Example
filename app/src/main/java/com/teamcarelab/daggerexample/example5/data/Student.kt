package com.teamcarelab.daggerexample.example5.data

import javax.inject.Inject

class Student @Inject constructor() : Person {
    @Inject
    lateinit var name: String

    override fun getPersonName() = name
}