package com.teamcarelab.daggerexample.example1_compose


fun main(){
    val person = Student()
    DaggerStringComponent.create().injectString(person)
    println(person.name)
}