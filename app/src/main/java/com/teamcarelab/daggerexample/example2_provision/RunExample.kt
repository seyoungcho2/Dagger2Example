package com.teamcarelab.daggerexample.example2_provision


fun main(){
    val personComponent : PersonComponent = DaggerPersonComponent.create()
    val string = personComponent.getString() // Example2 Student
    val student = personComponent.getStudent()
    println(student.name) // Example2 Student
}