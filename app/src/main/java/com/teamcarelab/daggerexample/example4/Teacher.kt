package com.teamcarelab.daggerexample.example4

import javax.inject.Inject
import javax.inject.Named

class Teacher {
    @Inject
    @Named("Teacher")
    lateinit var name: String
}