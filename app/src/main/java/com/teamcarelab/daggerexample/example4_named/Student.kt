package com.teamcarelab.daggerexample.example4_named

import javax.inject.Inject
import javax.inject.Named

class Student() {
    @Inject
    @Named("Student")
    lateinit var name: String
}