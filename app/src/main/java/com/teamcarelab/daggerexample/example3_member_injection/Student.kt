package com.teamcarelab.daggerexample.example3_member_injection

import javax.inject.Inject

class Student() {
    @Inject
    lateinit var name: String
}