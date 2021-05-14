package com.teamcarelab.daggerexample.example5

import com.teamcarelab.daggerexample.example5.data.Person


fun main() {
    val personComponent: SchoolComponent = DaggerSchoolComponent.create()
    val student: Person = personComponent.getStudent()
    println(student.getPersonName()) // StudentA
}