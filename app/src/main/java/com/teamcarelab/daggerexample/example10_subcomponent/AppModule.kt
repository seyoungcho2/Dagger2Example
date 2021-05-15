package com.teamcarelab.daggerexample.example10_subcomponent

import com.teamcarelab.daggerexample.example9_custom_scope.scope.CustomScope
import dagger.Module
import dagger.Provides

@Module(subcomponents = [ActivitySubComponent::class])
class AppModule {}