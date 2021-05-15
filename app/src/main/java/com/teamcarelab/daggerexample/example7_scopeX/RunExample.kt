package com.teamcarelab.daggerexample.example7_scopeX


fun main() {
    val appComponent: AppComponent = DaggerAppComponent.create()

    val application1 = appComponent.getApplication()
    val application2 = appComponent.getApplication()

    println(application1 === application2)
}