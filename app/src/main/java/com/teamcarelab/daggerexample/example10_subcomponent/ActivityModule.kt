package com.teamcarelab.daggerexample.example10_subcomponent

import dagger.Module

@Module(subcomponents = [FragmentSubComponent::class])
class ActivityModule {}