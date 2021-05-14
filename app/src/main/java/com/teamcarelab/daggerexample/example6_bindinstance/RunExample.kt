package com.teamcarelab.daggerexample.example6_bindinstance


fun main() {
    val appComponent: AppComponent = DaggerAppComponent.builder().setAppName("aa").build()

    println(appComponent.getApplication().name)
}