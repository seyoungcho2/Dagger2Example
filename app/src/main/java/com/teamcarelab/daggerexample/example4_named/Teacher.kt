package com.teamcarelab.daggerexample.example4_named

import javax.inject.Inject
import javax.inject.Named

class Teacher {
    @Inject
    @Named("Teacher")
    lateinit var name: String
}