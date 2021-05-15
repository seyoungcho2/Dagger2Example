package com.teamcarelab.daggerexample.example9_custom_scope


fun main() {
    val appComponent: AppComponent = DaggerAppComponent.create()

    val application1 = appComponent.getApplication()
    val application2 = appComponent.getApplication()

    println(application1 === application2)
}