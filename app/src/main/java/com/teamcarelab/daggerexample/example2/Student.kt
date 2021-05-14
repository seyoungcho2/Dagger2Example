package com.teamcarelab.daggerexample.example2

import javax.inject.Inject

data class Student @Inject constructor(
    val name: String
)