package com.teamcarelab.daggerexample.example2_provision

import javax.inject.Inject

data class Student @Inject constructor(
    val name: String
)