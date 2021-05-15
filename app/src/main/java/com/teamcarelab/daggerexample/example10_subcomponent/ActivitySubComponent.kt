package com.teamcarelab.daggerexample.example10_subcomponent

import com.teamcarelab.daggerexample.example6_bindinstance.AppComponent
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@Subcomponent(modules = [ActivityModule::class])
interface ActivitySubComponent {

    @Subcomponent.Builder
    interface Builder {
        fun build(): ActivitySubComponent
    }
}