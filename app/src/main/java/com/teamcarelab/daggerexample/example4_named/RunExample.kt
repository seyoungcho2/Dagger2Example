package com.teamcarelab.daggerexample.example4_named


fun main(){
    val personComponent : SchoolComponent = DaggerSchoolComponent.create()
    val student = Student()
    personComponent.injectStudent(student)
    println(student.name) // StudentA

    val teacher = Teacher()
    personComponent.injectTeacher(teacher)
    println(teacher.name) // Teacher
}