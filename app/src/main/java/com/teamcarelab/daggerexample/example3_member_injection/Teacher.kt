package com.teamcarelab.daggerexample.example3_member_injection

import javax.inject.Inject

class Teacher {
    lateinit var name: String

    @Inject
    fun setTeacherName(name : String){
        this.name = name
    }
}