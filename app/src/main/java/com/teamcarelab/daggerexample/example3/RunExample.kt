package com.teamcarelab.daggerexample.example3


fun main(){
    val personComponent : SchoolComponent = DaggerSchoolComponent.create()
    val student = Student()
    personComponent.injectStudent(student)
    println(student.name) // Example3 name

    val teacher = Teacher()
    personComponent.injectTeacher(teacher)
    println(teacher.name)
}