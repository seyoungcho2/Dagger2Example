package com.teamcarelab.daggerexample.example10_subcomponent

import dagger.Subcomponent

@Subcomponent(modules = [FragmentModule::class])
interface FragmentSubComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): FragmentSubComponent
    }
}