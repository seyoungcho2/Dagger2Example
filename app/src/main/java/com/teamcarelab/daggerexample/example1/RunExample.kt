package com.teamcarelab.daggerexample.example1


fun main(){
    val person = Student()
    DaggerStringComponent.create().injectString(person)
    println(person.name)
}