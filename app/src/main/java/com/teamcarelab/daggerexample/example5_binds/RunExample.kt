package com.teamcarelab.daggerexample.example5_binds

import com.teamcarelab.daggerexample.example5_binds.data.Person


fun main() {
    val personComponent: SchoolComponent = DaggerSchoolComponent.create()
    val student: Person = personComponent.getStudent()
    println(student.getPersonName()) // StudentA
}