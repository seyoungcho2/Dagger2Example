package com.teamcarelab.daggerexample.example4


fun main(){
    val personComponent : SchoolComponent = DaggerSchoolComponent.create()
    val student = Student()
    personComponent.injectStudent(student)
    println(student.name) // StudentA

    val teacher = Teacher()
    personComponent.injectTeacher(teacher)
    println(teacher.name) // Teacher
}